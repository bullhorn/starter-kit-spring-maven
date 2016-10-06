package com.client.core.scheduledtasks.workers;

import java.util.List;

import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;

import com.bullhorn.entity.ApiEntityName;
import com.client.core.AppContext;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.scheduledtasks.dao.BullhornLogDAO;
import com.client.core.scheduledtasks.model.log.BullhornLog;
import com.client.core.base.util.StackTraceUtil;
import com.client.core.base.workflow.node.Node;
import com.client.core.scheduledtasks.workflow.traversing.impl.AppointmentEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEducationEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateReferenceEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateWorkHistoryEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientContactEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientCorporationEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CorporateUserEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobSubmissionEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.NoteEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementChangeRequestEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementCommissionEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.SendoutEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.TaskEventTraverser;

/**
 * Handles one subscription event by passing it through the proper workflow for the entity that had an event thrown. Also
 * handles when errors occur during event handling by inserting records into a MySQL cloud database
 * and then reprocessing them the next time we retrieve events (for a maximum of 4 tries)
 */
public class EventProcessing implements Runnable {
	private final Logger log = Logger.getLogger(getClass());
	
	private final BullhornLogDAO bullhornLogDAO;
	private final CustomSubscriptionEvent event;
	private final Integer corporationID;
	private final ApplicationContext appContext;
	
	private EventProcessing(Integer corporationID, BullhornLogDAO bullhornLogDAO, CustomSubscriptionEvent event) {
		super();
		this.corporationID = corporationID;
		this.bullhornLogDAO = bullhornLogDAO;
		this.event = event;
		this.appContext = AppContext.getApplicationContext();
	}

	public static EventProcessing instantiateRunnable(Integer corporationID, BullhornLogDAO bullhornLogDAO, CustomSubscriptionEvent event) {
		return new EventProcessing(corporationID, bullhornLogDAO, event);
	}

    /**
     * Performs the actual handling of a single event by parsing out the kind of event from the {@link SubscriptionEvent} provided via
     * the {@link EventProcessing#(Integer, BullhornLogDAO, SubscriptionEvent)} constructor and handing the event off
     * to the proper workflow.
     */
	@Override
	public void run() {
		BullhornLog bhlog = BullhornLog.instantiateLog(event, corporationID);

		try {
			doAction();

			if (event.isError()) {
				try {
					bullhornLogDAO.updateLog(bhlog);
				} catch (Exception e) {
					log.error("Error updating event to successful", e);
				}
			}
		} catch (Exception e) {
			log.error("Event " + event.getEventId() + " resulted in error:" + e.getMessage(), e);
			logError(bhlog, e);
		}
	}
	
	private void doAction() throws Exception {
		if (isAppointmentEvent()) {
			handleAppointmentEvent();
		} else if (isCandidateEvent()) {
			handleCandidateEvent();
		} else if (isCandidateEducationEvent()) {
			handleCandidateEducationEvent();
		} else if (isCandidateWorkHistoryEvent()) {
			handleCandidateWorkHistoryEvent();
		} else if (isCandidateReferenceEvent()) {
			handleCandidateReferenceEvent();
		} else if (isClientContactEvent()) {
			handleClientContactEvent();
		} else if (isClientCorporationEvent()) {
			handleClientCorporationEvent();
		} else if (isCorporateUserEvent()) {
			handleCorporateUserEvent();
		} else if (isJobEvent()) {
			handleJobEvent();
		} else if (isJobSubmissionEvent()) {
			handleJobSubmissionEvent();
		} else if (isNoteEvent()) {
			handleNoteEvent();
		} else if (isPlacementEvent()) {
			handlePlacementEvent();
		} else if (isPlacementChangeRequestEvent()) {
			handlePlacementChangeRequestEvent();
		} else if (isPlacementCommissionEvent()) {
			handlePlacementCommissionEvent();
		} else if (isSendoutEvent()) {
			handleSendoutEvent();
		} else if (isTaskEvent()) {
			handleTaskEvent();
		}
	}
	
	private void handleAppointmentEvent() {
		@SuppressWarnings("unchecked")
		Node<AppointmentEventTraverser> appointmentScheduledTaskWorkFlow = (Node<AppointmentEventTraverser>) appContext
				.getBean("appointmentScheduledTaskWorkFlow");

		AppointmentEventTraverser traverser = new AppointmentEventTraverser(event);
		appointmentScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isAppointmentEvent() {
		return entityIsOfType(ApiEntityName.APPOINTMENT.value());
	}

	private void handleCandidateEvent() {
		@SuppressWarnings("unchecked")
		Node<CandidateEventTraverser> candidateScheduledTaskWorkFlow = (Node<CandidateEventTraverser>) appContext
				.getBean("candidateScheduledTaskWorkFlow");

		CandidateEventTraverser traverser = new CandidateEventTraverser(event);
		candidateScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isCandidateEvent() {
		return entityIsOfType(ApiEntityName.CANDIDATE.value());
	}

	private void handleCandidateReferenceEvent() {
		@SuppressWarnings("unchecked")
		Node<CandidateReferenceEventTraverser> candidateReferenceScheduledTaskWorkFlow = (Node<CandidateReferenceEventTraverser>) appContext
				.getBean("candidateReferenceScheduledTaskWorkFlow");

		CandidateReferenceEventTraverser traverser = new CandidateReferenceEventTraverser(event);
		candidateReferenceScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isCandidateReferenceEvent() {
		return entityIsOfType(ApiEntityName.CANDIDATE_REFERENCE.value());
	}

	private void handleCandidateWorkHistoryEvent() {
		@SuppressWarnings("unchecked")
		Node<CandidateWorkHistoryEventTraverser> candidateWorkHistoryScheduledTaskWorkFlow = (Node<CandidateWorkHistoryEventTraverser>) appContext
				.getBean("candidateWorkHistoryScheduledTaskWorkFlow");

		CandidateWorkHistoryEventTraverser traverser = new CandidateWorkHistoryEventTraverser(event);
		candidateWorkHistoryScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isCandidateWorkHistoryEvent() {
		return entityIsOfType(ApiEntityName.CANDIDATE_WORK_HISTORY.value());
	}

	private void handleCandidateEducationEvent() {
		@SuppressWarnings("unchecked")
		Node<CandidateEducationEventTraverser> candidateEducationScheduledTaskWorkFlow = (Node<CandidateEducationEventTraverser>) appContext
				.getBean("candidateEducationScheduledTaskWorkFlow");

		CandidateEducationEventTraverser traverser = new CandidateEducationEventTraverser(event);
		candidateEducationScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isCandidateEducationEvent() {
		return entityIsOfType(ApiEntityName.CANDIDATE_EDUCATION.value());
	}

	private void handleClientContactEvent() {
		@SuppressWarnings("unchecked")
		Node<ClientContactEventTraverser> clientContactScheduledTaskWorkFlow = (Node<ClientContactEventTraverser>) appContext
				.getBean("clientContactScheduledTaskWorkFlow");

		ClientContactEventTraverser traverser = new ClientContactEventTraverser(event);
		clientContactScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isClientContactEvent() {
		return entityIsOfType(ApiEntityName.CLIENT_CONTACT.value());
	}

	private void handleClientCorporationEvent() {
		@SuppressWarnings("unchecked")
		Node<ClientCorporationEventTraverser> clientCorporationScheduledTaskWorkFlow = (Node<ClientCorporationEventTraverser>) appContext
				.getBean("clientCorporationScheduledTaskWorkFlow");

		ClientCorporationEventTraverser traverser = new ClientCorporationEventTraverser(event);
		clientCorporationScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isClientCorporationEvent() {
		return entityIsOfType(ApiEntityName.CLIENT_CORPORATION.value());
	}

	private void handleCorporateUserEvent() {
		@SuppressWarnings("unchecked")
		Node<CorporateUserEventTraverser> corporateUserScheduledTaskWorkFlow = (Node<CorporateUserEventTraverser>) appContext
				.getBean("corporateUserScheduledTaskWorkFlow");

		CorporateUserEventTraverser traverser = new CorporateUserEventTraverser(event);
		corporateUserScheduledTaskWorkFlow.start(traverser);

	}

	private boolean isCorporateUserEvent() {
		return entityIsOfType(ApiEntityName.CORPORATE_USER.value());
	}

	private void handleJobEvent() {
		@SuppressWarnings("unchecked")
		Node<JobEventTraverser> jobScheduledTaskWorkFlow = (Node<JobEventTraverser>) appContext.getBean("jobScheduledTaskWorkFlow");

		JobEventTraverser traverser = new JobEventTraverser(event);
		jobScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isJobEvent() {
		return entityIsOfType(ApiEntityName.JOB_ORDER.value());
	}

	private void handleJobSubmissionEvent() {
		@SuppressWarnings("unchecked")
		Node<JobSubmissionEventTraverser> jobSubmissionScheduledTaskWorkFlow = (Node<JobSubmissionEventTraverser>) appContext
				.getBean("jobSubmissionScheduledTaskWorkFlow");

		JobSubmissionEventTraverser jobSubmissionEventTraverser = new JobSubmissionEventTraverser(event);
		jobSubmissionScheduledTaskWorkFlow.start(jobSubmissionEventTraverser);
	}

	private boolean isJobSubmissionEvent() {
		return entityIsOfType(ApiEntityName.JOB_SUBMISSION.value());
	}

	private void handleNoteEvent() {
		@SuppressWarnings("unchecked")
		Node<NoteEventTraverser> noteScheduledTaskWorkFlow = (Node<NoteEventTraverser>) appContext.getBean("noteScheduledTaskWorkFlow");

		NoteEventTraverser noteEventTraverser = new NoteEventTraverser(event);
		noteScheduledTaskWorkFlow.start(noteEventTraverser);
	}

	private boolean isNoteEvent() {
		return entityIsOfType(ApiEntityName.NOTE.value());
	}

	private void handlePlacementEvent() {
		@SuppressWarnings("unchecked")
		Node<PlacementEventTraverser> placementScheduledTaskWorkFlow = (Node<PlacementEventTraverser>) appContext
				.getBean("placementScheduledTaskWorkFlow");

		PlacementEventTraverser placementEventTraverser = new PlacementEventTraverser(event);
		placementScheduledTaskWorkFlow.start(placementEventTraverser);
	}

	private boolean isPlacementEvent() {
		return entityIsOfType(ApiEntityName.PLACEMENT.value());
	}

	/**
	 * Passes the PlacementChangeRequestEventTraverser through the placementChangeRequestScheduledTaskWorkFlow, see
	 * scheduledtasks-workflow.xml for details on work flow. One Traverser instantiated per event.
	 * 
	 * Actual logic is handled in Service class (see Service folder).
	 * 
	 */
	private void handlePlacementChangeRequestEvent() {
		@SuppressWarnings("unchecked")
		Node<PlacementChangeRequestEventTraverser> placementChangeRequestScheduledTaskWorkFlow = (Node<PlacementChangeRequestEventTraverser>) appContext
				.getBean("placementChangeRequestScheduledTaskWorkFlow");

		PlacementChangeRequestEventTraverser traverser = new PlacementChangeRequestEventTraverser(event);
		placementChangeRequestScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isPlacementChangeRequestEvent() {
		return entityIsOfType(ApiEntityName.PLACEMENT_CHANGE_REQUEST.value());
	}

	/**
	 * Passes the PlacementCommissionEventTraverser through the placementCommissionScheduledTaskWorkFlow, see
	 * scheduledtasks-workflow.xml for details on work flow. One Traverser instantiated per event.
	 * 
	 * Actual logic is handled in Service class (see Service folder).
	 * 
	 */
	private void handlePlacementCommissionEvent() {
		@SuppressWarnings("unchecked")
		Node<PlacementCommissionEventTraverser> placementCommissionScheduledTaskWorkFlow = (Node<PlacementCommissionEventTraverser>) appContext
				.getBean("placementCommissionScheduledTaskWorkFlow");

		PlacementCommissionEventTraverser traverser = new PlacementCommissionEventTraverser(event);
		placementCommissionScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isPlacementCommissionEvent() {
		return entityIsOfType(ApiEntityName.PLACEMENT_COMMISSION.value());
	}

	/**
	 * Passes the SendoutEventTraverser through the sendoutScheduledTaskWorkFlow, see scheduledtasks-workflow.xml for details on work
	 * flow. One Traverser instantiated per event.
	 * 
	 * Actual logic is handled in Service class (see Service folder).
	 * 
	 */
	private void handleSendoutEvent() {
		@SuppressWarnings("unchecked")
		Node<SendoutEventTraverser> sendoutScheduledTaskWorkFlow = (Node<SendoutEventTraverser>) appContext.getBean("sendoutScheduledTaskWorkFlow");

		SendoutEventTraverser traverser = new SendoutEventTraverser(event);
		sendoutScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isSendoutEvent() {
		return entityIsOfType(ApiEntityName.SENDOUT.value());
	}

	/**
	 * Passes the TaskEventTraverser through the taskScheduledTaskWorkFlow, see scheduledtasks-workflow.xml for details on work
	 * flow. One Traverser instantiated per event.
	 * 
	 * Actual logic is handled in Service class (see Service folder).
	 * 
	 */
	private void handleTaskEvent() {
		@SuppressWarnings("unchecked")
		Node<TaskEventTraverser> taskScheduledTaskWorkFlow = (Node<TaskEventTraverser>) appContext.getBean("taskScheduledTaskWorkFlow");

		TaskEventTraverser traverser = new TaskEventTraverser(event);
		taskScheduledTaskWorkFlow.start(traverser);
	}

	private boolean isTaskEvent() {
		return entityIsOfType(ApiEntityName.TASK.value());
	}

	private boolean entityIsOfType(String entityTypeToCheck) {
		String entityType = event.getEntityName();
		
		if (entityTypeToCheck.equalsIgnoreCase(entityType)) {
			return true;
		}
		
		return false;
	}

	private void logError(BullhornLog bhlog, Exception e) {
		String stackTrace = StackTraceUtil.getCustomStackTrace(e);
		bhlog.setError(stackTrace);
		bhlog.setStatus("error");

		String queryWhere = "corporationID = " + bhlog.getCorporationID() + " AND subscriptionID = '" + bhlog.getSubscriptionID()
				+ "'" + " AND eventID = '" + bhlog.getEventID() + "'";
		try {
			List<BullhornLog> selectLog = bullhornLogDAO.selectWhere(queryWhere);
			
			if (selectLog.size() > 0) {
				bullhornLogDAO.updateLog(bhlog);
			} else {
				bullhornLogDAO.insertLog(bhlog);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
