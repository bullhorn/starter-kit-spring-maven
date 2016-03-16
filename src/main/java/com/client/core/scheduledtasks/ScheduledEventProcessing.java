package com.client.core.scheduledtasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;

import com.client.core.AppContext;
import com.client.core.ApplicationSettings;
import com.client.core.base.util.Utility;
import com.client.core.scheduledtasks.dao.BullhornLogDAO;
import com.client.core.scheduledtasks.workers.EventProcessing;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.soap.service.BullhornAPI;

/**
 * Entry point for scheduled event handling.  Makes API call to BULLHORN to
 * retrieve events for the subscriptionName provided in the constructor, then hands off each event to
 * an instance of {@link com.client.core.scheduledtasks.workers.EventProcessing}.
 */
public class ScheduledEventProcessing implements Runnable {
	
	private final Logger log = Logger.getLogger(getClass());
	
	private final String subscriptionName;
	
	private final BullhornAPI bullhornApi;
	private final ApplicationSettings appSettings;
	private final BullhornLogDAO bullhornLogDAO;

	public ScheduledEventProcessing(String subscriptionName) {
		super();
		this.subscriptionName = subscriptionName;
		this.bullhornApi = AppContext.getApplicationContext().getBean(BullhornAPI.class);
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
			List<SubscriptionEvent> events = bullhornApi.getSubscriptionEvents(100, subscriptionName);
			List<SubscriptionEvent> filteredEvents = removeEventsThrownByApiUserAndMergeDuplicateEvents(events);
			
			log.info("Running " + subscriptionName + "subscription subscriptionEvents = " + events.size()
					+ " filteredEvents = " + filteredEvents.size());
			
			handleEvents(filteredEvents);
		} catch(RuntimeException e) {
			log.error("Unknown error occurred during " + subscriptionName + "event handling.", e);
		}
	}
	
	private void handleEvents(List<SubscriptionEvent> subscriptionEvents) {
		if (subscriptionEvents.size() > 0) {
			ExecutorService exec = Executors.newFixedThreadPool(Utility.parseInteger(appSettings.getNumEventThreads()));

			for (SubscriptionEvent event : subscriptionEvents) {
				EventProcessing processEvent = EventProcessing.instantiateRunnable(
						bullhornApi.getCorporationID(), bullhornLogDAO, event);
				try {
					exec.execute(processEvent);
				} catch (RuntimeException e) {
					log.error("Error occurred for entity "+event.getEntityType()+" #"+
							+event.getEntityID()+" "+event.getEventType(), e);
				}
			}

			exec.shutdown();
			while (!exec.isTerminated()) {
			}
			
			exec = null;
		}
	}

	private List<SubscriptionEvent> removeEventsThrownByApiUserAndMergeDuplicateEvents(List<SubscriptionEvent> subscriptionEvents) {
		List<SubscriptionEvent> filteredEvents = new ArrayList<SubscriptionEvent>();
		int apiUserID = appSettings.getApiUserID();
		Map<String, SubscriptionEvent> eventMap = new HashMap<String, SubscriptionEvent>();
		for (SubscriptionEvent event : subscriptionEvents) {
			if (event.getUpdatingUserID() != apiUserID) {
				String eventKey = event.getEntityType()+event.getEntityID()+event.getEventType()+event.getUpdatingUserID();
				SubscriptionEvent existingEvent = eventMap.get(eventKey);
				try {
					if (existingEvent != null){
						log.info("Duplicate event found");
						//event of the same type (Insert/update), for the same entity (placement 123), created by the same corporate user already exists - don't create a new one but merge them)
						String[] allUpdatedProperties = (String[]) ArrayUtils.addAll(event.getUpdatedProperties(), existingEvent.getUpdatedProperties());
						event.setUpdatedProperties(allUpdatedProperties);
					}
				}
				catch (Exception e){
					e.printStackTrace();
				}
				eventMap.put(eventKey, event);

			}
		}
		filteredEvents = new ArrayList<SubscriptionEvent>(eventMap.values());
		return filteredEvents;
	}

}
