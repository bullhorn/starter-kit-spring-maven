package com.client.core.scheduledtasks.workers;

import com.bullhorn.entity.ApiEntityName;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.util.StackTraceUtil;
import com.client.core.scheduledtasks.dao.BullhornLogDAO;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.log.BullhornLog;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import com.client.core.soap.model.SubscriptionEvent;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Handles one subscription event by passing it through the proper workflow for the entity that had an event thrown. Also
 * handles when errors occur during event handling by inserting records into a MySQL cloud database
 * and then reprocessing them the next time we retrieve events (for a maximum of 4 tries)
 */
public class EventProcessing implements Runnable {
    private final Logger log = Logger.getLogger(getClass());

    private final EventWorkflowFactory eventWorkflowFactory;
    private final BullhornLogDAO bullhornLogDAO;
    private final CustomSubscriptionEvent event;
    private final Integer corporationID;

    private EventProcessing(Integer corporationID, BullhornLogDAO bullhornLogDAO, CustomSubscriptionEvent event, EventWorkflowFactory eventWorkflowFactory) {
        super();
        this.eventWorkflowFactory = eventWorkflowFactory;
        this.bullhornLogDAO = bullhornLogDAO;
        this.event = event;
        this.corporationID = corporationID;
    }

    public static EventProcessing instantiateRunnable(Integer corporationID, BullhornLogDAO bullhornLogDAO, CustomSubscriptionEvent event, EventWorkflowFactory eventWorkflowFactory) {
        return new EventProcessing(corporationID, bullhornLogDAO, event, eventWorkflowFactory);
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
            eventWorkflowFactory.execute(Appointment.class, event);
        } else if (isCandidateEvent()) {
            eventWorkflowFactory.execute(Candidate.class, event);
        } else if (isCandidateEducationEvent()) {
            eventWorkflowFactory.execute(CandidateEducation.class, event);
        } else if (isCandidateWorkHistoryEvent()) {
            eventWorkflowFactory.execute(CandidateWorkHistory.class, event);
        } else if (isCandidateReferenceEvent()) {
            eventWorkflowFactory.execute(CandidateReference.class, event);
        } else if (isClientContactEvent()) {
            eventWorkflowFactory.execute(ClientContact.class, event);
        } else if (isClientCorporationEvent()) {
            eventWorkflowFactory.execute(ClientCorporation.class, event);
        } else if (isCorporateUserEvent()) {
            eventWorkflowFactory.execute(CorporateUser.class, event);
        } else if (isJobEvent()) {
            eventWorkflowFactory.execute(JobOrder.class, event);
        } else if (isJobSubmissionEvent()) {
            eventWorkflowFactory.execute(JobSubmission.class, event);
        } else if (isLeadEvent()) {
            eventWorkflowFactory.execute(Lead.class, event);
        } else if (isNoteEvent()) {
            eventWorkflowFactory.execute(Note.class, event);
        } else if (isOpportunityEvent()) {
            eventWorkflowFactory.execute(Opportunity.class, event);
        } else if (isPlacementEvent()) {
            eventWorkflowFactory.execute(Placement.class, event);
        } else if (isPlacementChangeRequestEvent()) {
            eventWorkflowFactory.execute(PlacementChangeRequest.class, event);
        } else if (isPlacementCommissionEvent()) {
            eventWorkflowFactory.execute(PlacementCommission.class, event);
        } else if (isSendoutEvent()) {
            eventWorkflowFactory.execute(Sendout.class, event);
        } else if (isTaskEvent()) {
            eventWorkflowFactory.execute(Task.class, event);
        } else if (isCandidateCertificationEvent()) {
            eventWorkflowFactory.execute(CandidateCertification.class, event);
        } else if (isCandidateCertificationRequirementEvent()) {
            eventWorkflowFactory.execute(CandidateCertificationRequirement.class, event);
        } else if (isJobSubmissionCertificationRequirementEvent()) {
            eventWorkflowFactory.execute(JobSubmissionCertificationRequirement.class, event);
        } else if (isPlacementCertificationEvent()) {
            eventWorkflowFactory.execute(PlacementCertification.class, event);
        }
    }

    private boolean isAppointmentEvent() {
        return entityIsOfType(ApiEntityName.APPOINTMENT.value());
    }

    private boolean isCandidateEvent() {
        return entityIsOfType(ApiEntityName.CANDIDATE.value());
    }

    private boolean isCandidateReferenceEvent() {
        return entityIsOfType(ApiEntityName.CANDIDATE_REFERENCE.value());
    }

    private boolean isCandidateWorkHistoryEvent() {
        return entityIsOfType(ApiEntityName.CANDIDATE_WORK_HISTORY.value());
    }

    private boolean isCandidateEducationEvent() {
        return entityIsOfType(ApiEntityName.CANDIDATE_EDUCATION.value());
    }

    private boolean isClientContactEvent() {
        return entityIsOfType(ApiEntityName.CLIENT_CONTACT.value());
    }

    private boolean isClientCorporationEvent() {
        return entityIsOfType(ApiEntityName.CLIENT_CORPORATION.value());
    }

    private boolean isCorporateUserEvent() {
        return entityIsOfType(ApiEntityName.CORPORATE_USER.value());
    }

    private boolean isJobEvent() {
        return entityIsOfType(ApiEntityName.JOB_ORDER.value());
    }

    private boolean isJobSubmissionEvent() {
        return entityIsOfType(ApiEntityName.JOB_SUBMISSION.value());
    }

    private boolean isLeadEvent() {
        return entityIsOfType("Lead");
    }

    private boolean isNoteEvent() {
        return entityIsOfType(ApiEntityName.NOTE.value());
    }

    private boolean isPlacementEvent() {
        return entityIsOfType(ApiEntityName.PLACEMENT.value());
    }

    private boolean isOpportunityEvent() {
        return entityIsOfType(Opportunity.class.getSimpleName());
    }

    private boolean isPlacementChangeRequestEvent() {
        return entityIsOfType(ApiEntityName.PLACEMENT_CHANGE_REQUEST.value());
    }

    private boolean isPlacementCommissionEvent() {
        return entityIsOfType(ApiEntityName.PLACEMENT_COMMISSION.value());
    }

    private boolean isSendoutEvent() {
        return entityIsOfType(ApiEntityName.SENDOUT.value());
    }

    private boolean isTaskEvent() {
        return entityIsOfType(ApiEntityName.TASK.value());
    }

    private boolean isCandidateCertificationEvent() {
        return entityIsOfType(ApiEntityName.CANDIDATE_CERTIFICATION.value());
    }

    private boolean isCandidateCertificationRequirementEvent() {
        return entityIsOfType(ApiEntityName.CANDIDATE_CERTIFICATION_REQUIREMENT.value());
    }

    private boolean isJobSubmissionCertificationRequirementEvent() {
        return entityIsOfType(ApiEntityName.JOB_SUBMISSION_CERTIFICATION_REQUIREMENT.value());
    }

    private boolean isPlacementCertificationEvent() {
        return entityIsOfType(ApiEntityName.PLACEMENT_CERTIFICATION.value());
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
