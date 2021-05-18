package com.client.core.scheduledtasks.service.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.certificationrequirement.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.client.core.base.model.relatedentity.*;
import com.client.core.base.model.relatedentity.credentialing.*;
import com.client.core.base.util.Utility;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.*;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.*;
import com.client.core.scheduledtasks.service.EventListWorkflowFactory;
import com.client.core.scheduledtasks.workflow.node.EventListTask;
import com.client.core.scheduledtasks.workflow.traversing.ScheduledTaskListTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.*;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.*;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StandardEventListWorkflowFactory implements EventListWorkflowFactory {

    private final Map<Class<? extends BullhornEntity>, Map<? extends BullhornRelatedEntity, Set<String>>> allRelatedEntityFields;

    private final List<EventListTask<Appointment, AppointmentScheduledTaskHelper, AppointmentEventListTraverser>> appointmentNodes;
    private final List<EventListTask<Candidate, CandidateScheduledTaskHelper, CandidateEventListTraverser>> candidateNodes;
    private final List<EventListTask<CandidateEducation, CandidateEducationScheduledTaskHelper, CandidateEducationEventListTraverser>> candidateEducationNodes;
    private final List<EventListTask<CandidateReference, CandidateReferenceScheduledTaskHelper, CandidateReferenceEventListTraverser>> candidateReferenceNodes;
    private final List<EventListTask<CandidateWorkHistory, CandidateWorkHistoryScheduledTaskHelper, CandidateWorkHistoryEventListTraverser>> candidateWorkHistoryNodes;
    private final List<EventListTask<ClientContact, ClientContactScheduledTaskHelper, ClientContactEventListTraverser>> clientContactNodes;
    private final List<EventListTask<ClientCorporation, ClientCorporationScheduledTaskHelper, ClientCorporationEventListTraverser>> clientCorporationNodes;
    private final List<EventListTask<CorporateUser, CorporateUserScheduledTaskHelper, CorporateUserEventListTraverser>> corporateUserNodes;
    private final List<EventListTask<JobOrder, JobOrderScheduledTaskHelper, JobOrderEventListTraverser>> jobOrderNodes;
    private final List<EventListTask<JobSubmission, JobSubmissionScheduledTaskHelper, JobSubmissionEventListTraverser>> jobSubmissionNodes;
    private final List<EventListTask<Lead, LeadScheduledTaskHelper, LeadEventListTraverser>> leadNodes;
    private final List<EventListTask<Note, NoteScheduledTaskHelper, NoteEventListTraverser>> noteNodes;
    private final List<EventListTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventListTraverser>> opportunityNodes;
    private final List<EventListTask<PlacementChangeRequest, PlacementChangeRequestScheduledTaskHelper, PlacementChangeRequestEventListTraverser>> placementChangeRequestNodes;
    private final List<EventListTask<PlacementCommission, PlacementCommissionScheduledTaskHelper, PlacementCommissionEventListTraverser>> placementCommissionNodes;
    private final List<EventListTask<Placement, PlacementScheduledTaskHelper, PlacementEventListTraverser>> placementNodes;
    private final List<EventListTask<Sendout, SendoutScheduledTaskHelper, SendoutEventListTraverser>> sendoutNodes;
    private final List<EventListTask<Task, TaskScheduledTaskHelper, TaskEventListTraverser>> taskNodes;

    private final List<EventListTask<CandidateCertification, CandidateCertificationScheduledTaskHelper, CandidateCertificationEventListTraverser>> candidateCertificationNodes;
    private final List<EventListTask<CandidateCertificationRequirement, CandidateCertificationRequirementScheduledTaskHelper, CandidateCertificationRequirementEventListTraverser>> candidateCertificationRequirementNodes;
    private final List<EventListTask<JobSubmissionCertificationRequirement, JobSubmissionCertificationRequirementScheduledTaskHelper, JobSubmissionCertificationRequirementEventListTraverser>> jobSubmissionCertificationRequirementNodes;
    private final List<EventListTask<PlacementCertification, PlacementCertificationScheduledTaskHelper, PlacementCertificationEventListTraverser>> placementCertificationNodes;

    private final BullhornData bullhornData;

    @Autowired
    public StandardEventListWorkflowFactory(Optional<List<EventListTask<Appointment, AppointmentScheduledTaskHelper, AppointmentEventListTraverser>>> appointmentNodes,
                                            Optional<List<EventListTask<Candidate, CandidateScheduledTaskHelper, CandidateEventListTraverser>>> candidateNodes,
                                            Optional<List<EventListTask<CandidateEducation, CandidateEducationScheduledTaskHelper, CandidateEducationEventListTraverser>>> candidateEducationNodes,
                                            Optional<List<EventListTask<CandidateReference, CandidateReferenceScheduledTaskHelper, CandidateReferenceEventListTraverser>>> candidateReferenceNodes,
                                            Optional<List<EventListTask<CandidateWorkHistory, CandidateWorkHistoryScheduledTaskHelper, CandidateWorkHistoryEventListTraverser>>> candidateWorkHistoryNodes,
                                            Optional<List<EventListTask<ClientContact, ClientContactScheduledTaskHelper, ClientContactEventListTraverser>>> clientContactNodes,
                                            Optional<List<EventListTask<ClientCorporation, ClientCorporationScheduledTaskHelper, ClientCorporationEventListTraverser>>> clientCorporationNodes,
                                            Optional<List<EventListTask<CorporateUser, CorporateUserScheduledTaskHelper, CorporateUserEventListTraverser>>> corporateUserNodes,
                                            Optional<List<EventListTask<JobOrder, JobOrderScheduledTaskHelper, JobOrderEventListTraverser>>> jobOrderNodes,
                                            Optional<List<EventListTask<JobSubmission, JobSubmissionScheduledTaskHelper, JobSubmissionEventListTraverser>>> jobSubmissionNodes,
                                            Optional<List<EventListTask<Lead, LeadScheduledTaskHelper, LeadEventListTraverser>>> leadNodes,
                                            Optional<List<EventListTask<Note, NoteScheduledTaskHelper, NoteEventListTraverser>>> noteNodes,
                                            Optional<List<EventListTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventListTraverser>>> opportunityNodes,
                                            Optional<List<EventListTask<PlacementChangeRequest, PlacementChangeRequestScheduledTaskHelper, PlacementChangeRequestEventListTraverser>>> placementChangeRequestNodes,
                                            Optional<List<EventListTask<PlacementCommission, PlacementCommissionScheduledTaskHelper, PlacementCommissionEventListTraverser>>> placementCommissionNodes,
                                            Optional<List<EventListTask<Placement, PlacementScheduledTaskHelper, PlacementEventListTraverser>>> placementNodes,
                                            Optional<List<EventListTask<Sendout, SendoutScheduledTaskHelper, SendoutEventListTraverser>>> sendoutNodes,
                                            Optional<List<EventListTask<Task, TaskScheduledTaskHelper, TaskEventListTraverser>>> taskNodes,
                                            Optional<List<EventListTask<CandidateCertification, CandidateCertificationScheduledTaskHelper, CandidateCertificationEventListTraverser>>> candidateCertificationNodes,
                                            Optional<List<EventListTask<CandidateCertificationRequirement, CandidateCertificationRequirementScheduledTaskHelper, CandidateCertificationRequirementEventListTraverser>>> candidateCertificationRequirementNodes,
                                            Optional<List<EventListTask<JobSubmissionCertificationRequirement, JobSubmissionCertificationRequirementScheduledTaskHelper, JobSubmissionCertificationRequirementEventListTraverser>>> jobSubmissionCertificationRequirementNodes,
                                            Optional<List<EventListTask<PlacementCertification, PlacementCertificationScheduledTaskHelper, PlacementCertificationEventListTraverser>>> placementCertificationNodes,
                                            BullhornData bullhornData) {
        this.appointmentNodes = sort(appointmentNodes);
        this.candidateNodes = sort(candidateNodes);
        this.candidateEducationNodes = sort(candidateEducationNodes);
        this.candidateReferenceNodes = sort(candidateReferenceNodes);
        this.candidateWorkHistoryNodes = sort(candidateWorkHistoryNodes);
        this.clientContactNodes = sort(clientContactNodes);
        this.clientCorporationNodes = sort(clientCorporationNodes);
        this.corporateUserNodes = sort(corporateUserNodes);
        this.jobOrderNodes = sort(jobOrderNodes);
        this.jobSubmissionNodes = sort(jobSubmissionNodes);
        this.leadNodes = sort(leadNodes);
        this.noteNodes = sort(noteNodes);
        this.opportunityNodes = sort(opportunityNodes);
        this.placementChangeRequestNodes = sort(placementChangeRequestNodes);
        this.placementCommissionNodes = sort(placementCommissionNodes);
        this.placementNodes = sort(placementNodes);
        this.sendoutNodes = sort(sendoutNodes);
        this.taskNodes = sort(taskNodes);
        this.candidateCertificationNodes = sort(candidateCertificationNodes);
        this.candidateCertificationRequirementNodes = sort(candidateCertificationRequirementNodes);
        this.jobSubmissionCertificationRequirementNodes = sort(jobSubmissionCertificationRequirementNodes);
        this.placementCertificationNodes = sort(placementCertificationNodes);
        this.bullhornData = bullhornData;
        this.allRelatedEntityFields = constructAllRelatedEntityFields();
    }

    @Override
    public <T extends BullhornEntity> void execute(Class<T> type, List<CustomSubscriptionEvent> events) {
        if (Appointment.class.equals(type)) {
            AppointmentEventListTraverser traverser = new AppointmentEventListTraverser(events, allRelatedEntityFields.get(Appointment.class));

            appointmentNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (CandidateEducation.class.equals(type)) {
            CandidateEducationEventListTraverser traverser = new CandidateEducationEventListTraverser(events, allRelatedEntityFields.get(CandidateEducation.class));

            candidateEducationNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (Candidate.class.equals(type)) {
            CandidateEventListTraverser traverser = new CandidateEventListTraverser(events, allRelatedEntityFields.get(Candidate.class));

            candidateNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (CandidateReference.class.equals(type)) {
            CandidateReferenceEventListTraverser traverser = new CandidateReferenceEventListTraverser(events, allRelatedEntityFields.get(CandidateReference.class));

            candidateReferenceNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if (CandidateWorkHistory.class.equals(type)) {
            CandidateWorkHistoryEventListTraverser traverser = new CandidateWorkHistoryEventListTraverser(events, allRelatedEntityFields.get(CandidateWorkHistory.class));

            candidateWorkHistoryNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (ClientContact.class.equals(type)) {
            ClientContactEventListTraverser traverser = new ClientContactEventListTraverser(events, allRelatedEntityFields.get(ClientContact.class));

            clientContactNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (ClientCorporation.class.equals(type)) {
            ClientCorporationEventListTraverser traverser = new ClientCorporationEventListTraverser(events, allRelatedEntityFields.get(ClientCorporation.class));

            clientCorporationNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (CorporateUser.class.equals(type)) {
            CorporateUserEventListTraverser traverser = new CorporateUserEventListTraverser(events, allRelatedEntityFields.get(CorporateUser.class));

            corporateUserNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (JobOrder.class.equals(type)) {
            JobOrderEventListTraverser traverser = new JobOrderEventListTraverser(events, allRelatedEntityFields.get(JobOrder.class));

            jobOrderNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (JobSubmission.class.equals(type)) {
            JobSubmissionEventListTraverser traverser = new JobSubmissionEventListTraverser(events, allRelatedEntityFields.get(JobSubmission.class));

            jobSubmissionNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (Lead.class.equals(type)) {
            LeadEventListTraverser traverser = new LeadEventListTraverser(events, allRelatedEntityFields.get(Lead.class));

            leadNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (Note.class.equals(type)) {
            NoteEventListTraverser traverser = new NoteEventListTraverser(events, allRelatedEntityFields.get(Note.class));

            noteNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (Opportunity.class.equals(type)) {
            OpportunityEventListTraverser traverser = new OpportunityEventListTraverser(events, allRelatedEntityFields.get(Opportunity.class));

            opportunityNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (PlacementChangeRequest.class.equals(type)) {
            PlacementChangeRequestEventListTraverser traverser = new PlacementChangeRequestEventListTraverser(events, allRelatedEntityFields.get(PlacementChangeRequest.class));

            placementChangeRequestNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (PlacementCommission.class.equals(type)) {
            PlacementCommissionEventListTraverser traverser = new PlacementCommissionEventListTraverser(events, allRelatedEntityFields.get(PlacementCommission.class));

            placementCommissionNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (Placement.class.equals(type)) {
            PlacementEventListTraverser traverser = new PlacementEventListTraverser(events, allRelatedEntityFields.get(Placement.class));

            placementNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (Sendout.class.equals(type)) {
            SendoutEventListTraverser traverser = new SendoutEventListTraverser(events, allRelatedEntityFields.get(Sendout.class));

            sendoutNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (Task.class.equals(type)) {
            TaskEventListTraverser traverser = new TaskEventListTraverser(events, allRelatedEntityFields.get(Task.class));

            taskNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (CandidateCertification.class.equals(type)) {
            CandidateCertificationEventListTraverser traverser = new CandidateCertificationEventListTraverser(events, allRelatedEntityFields.get(CandidateCertification.class));

            candidateCertificationNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (CandidateCertificationRequirement.class.equals(type)) {
            CandidateCertificationRequirementEventListTraverser traverser = new CandidateCertificationRequirementEventListTraverser(events, allRelatedEntityFields.get(CandidateCertificationRequirement.class));

            candidateCertificationRequirementNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (JobSubmissionCertificationRequirement.class.equals(type)) {
            JobSubmissionCertificationRequirementEventListTraverser traverser = new JobSubmissionCertificationRequirementEventListTraverser(events, allRelatedEntityFields.get(JobSubmissionCertificationRequirement.class));

            jobSubmissionCertificationRequirementNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        } else if (PlacementCertification.class.equals(type)) {
            PlacementCertificationEventListTraverser traverser = new PlacementCertificationEventListTraverser(events, allRelatedEntityFields.get(PlacementCertification.class));

            placementCertificationNodes.stream().forEach((eventTask) -> {
                eventTask.handle(traverser);
            });

            handleResult(traverser);
        }
    }

    private <U extends UpdateEntity, E extends BullhornEntity, H extends ScheduledTaskHelper<E>, T extends ScheduledTaskListTraverser<H>> void handleResult(T traverser) {
        Map<String, U> dtosToSave = traverser.getAllEntitiesToSave();

        for (Map.Entry<String, U> entry : dtosToSave.entrySet()) {
            bullhornData.updateEntity(entry.getValue());
        }
    }

    private <E extends BullhornEntity, H extends ScheduledTaskHelper<E>, T extends ScheduledTaskListTraverser<H>> List<EventListTask<E, H, T>> sort(Optional<List<EventListTask<E, H, T>>> values) {
        return values.orElseGet(Lists::newArrayList).stream().sorted().collect(Collectors.toList());
    }

    private Map<Class<? extends BullhornEntity>, Map<? extends BullhornRelatedEntity, Set<String>>> constructAllRelatedEntityFields() {
        Map<Class<? extends BullhornEntity>, Map<? extends BullhornRelatedEntity, Set<String>>> allRelatedEntityFields = Maps.newLinkedHashMap();

        allRelatedEntityFields.put(Appointment.class, Utility.getRequestedFields(AppointmentRelatedEntity.values(), appointmentNodes));
        allRelatedEntityFields.put(Candidate.class, Utility.getRequestedFields(CandidateRelatedEntity.values(), candidateNodes));
        allRelatedEntityFields.put(CandidateEducation.class, Utility.getRequestedFields(CandidateEducationRelatedEntity.values(), candidateEducationNodes));
        allRelatedEntityFields.put(CandidateReference.class, Utility.getRequestedFields(CandidateReferenceRelatedEntity.values(), candidateReferenceNodes));
        allRelatedEntityFields.put(CandidateWorkHistory.class, Utility.getRequestedFields(CandidateWorkHistoryRelatedEntity.values(), candidateWorkHistoryNodes));
        allRelatedEntityFields.put(ClientContact.class, Utility.getRequestedFields(ClientContactRelatedEntity.values(), clientContactNodes));
        allRelatedEntityFields.put(ClientCorporation.class, Utility.getRequestedFields(ClientCorporationRelatedEntity.values(), clientCorporationNodes));
        allRelatedEntityFields.put(CorporateUser.class, Utility.getRequestedFields(CorporateUserRelatedEntity.values(), corporateUserNodes));
        allRelatedEntityFields.put(JobOrder.class, Utility.getRequestedFields(JobOrderRelatedEntity.values(), jobOrderNodes));
        allRelatedEntityFields.put(JobSubmission.class, Utility.getRequestedFields(JobSubmissionRelatedEntity.values(), jobSubmissionNodes));
        allRelatedEntityFields.put(Lead.class, Utility.getRequestedFields(LeadRelatedEntity.values(), leadNodes));
        allRelatedEntityFields.put(Note.class, Utility.getRequestedFields(NoteRelatedEntity.values(), noteNodes));
        allRelatedEntityFields.put(Opportunity.class, Utility.getRequestedFields(OpportunityRelatedEntity.values(), opportunityNodes));
        allRelatedEntityFields.put(PlacementChangeRequest.class, Utility.getRequestedFields(PlacementChangeRequestRelatedEntity.values(), placementChangeRequestNodes));
        allRelatedEntityFields.put(PlacementCommission.class, Utility.getRequestedFields(PlacementCommissionRelatedEntity.values(), placementCommissionNodes));
        allRelatedEntityFields.put(Placement.class, Utility.getRequestedFields(PlacementRelatedEntity.values(), placementNodes));
        allRelatedEntityFields.put(Sendout.class, Utility.getRequestedFields(SendoutRelatedEntity.values(), sendoutNodes));
        allRelatedEntityFields.put(Task.class, Utility.getRequestedFields(TaskRelatedEntity.values(), taskNodes));
        allRelatedEntityFields.put(CandidateCertification.class, Utility.getRequestedFields(CandidateCertificationRelatedEntity.values(), candidateCertificationNodes));
        allRelatedEntityFields.put(CandidateCertificationRequirement.class, Utility.getRequestedFields(CandidateCertificationRequirementRelatedEntity.values(), candidateCertificationRequirementNodes));
        allRelatedEntityFields.put(JobSubmissionCertificationRequirement.class, Utility.getRequestedFields(JobSubmissionCertificationRequirementRelatedEntity.values(), jobSubmissionCertificationRequirementNodes));
        allRelatedEntityFields.put(PlacementCertification.class, Utility.getRequestedFields(PlacementCertificationRelatedEntity.values(), placementCertificationNodes));

        return allRelatedEntityFields;
    }

}
