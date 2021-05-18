package com.client.core.scheduledtasks.workers;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.service.EventListWorkflowFactory;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Handles subscription events by passing them through the proper workflow for the entity that had an events thrown. Also
 * handles when errors occur during event handling by inserting records into a MySQL cloud database
 * and then reprocessing them the next time we retrieve events (for a maximum of 4 tries)
 */
public class EventListProcessing implements Runnable {
    private final Logger log = Logger.getLogger(getClass());

    private final EventListWorkflowFactory eventListWorkflowFactory;
    private final List<CustomSubscriptionEvent> events;
    private final String entityName;

    private EventListProcessing(String entityName, List<CustomSubscriptionEvent> events, EventListWorkflowFactory eventListWorkflowFactory) {
        super();
        this.eventListWorkflowFactory = eventListWorkflowFactory;
        this.events = events;
        this.entityName = entityName;
    }

    public static EventListProcessing instantiateRunnable(String entityName, List<CustomSubscriptionEvent> events, EventListWorkflowFactory eventListWorkflowFactory) {
        return new EventListProcessing(entityName, events, eventListWorkflowFactory);
    }

    /**
     * Performs the actual handling of a events by parsing out the kind of event from the {@link CustomSubscriptionEvent} provided via
     * the {@link EventListProcessing#(Integer, List<CustomSubscriptionEvent>)} constructor and handing the event off
     * to the proper workflow.
     */
    @Override
    public void run() {
        try {
            doAction();
        } catch (Exception e) {
            log.error("Event List for " + entityName + " resulted in error:" + e.getMessage(), e);
        }
    }

    private void doAction() throws Exception {
        if (isAppointmentEvent()) {
            eventListWorkflowFactory.execute(Appointment.class, events);
        } else if (isCandidateEvent()) {
            eventListWorkflowFactory.execute(Candidate.class, events);
        } else if (isCandidateEducationEvent()) {
            eventListWorkflowFactory.execute(CandidateEducation.class, events);
        } else if (isCandidateWorkHistoryEvent()) {
            eventListWorkflowFactory.execute(CandidateWorkHistory.class, events);
        } else if (isCandidateReferenceEvent()) {
            eventListWorkflowFactory.execute(CandidateReference.class, events);
        } else if (isClientContactEvent()) {
            eventListWorkflowFactory.execute(ClientContact.class, events);
        } else if (isClientCorporationEvent()) {
            eventListWorkflowFactory.execute(ClientCorporation.class, events);
        } else if (isCorporateUserEvent()) {
            eventListWorkflowFactory.execute(CorporateUser.class, events);
        } else if (isJobEvent()) {
            eventListWorkflowFactory.execute(JobOrder.class, events);
        } else if (isJobSubmissionEvent()) {
            eventListWorkflowFactory.execute(JobSubmission.class, events);
        } else if (isLeadEvent()) {
            eventListWorkflowFactory.execute(Lead.class, events);
        } else if (isNoteEvent()) {
            eventListWorkflowFactory.execute(Note.class, events);
        } else if (isOpportunityEvent()) {
            eventListWorkflowFactory.execute(Opportunity.class, events);
        } else if (isPlacementEvent()) {
            eventListWorkflowFactory.execute(Placement.class, events);
        } else if (isPlacementChangeRequestEvent()) {
            eventListWorkflowFactory.execute(PlacementChangeRequest.class, events);
        } else if (isPlacementCommissionEvent()) {
            eventListWorkflowFactory.execute(PlacementCommission.class, events);
        } else if (isSendoutEvent()) {
            eventListWorkflowFactory.execute(Sendout.class, events);
        } else if (isTaskEvent()) {
            eventListWorkflowFactory.execute(Task.class, events);
        } else if (isCandidateCertificationEvent()) {
            eventListWorkflowFactory.execute(CandidateCertification.class, events);
        } else if (isCandidateCertificationRequirementEvent()) {
            eventListWorkflowFactory.execute(CandidateCertificationRequirement.class, events);
        } else if (isJobSubmissionCertificationRequirementEvent()) {
            eventListWorkflowFactory.execute(JobSubmissionCertificationRequirement.class, events);
        } else if (isPlacementCertificationEvent()) {
            eventListWorkflowFactory.execute(PlacementCertification.class, events);
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

        if (entityTypeToCheck.equalsIgnoreCase(entityName)) {
            return true;
        }

        return false;
    }

}
