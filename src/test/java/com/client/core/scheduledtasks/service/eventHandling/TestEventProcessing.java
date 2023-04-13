package com.client.core.scheduledtasks.service.eventHandling;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;

import com.client.BaseTest;
import com.client.ApplicationSettings;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workers.EventProcessing;
import com.google.common.collect.Sets;

@Commit
public class TestEventProcessing extends BaseTest {

	@Autowired
	private ApplicationSettings appSettings;

	@Autowired
	private EventWorkflowFactory eventWorkflowFactory;

	private List<CustomSubscriptionEvent> subscriptionEvents;
	private String subscriptionName;
	private int updatingUserID;
	private int corporationID;

	public TestEventProcessing() {
		super();
	}

	@BeforeEach
	public void populateEvents() {

		subscriptionName = "TestSubscription";
		updatingUserID = getTestEntities().getCorporateUserId();
		corporationID = getTestEntities().getClientCorporationId();

		List<String> eventTypes = createEventTypes();
		Map<String, Integer>  entityTypes = createEntityTypes();
		subscriptionEvents = new ArrayList<CustomSubscriptionEvent>();

		int eventID = 1;
		int requestID = 1;

		for (Map.Entry<String, Integer> entity : entityTypes.entrySet()) {
			for (String eventType : eventTypes) {
				eventID++;
				requestID++;
				CustomSubscriptionEvent event = instantiateTestEvent(eventType, entity.getKey(), entity.getValue(), null, "" + eventID, ""
						+ requestID);
				subscriptionEvents.add(event);
			}
		}
	}

	private Map<String, Integer> createEntityTypes() {

		Map<String, Integer> entityTypes = new LinkedHashMap<String, Integer>();
		entityTypes.put("Appointment", getTestEntities().getAppointmentId());
		entityTypes.put("Candidate", getTestEntities().getCandidateId());
		entityTypes.put("CandidateEducation", getTestEntities().getCandidateEducationId());
		entityTypes.put("CandidateWorkHistory", getTestEntities().getCandidateWorkHistoryId());
		entityTypes.put("CandidateReference", getTestEntities().getCandidateReferenceId());
		entityTypes.put("ClientContact", getTestEntities().getClientContactId());
		entityTypes.put("ClientCorporation", getTestEntities().getClientCorporationId());
		entityTypes.put("CorporateUser", getTestEntities().getCorporateUserId());
		entityTypes.put("JobOrder", getTestEntities().getJobOrderId());
		entityTypes.put("JobSubmission", getTestEntities().getJobSubmissionId());
		entityTypes.put("Note", getTestEntities().getNoteId());
		entityTypes.put("Placement", getTestEntities().getPlacementId());
		entityTypes.put("PlacementChangeRequest", getTestEntities().getPlacementChangeRequestId());
		entityTypes.put("PlacementCommission", getTestEntities().getPlacementCommissionId());
		entityTypes.put("Sendout", getTestEntities().getSendoutId());
		entityTypes.put("Task", getTestEntities().getTaskId());
		return entityTypes;
	}

	private List<String> createEventTypes() {
		List<String> eventTypes = new ArrayList<String>();
		eventTypes.add(EventType.DELETED.value());
		eventTypes.add(EventType.INSERTED.value());
		eventTypes.add(EventType.UPDATED.value());
		return eventTypes;
	}

	private CustomSubscriptionEvent instantiateTestEvent(String eventType, String entityType, int entityID, String[] updatedProperties,
														 String eventId, String requestID) {
		CustomSubscriptionEvent se = new CustomSubscriptionEvent();
		se.setEventType(eventType);
		se.setEventId(eventId);
		se.setRequestId(Integer.parseInt(requestID));
		se.setEntityName(entityType);
		se.setEntityId(entityID);

		if(updatedProperties != null) {
			se.setUpdatedProperties(Sets.newHashSet(updatedProperties));
		}

		se.setEventTimestamp(DateTime.now());
		se.setSubscriptionName(subscriptionName);
		se.setError(false);
		se.setUpdatingUserId(updatingUserID);

		return se;
	}

	@Test
	public void testSetup() {

		Assertions.assertEquals(48, subscriptionEvents.size(), "Not set up correctly" + subscriptionEvents.size());
	}

	@Test
	public void testProcessEvents() {
		boolean error = false;
		// configurable based on # threads to process concurrently
		// set to 1 in stax-web numEventThreads if single threaded processing is required
		ExecutorService exec = Executors.newFixedThreadPool(appSettings.numEventThreads());
		// loop through each event
		for (CustomSubscriptionEvent event : subscriptionEvents) {
			error = false;
			EventProcessing processEvent = EventProcessing.instantiateRunnable(event, eventWorkflowFactory);
			// send to exec service
			try {
				exec.execute(processEvent);
			} catch (Exception e) {
				error = true;

			}

			Assertions.assertFalse(error,"Error with entity: " + event.getEntityName() + ", event type: " + event.getEntityEventType());
		}

		// shutdown pool, wait until it's done
		exec.shutdown();
		while (!exec.isTerminated()) {
		}
		// null it out
		exec = null;

	}

}
