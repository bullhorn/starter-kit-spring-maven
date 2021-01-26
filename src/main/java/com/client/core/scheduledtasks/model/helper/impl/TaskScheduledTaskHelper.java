package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.TaskRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class TaskScheduledTaskHelper extends AbstractScheduledTaskHelper<Task> {

	private CorporateUser taskOwner;
	private JobOrder jobOrder;
	private Placement placement;
	private JobSubmission jobSubmission;
	private Candidate candidate;
	private ClientContact clientContact;
	private Lead lead;
	private Opportunity opportunity;

	public TaskScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, Task.class, TaskRelatedEntity.TASK, relatedEntityFields);
	}

	public Task getTask() {
        return getEntity();
    }

	public CorporateUser getTaskOwner() {
		if (taskOwner == null) {
			this.taskOwner = findCorporateUser(getTask().getOwner().getId(), TaskRelatedEntity.TASK_OWNER);
		}

		return taskOwner;
	}

	public Optional<JobOrder> getJobOrder() {
		if (jobOrder == null && isPopulated(getTask().getJobOrder())) {
			this.jobOrder = findJobOrder(getTask().getJobOrder().getId(), TaskRelatedEntity.JOB_ORDER);
		}

		return Optional.ofNullable(jobOrder);
	}

	public Optional<Placement> getPlacement() {
		if (placement == null) {
			this.placement = findPlacement(getTask().getPlacement().getId(), TaskRelatedEntity.PLACEMENT);
		}

		return Optional.ofNullable(placement);
	}

	public Optional<JobSubmission> getJobSubmission() {
		if (jobSubmission == null) {
			this.jobSubmission = findJobSubmission(getTask().getJobSubmission().getId(), TaskRelatedEntity.JOB_SUBMISSION);
		}

		return Optional.ofNullable(jobSubmission);
	}

	public Optional<Candidate> getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getTask().getCandidate().getId(), TaskRelatedEntity.CANDIDATE);
		}

		return Optional.ofNullable(candidate);
	}

	public Optional<ClientContact> getClientContact() {
		if (clientContact == null && isPopulated(getTask().getClientContact())) {
			this.clientContact = findClientContact(getTask().getClientContact().getId(), TaskRelatedEntity.CLIENT_CONTACT);
		}

		return Optional.ofNullable(clientContact);
	}

	public Optional<Lead> getLead() {
		if (lead == null && isPopulated(getTask().getLead())) {
			this.lead = findLead(getTask().getLead().getId(), TaskRelatedEntity.LEAD);
		}

		return Optional.ofNullable(lead);
	}

	public Opportunity getOpportunity() {
		if(opportunity == null && isPopulated(getTask().getOpportunity())) {
			this.opportunity = findOpportunity(getTask().getOpportunity().getId(), TaskRelatedEntity.OPPORTUNITY);
		}

		return opportunity;
	}
}
