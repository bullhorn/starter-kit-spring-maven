package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.JobSubmissionRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class JobSubmissionScheduledTaskHelper extends AbstractScheduledTaskHelper<JobSubmission> {

	private CorporateUser sendingUser;
	private JobOrder jobOrder;
	private CorporateUser jobOwner;
	private Candidate candidate;
	private CorporateUser candidateOwner;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;

	public JobSubmissionScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, JobSubmission.class, JobSubmissionRelatedEntity.JOB_SUBMISSION, relatedEntityFields);
	}

	public JobSubmission getJobSubmission() {
		return getEntity();
	}

	public CorporateUser getSendingUser() {
		if (sendingUser == null) {
			this.sendingUser = findCorporateUser(getJobSubmission().getSendingUser().getId(), JobSubmissionRelatedEntity.SENDING_USER);
		}

		return sendingUser;
	}

	public JobOrder getJobOrder() {
		if (jobOrder == null) {
			this.jobOrder = findJobOrder(getJobSubmission().getJobOrder().getId(), JobSubmissionRelatedEntity.JOB_ORDER);
		}

		return jobOrder;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(), JobSubmissionRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getJobSubmission().getCandidate().getId(), JobSubmissionRelatedEntity.CANDIDATE);
		}

		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), JobSubmissionRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(), JobSubmissionRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getJobOrder().getClientContact().getId(), JobSubmissionRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}

}
