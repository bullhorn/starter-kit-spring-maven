package com.client.core.scheduledtasks;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.response.event.Event;
import com.bullhornsdk.data.model.response.event.GetEventsResponse;
import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.base.util.Utility;
import com.client.core.scheduledtasks.dao.BullhornLogDAO;
import com.client.core.scheduledtasks.model.helper.StandardEvent;
import com.client.core.scheduledtasks.workers.EventProcessing;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;

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
	
	private final Logger log = Logger.getLogger(getClass());
	
	private final String subscriptionName;
	
	private final BullhornData bullhornData;
	private final ApplicationSettings appSettings;
	private final BullhornLogDAO bullhornLogDAO;

	public ScheduledEventProcessing(String subscriptionName) {
		super();
		this.subscriptionName = subscriptionName;
		this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
		this.appSettings = AppContext.getApplicationContext().getBean("appSettings", ApplicationSettings.class);
		this.bullhornLogDAO = AppContext.getApplicationContext().getBean(BullhornLogDAO.class);
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
				List<StandardEvent> filteredEvents = removeEventsThrownByApiUserAndMergeDuplicateEventsAsStandardEvents(events, eventResponse.getRequestId());

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
	
	private void handleEvents(List<StandardEvent> subscriptionEvents) {
		if (subscriptionEvents.size() > 0) {

			ExecutorService exec = Executors.newFixedThreadPool(Utility.parseInteger(appSettings.getNumEventThreads()));


			for (StandardEvent event : subscriptionEvents) {
				EventProcessing processEvent = EventProcessing.instantiateRunnable(
						Integer.parseInt(appSettings.getCorporationID()), bullhornLogDAO, event);
				try {
					exec.execute(processEvent);
				} catch (RuntimeException e) {
					log.error("Error occurred for entity " + event.getEntityName() + " #" +
							+event.getEntityId() + " " + event.getEventType(), e);
				}
			}

			exec.shutdown();
			while (!exec.isTerminated()) {
			}
			
			exec = null;
		}
	}

	private List<StandardEvent> removeEventsThrownByApiUserAndMergeDuplicateEventsAsStandardEvents(List<Event> subscriptionEvents, Integer requestId) {

		List<StandardEvent> filteredEvents;
		String apiUserID = Integer.toString(appSettings.getApiUserID());
		Map<String, StandardEvent> eventMap = Maps.newHashMap();

		for (Event event : subscriptionEvents) {

			StandardEvent standardEvent = StandardEvent.instantiateFromEvent(event, subscriptionName, requestId, false);

			if (standardEvent.getUpdatingUserId() != null && !apiUserID.equalsIgnoreCase(standardEvent.getUpdatingUserId().toString())) {

				String eventKey = standardEvent.getEntityName() + standardEvent.getEntityId() + standardEvent.getEventType() + standardEvent.getUpdatingUserId();
				StandardEvent existingEvent = eventMap.get(eventKey);

				try {
					if (existingEvent != null){

						log.info("Duplicate event found");
						//event of the same type (Insert/update), for the same entity (placement 123), created by the same corporate user already exists - don't create a new one but merge them)
						List<String> allUpdatedProperties = Lists.newArrayList();

						allUpdatedProperties.addAll(standardEvent.getUpdatedProperties());
						allUpdatedProperties.addAll(existingEvent.getUpdatedProperties());

						standardEvent.setUpdatedProperties(allUpdatedProperties);
						standardEvent.setError(existingEvent.isError());

						eventMap.put(eventKey, standardEvent);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}

				eventMap.put(eventKey, standardEvent);
			}
		}

		filteredEvents = Lists.newArrayList(eventMap.values());
		return filteredEvents;
	}

}
