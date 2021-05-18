package com.client.core.scheduledtasks;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.response.event.Event;
import com.bullhornsdk.data.model.response.event.GetEventsResponse;
import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.base.util.Utility;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.service.EventListWorkflowFactory;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import com.client.core.scheduledtasks.workers.EventListProcessing;
import com.client.core.scheduledtasks.workers.EventProcessing;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Entry point for scheduled event list handling.  Makes API call to BULLHORN to
 * retrieve events for the subscriptionName provided in the constructor, then hands off events to
 * an instance of {@link EventListProcessing}.
 */
public class ScheduledEventListProcessing implements Runnable {

    private final Logger log = Logger.getLogger(getClass());

    private final String subscriptionName;

    private final BullhornData bullhornData;
    private final ApplicationSettings appSettings;
    private final EventListWorkflowFactory eventListWorkflowFactory;

    public ScheduledEventListProcessing(String subscriptionName) {
        super();
        this.subscriptionName = subscriptionName;
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        this.appSettings = AppContext.getApplicationContext().getBean("appSettings", ApplicationSettings.class);
        this.eventListWorkflowFactory = AppContext.getApplicationContext().getBean(EventListWorkflowFactory.class);
    }

    /**
     * Performs the event list handling by making the {@link com.bullhornsdk.data.api#getEvents(String, String, int)}
     * call and processing all listed events. Each event list is handed off to an instance of {@link EventListProcessing}
     */
    @Override
    public void run() {
        try {

            List<CustomSubscriptionEvent> filteredEvents = getCustomSubscriptionEvents();

            if (filteredEvents.size() > 0) {
                log.info("Running " + subscriptionName + " subscription filteredEvents = " + filteredEvents.size());

                handleEvents(filteredEvents);
            } else {
                log.info("Running " + subscriptionName + " subscription filteredEvents = " + 0);
            }

        } catch (RuntimeException e) {
            log.error("Unknown error occurred during " + subscriptionName + " event handling.", e);
        }
    }

    private List<CustomSubscriptionEvent> getCustomSubscriptionEvents() {
        List<CustomSubscriptionEvent> customSubscriptionEvents = Lists.newArrayList();

        List<GetEventsResponse> eventsResponses = getEventsResponseList();

        if (eventsResponses.size() > 0) {
            return removeEventsThrownByApiUserAndMergeDuplicateEventsAsStandardEvents(eventsResponses);
        }

        return customSubscriptionEvents;
    }

    private List<GetEventsResponse> getEventsResponseList() {
        List<GetEventsResponse> eventsResponses = Lists.newArrayList();

        GetEventsResponse eventsResponse = getEventsBatch();

        while (eventsResponse != null) {
            eventsResponses.add(eventsResponse);

            eventsResponse = getEventsBatch();
        }

        return eventsResponses;
    }

    private GetEventsResponse getEventsBatch() {
        return bullhornData.getEvents(subscriptionName, appSettings.getNumEventsPerBatch());
    }

    private void handleEvents(List<CustomSubscriptionEvent> subscriptionEvents) {
        if (subscriptionEvents.size() > 0) {

            ExecutorService exec = Executors.newFixedThreadPool(Utility.parseInteger(appSettings.getNumEventListThreads()));

            Map<String, List<CustomSubscriptionEvent>> eventsByEntity = subscriptionEvents.stream()
                    .collect(Collectors.groupingBy(CustomSubscriptionEvent::getEntityName));


            for (Map.Entry<String, List<CustomSubscriptionEvent>> entry : eventsByEntity.entrySet()) {
                EventListProcessing processEventList = EventListProcessing.instantiateRunnable(entry.getKey(), entry.getValue(), eventListWorkflowFactory);

                try {
                    exec.execute(processEventList);
                } catch (RuntimeException e) {
                    log.error("Error occurred in " + entry.getKey() + " entity list events processing", e);
                }
            }

            exec.shutdown();
            while (!exec.isTerminated()) {
            }

            exec = null;
        }
    }

    private List<CustomSubscriptionEvent> removeEventsThrownByApiUserAndMergeDuplicateEventsAsStandardEvents(List<GetEventsResponse> eventsResponses) {
        List<CustomSubscriptionEvent> filteredEvents;
        String apiUserID = Integer.toString(appSettings.getApiUserID());
        Map<String, CustomSubscriptionEvent> eventMap = Maps.newHashMap();

        for (GetEventsResponse eventResponse : eventsResponses) {
            List<Event> events = eventResponse.getEvents();

            for (Event event : events) {

                CustomSubscriptionEvent customSubscriptionEvent = CustomSubscriptionEvent.instantiateFromEvent(event, subscriptionName, eventResponse.getRequestId(), false);

                if (customSubscriptionEvent.getUpdatingUserId() != null && !apiUserID.equalsIgnoreCase(customSubscriptionEvent.getUpdatingUserId().toString())) {

                    String eventKey = customSubscriptionEvent.getEntityName() + customSubscriptionEvent.getEntityId() + customSubscriptionEvent.getEntityEventType() + customSubscriptionEvent.getUpdatingUserId();
                    CustomSubscriptionEvent existingEvent = eventMap.get(eventKey);

                    try {
                        if (existingEvent != null) {
                            //event of the same type (Insert/update), for the same entity (placement 123), created by the same corporate user already exists - don't create a new one but merge them)
                            List<String> allUpdatedProperties = Lists.newArrayList();

                            allUpdatedProperties.addAll(customSubscriptionEvent.getUpdatedProperties());
                            allUpdatedProperties.addAll(existingEvent.getUpdatedProperties());

                            customSubscriptionEvent.setUpdatedProperties(Sets.newHashSet(allUpdatedProperties));
                            customSubscriptionEvent.setError(existingEvent.isError());

                            eventMap.put(eventKey, customSubscriptionEvent);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    eventMap.put(eventKey, customSubscriptionEvent);
                }
            }
        }

        filteredEvents = Lists.newArrayList(eventMap.values());
        return filteredEvents;
    }
}
