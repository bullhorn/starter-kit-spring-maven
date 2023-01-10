package com.client.core.scheduledtasks;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.response.event.Event;
import com.bullhornsdk.data.model.response.event.GetEventsResponse;
import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.base.util.Utility;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import com.client.core.scheduledtasks.workers.EventProcessing;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Entry point for scheduled event handling.  Makes API call to BULLHORN to
 * retrieve events for the subscriptionName provided in the constructor, then hands off each event to
 * an instance of {@link com.client.core.scheduledtasks.workers.EventProcessing}.
 */
public class ScheduledEventProcessing implements Runnable {
	
	private final Logger log = LogManager.getLogger(getClass());
	
	private final String subscriptionName;
	
	private final BullhornData bullhornData;
	private final ApplicationSettings appSettings;
    private final EventWorkflowFactory eventWorkflowFactory;

	public ScheduledEventProcessing(String subscriptionName) {
		super();
		this.subscriptionName = subscriptionName;
		this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
		this.appSettings = AppContext.getApplicationContext().getBean("appSettings", ApplicationSettings.class);
		this.eventWorkflowFactory = AppContext.getApplicationContext().getBean(EventWorkflowFactory.class);
	}

    /**
     * Performs the event handling by making the {@link com.bullhorn.apiservice.ApiService#eventsGetEvents(String, String, int)}
     * call and processing each one individually.  Each event is handed off to an instance of {@link EventProcessing}
     */
	@Override
	public void run() {
		try {

			GetEventsResponse eventResponse = bullhornData.getEvents(subscriptionName, appSettings.getNumEventsPerBatch());

			if(eventResponse != null){
				List<Event> events = eventResponse.getEvents();
				List<CustomSubscriptionEvent> filteredEvents = removeEventsThrownByApiUserAndMergeDuplicateEventsAsStandardEvents(events, eventResponse.getRequestId());

				log.info("Running " + subscriptionName + "subscription subscriptionEvents = " + events.size()
						+ " filteredEvents = " + filteredEvents.size());

				handleEvents(filteredEvents);
			}else{
				log.info("Running " + subscriptionName + "subscription subscriptionEvents = " + 0
						+ " filteredEvents = " + 0);
			}
		} catch(RuntimeException e) {
			log.error("Unknown error occurred during " + subscriptionName + "event handling.", e);
		}
	}
	
	private void handleEvents(List<CustomSubscriptionEvent> subscriptionEvents) {
		if (subscriptionEvents.size() > 0) {

			ExecutorService exec = Executors.newFixedThreadPool(Utility.parseInteger(appSettings.getNumEventThreads()));


			for (CustomSubscriptionEvent event : subscriptionEvents) {
				EventProcessing processEvent = EventProcessing.instantiateRunnable(event, eventWorkflowFactory);

				try {
					exec.execute(processEvent);
				} catch (RuntimeException e) {
					log.error("Error occurred for entity " + event.getEntityName() + " #" +
							+event.getEntityId() + " " + event.getEntityEventType(), e);
				}
			}

			exec.shutdown();
			while (!exec.isTerminated()) {
			}
			
			exec = null;
		}
	}

	private List<CustomSubscriptionEvent> removeEventsThrownByApiUserAndMergeDuplicateEventsAsStandardEvents(List<Event> subscriptionEvents, Integer requestId) {

		List<CustomSubscriptionEvent> filteredEvents;
		String apiUserID = Integer.toString(appSettings.getApiUserID());
		Map<String, CustomSubscriptionEvent> eventMap = Maps.newHashMap();

		for (Event event : subscriptionEvents) {

			CustomSubscriptionEvent customSubscriptionEvent = CustomSubscriptionEvent.instantiateFromEvent(event, subscriptionName, requestId, false);

			if (customSubscriptionEvent.getUpdatingUserId() != null && !apiUserID.equalsIgnoreCase(customSubscriptionEvent.getUpdatingUserId().toString())) {

				String eventKey = customSubscriptionEvent.getEntityName() + customSubscriptionEvent.getEntityId() + customSubscriptionEvent.getEntityEventType() + customSubscriptionEvent.getUpdatingUserId();
				CustomSubscriptionEvent existingEvent = eventMap.get(eventKey);

				try {
					if (existingEvent != null){

						log.info("Duplicate event found");
						//event of the same type (Insert/update), for the same entity (placement 123), created by the same corporate user already exists - don't create a new one but merge them)
						List<String> allUpdatedProperties = Lists.newArrayList();

						allUpdatedProperties.addAll(customSubscriptionEvent.getUpdatedProperties());
						allUpdatedProperties.addAll(existingEvent.getUpdatedProperties());

						customSubscriptionEvent.setUpdatedProperties(Sets.newHashSet(allUpdatedProperties));
						customSubscriptionEvent.setError(existingEvent.isError());

						eventMap.put(eventKey, customSubscriptionEvent);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}

				eventMap.put(eventKey, customSubscriptionEvent);
			}
		}

		filteredEvents = Lists.newArrayList(eventMap.values());
		return filteredEvents;
	}

}
