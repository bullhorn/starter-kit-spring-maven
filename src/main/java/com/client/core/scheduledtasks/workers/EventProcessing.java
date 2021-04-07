package com.client.core.scheduledtasks.workers;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import org.apache.log4j.Logger;

/**
 * Handles one subscription event by passing it through the proper workflow for the entity that had an event thrown. Also
 * handles when errors occur during event handling by inserting records into a MySQL cloud database
 * and then reprocessing them the next time we retrieve events (for a maximum of 4 tries)
 */
public class EventProcessing implements Runnable {
    private final Logger log = Logger.getLogger(getClass());

    private final EventWorkflowFactory eventWorkflowFactory;
    private final CustomSubscriptionEvent event;

    private EventProcessing(CustomSubscriptionEvent event, EventWorkflowFactory eventWorkflowFactory) {
        super();
        this.eventWorkflowFactory = eventWorkflowFactory;
        this.event = event;
    }

    public static EventProcessing instantiateRunnable(CustomSubscriptionEvent event, EventWorkflowFactory eventWorkflowFactory) {
        return new EventProcessing(event, eventWorkflowFactory);
    }

    /**
     * Performs the actual handling of a single event by parsing out the kind of event from the {@link com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent} provided via
     * the {@link EventProcessing#(Integer, com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent)} constructor and handing the event off
     * to the proper workflow.
     */
    @Override
    public void run() {
        try {
            doAction();
        } catch (Exception e) {
            log.error("Event " + event.getEventId() + " resulted in error:" + e.getMessage(), e);
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
        return entityIsOfType(Appointment.class.getSimpleName());
    }

    private boolean isCandidateEvent() {
        return entityIsOfType(Candidate.class.getSimpleName());
    }

    private boolean isCandidateReferenceEvent() {
        return entityIsOfType(CandidateReference.class.getSimpleName());
    }

    private boolean isCandidateWorkHistoryEvent() {
        return entityIsOfType(CandidateWorkHistory.class.getSimpleName());
    }

    private boolean isCandidateEducationEvent() {
        return entityIsOfType(CandidateEducation.class.getSimpleName());
    }

    private boolean isClientContactEvent() {
        return entityIsOfType(ClientContact.class.getSimpleName());
    }

    private boolean isClientCorporationEvent() {
        return entityIsOfType(ClientCorporation.class.getSimpleName());
    }

    private boolean isCorporateUserEvent() {
        return entityIsOfType(CorporateUser.class.getSimpleName());
    }

    private boolean isJobEvent() {
        return entityIsOfType(JobOrder.class.getSimpleName());
    }

    private boolean isJobSubmissionEvent() {
        return entityIsOfType(JobSubmission.class.getSimpleName());
    }

    private boolean isLeadEvent() {
        return entityIsOfType(Lead.class.getSimpleName());
    }

    private boolean isNoteEvent() {
        return entityIsOfType(Note.class.getSimpleName());
    }

    private boolean isPlacementEvent() {
        return entityIsOfType(Placement.class.getSimpleName());
    }

    private boolean isOpportunityEvent() {
        return entityIsOfType(Opportunity.class.getSimpleName());
    }

    private boolean isPlacementChangeRequestEvent() {
        return entityIsOfType(PlacementChangeRequest.class.getSimpleName());
    }

    private boolean isPlacementCommissionEvent() {
        return entityIsOfType(PlacementCommission.class.getSimpleName());
    }

    private boolean isSendoutEvent() {
        return entityIsOfType(Sendout.class.getSimpleName());
    }

    private boolean isTaskEvent() {
        return entityIsOfType(Task.class.getSimpleName());
    }

    private boolean isCandidateCertificationEvent() {
        return entityIsOfType(CandidateCertification.class.getSimpleName());
    }

    private boolean isCandidateCertificationRequirementEvent() {
        return entityIsOfType(CandidateCertificationRequirement.class.getSimpleName());
    }

    private boolean isJobSubmissionCertificationRequirementEvent() {
        return entityIsOfType(JobSubmissionCertificationRequirement.class.getSimpleName());
    }

    private boolean isPlacementCertificationEvent() {
        return entityIsOfType(PlacementCertification.class.getSimpleName());
    }

    private boolean entityIsOfType(String entityTypeToCheck) {
        String entityType = event.getEntityName();

        if (entityTypeToCheck.equalsIgnoreCase(entityType)) {
            return true;
        }

        return false;
    }

}
