package com.client.core.scheduledtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.AppointmentScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.CandidateEducationScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.CandidateReferenceScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.CandidateScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.CandidateWorkHistoryScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.ClientContactScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.ClientCorporationScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.CorporateUserScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.JobOrderScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.JobSubmissionScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.LeadScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.NoteScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.OpportunityScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.PlacementChangeRequestScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.PlacementCommissionScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.PlacementScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.SendoutScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.impl.TaskScheduledTaskHelper;
import com.client.core.scheduledtasks.service.EventWorkflowFactory;
import com.client.core.scheduledtasks.workflow.node.EventTask;
import com.client.core.scheduledtasks.workflow.traversing.ScheduledTasksTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.AppointmentEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEducationEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateReferenceEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateWorkHistoryEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientContactEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientCorporationEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.CorporateUserEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobOrderEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobSubmissionEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.LeadEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.NoteEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.OpportunityEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementChangeRequestEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementCommissionEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.SendoutEventTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.TaskEventTraverser;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by john.sullivan on 12/5/2017.
 */
@Service
public class StandardEventWorkflowFactory implements EventWorkflowFactory {

    private final List<EventTask<Appointment, AppointmentScheduledTaskHelper, AppointmentEventTraverser>> appointmentNodes;
    private final List<EventTask<Candidate, CandidateScheduledTaskHelper, CandidateEventTraverser>> candidateNodes;
    private final List<EventTask<CandidateEducation, CandidateEducationScheduledTaskHelper, CandidateEducationEventTraverser>> candidateEducationNodes;
    private final List<EventTask<CandidateReference, CandidateReferenceScheduledTaskHelper, CandidateReferenceEventTraverser>> candidateReferenceNodes;
    private final List<EventTask<CandidateWorkHistory, CandidateWorkHistoryScheduledTaskHelper, CandidateWorkHistoryEventTraverser>> candidateWorkHistoryNodes;
    private final List<EventTask<ClientContact, ClientContactScheduledTaskHelper, ClientContactEventTraverser>> clientContactNodes;
    private final List<EventTask<ClientCorporation, ClientCorporationScheduledTaskHelper, ClientCorporationEventTraverser>> clientCorporationNodes;
    private final List<EventTask<CorporateUser, CorporateUserScheduledTaskHelper, CorporateUserEventTraverser>> corporateUserNodes;
    private final List<EventTask<JobOrder, JobOrderScheduledTaskHelper, JobOrderEventTraverser>> jobOrderNodes;
    private final List<EventTask<JobSubmission, JobSubmissionScheduledTaskHelper, JobSubmissionEventTraverser>> jobSubmissionNodes;
    private final List<EventTask<Lead, LeadScheduledTaskHelper, LeadEventTraverser>> leadNodes;
    private final List<EventTask<Note, NoteScheduledTaskHelper, NoteEventTraverser>> noteNodes;
    private final List<EventTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventTraverser>> opportunityNodes;
    private final List<EventTask<PlacementChangeRequest, PlacementChangeRequestScheduledTaskHelper, PlacementChangeRequestEventTraverser>> placementChangeRequestNodes;
    private final List<EventTask<PlacementCommission, PlacementCommissionScheduledTaskHelper, PlacementCommissionEventTraverser>> placementCommissionNodes;
    private final List<EventTask<Placement, PlacementScheduledTaskHelper, PlacementEventTraverser>> placementNodes;
    private final List<EventTask<Sendout, SendoutScheduledTaskHelper, SendoutEventTraverser>> sendoutNodes;
    private final List<EventTask<Task, TaskScheduledTaskHelper, TaskEventTraverser>> taskNodes;

    @Autowired
    public StandardEventWorkflowFactory(Optional<List<EventTask<Appointment, AppointmentScheduledTaskHelper, AppointmentEventTraverser>>> appointmentNodes, Optional<List<EventTask<Candidate, CandidateScheduledTaskHelper, CandidateEventTraverser>>> candidateNodes, Optional<List<EventTask<CandidateEducation, CandidateEducationScheduledTaskHelper, CandidateEducationEventTraverser>>> candidateEducationNodes, Optional<List<EventTask<CandidateReference, CandidateReferenceScheduledTaskHelper, CandidateReferenceEventTraverser>>> candidateReferenceNodes, Optional<List<EventTask<CandidateWorkHistory, CandidateWorkHistoryScheduledTaskHelper, CandidateWorkHistoryEventTraverser>>> candidateWorkHistoryNodes, Optional<List<EventTask<ClientContact, ClientContactScheduledTaskHelper, ClientContactEventTraverser>>> clientContactNodes, Optional<List<EventTask<ClientCorporation, ClientCorporationScheduledTaskHelper, ClientCorporationEventTraverser>>> clientCorporationNodes, Optional<List<EventTask<CorporateUser, CorporateUserScheduledTaskHelper, CorporateUserEventTraverser>>> corporateUserNodes, Optional<List<EventTask<JobOrder, JobOrderScheduledTaskHelper, JobOrderEventTraverser>>> jobOrderNodes, Optional<List<EventTask<JobSubmission, JobSubmissionScheduledTaskHelper, JobSubmissionEventTraverser>>> jobSubmissionNodes, Optional<List<EventTask<Lead, LeadScheduledTaskHelper, LeadEventTraverser>>> leadNodes, Optional<List<EventTask<Note, NoteScheduledTaskHelper, NoteEventTraverser>>> noteNodes, Optional<List<EventTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventTraverser>>> opportunityNodes, Optional<List<EventTask<PlacementChangeRequest, PlacementChangeRequestScheduledTaskHelper, PlacementChangeRequestEventTraverser>>> placementChangeRequestNodes, Optional<List<EventTask<PlacementCommission, PlacementCommissionScheduledTaskHelper, PlacementCommissionEventTraverser>>> placementCommissionNodes, Optional<List<EventTask<Placement, PlacementScheduledTaskHelper, PlacementEventTraverser>>> placementNodes, Optional<List<EventTask<Sendout, SendoutScheduledTaskHelper, SendoutEventTraverser>>> sendoutNodes, Optional<List<EventTask<Task, TaskScheduledTaskHelper, TaskEventTraverser>>> taskNodes) {
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
    }

    @Override
    public <T extends BullhornEntity> void execute(Class<T> type, CustomSubscriptionEvent event) {
        if(Appointment.class.equals(type)) {
            AppointmentEventTraverser traverser = new AppointmentEventTraverser(event);

            appointmentNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(CandidateEducation.class.equals(type)) {
            CandidateEducationEventTraverser traverser = new CandidateEducationEventTraverser(event);

            candidateEducationNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(Candidate.class.equals(type)) {
            CandidateEventTraverser traverser = new CandidateEventTraverser(event);

            candidateNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(CandidateReference.class.equals(type)) {
            CandidateReferenceEventTraverser traverser = new CandidateReferenceEventTraverser(event);

            candidateReferenceNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(CandidateWorkHistory.class.equals(type)) {
            CandidateWorkHistoryEventTraverser traverser = new CandidateWorkHistoryEventTraverser(event);

            candidateWorkHistoryNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(ClientContact.class.equals(type)) {
            ClientContactEventTraverser traverser = new ClientContactEventTraverser(event);

            clientContactNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(ClientCorporation.class.equals(type)) {
            ClientCorporationEventTraverser traverser = new ClientCorporationEventTraverser(event);

            clientCorporationNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(CorporateUser.class.equals(type)) {
            CorporateUserEventTraverser traverser = new CorporateUserEventTraverser(event);

            corporateUserNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(JobOrder.class.equals(type)) {
            JobOrderEventTraverser traverser = new JobOrderEventTraverser(event);

            jobOrderNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(JobSubmission.class.equals(type)) {
            JobSubmissionEventTraverser traverser = new JobSubmissionEventTraverser(event);

            jobSubmissionNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(Lead.class.equals(type)) {
            LeadEventTraverser traverser = new LeadEventTraverser(event);

            leadNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(Note.class.equals(type)) {
            NoteEventTraverser traverser = new NoteEventTraverser(event);

            noteNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(Opportunity.class.equals(type)) {
            OpportunityEventTraverser traverser = new OpportunityEventTraverser(event);

            opportunityNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(PlacementChangeRequest.class.equals(type)) {
            PlacementChangeRequestEventTraverser traverser = new PlacementChangeRequestEventTraverser(event);

            placementChangeRequestNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(PlacementCommission.class.equals(type)) {
            PlacementCommissionEventTraverser traverser = new PlacementCommissionEventTraverser(event);

            placementCommissionNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(Placement.class.equals(type)) {
            PlacementEventTraverser traverser = new PlacementEventTraverser(event);

            placementNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(Sendout.class.equals(type)) {
            SendoutEventTraverser traverser = new SendoutEventTraverser(event);

            sendoutNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        } else if(Task.class.equals(type)) {
            TaskEventTraverser traverser = new TaskEventTraverser(event);

            taskNodes.stream().forEach( (eventTask) -> {
                eventTask.handle(traverser);
            });
        }
    }

    private <E extends BullhornEntity, H extends ScheduledTaskHelper<E>, T extends ScheduledTasksTraverser<H>> List<EventTask<E, H, T>> sort(Optional<List<EventTask<E, H, T>>> values) {
        return values.orElseGet(Lists::newArrayList).stream().sorted().collect(Collectors.toList());
    }

}
