package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.JobSubmissionRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class JobSubmissionTriggerHelper extends AbstractTriggerHelper<JobSubmission> {

	private CorporateUser sendingUser;
	private JobOrder jobOrder;
	private CorporateUser jobOwner;
	private ClientCorporation clientCorporation;
	private ClientContact clientContact;
	private Candidate candidate;
	private CorporateUser candidateOwner;

	public JobSubmissionTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, JobSubmission.class, JobSubmissionRelatedEntity.JOB_SUBMISSION, relatedEntityFields);
	}

	public CorporateUser getSendingUser() {
		if (sendingUser == null) {
			this.sendingUser = findCorporateUser(getNewEntity().getSendingUser().getId(), JobSubmissionRelatedEntity.SENDING_USER);
		}

		return sendingUser;
	}

	public JobOrder getJobOrder() {
		if (jobOrder == null) {
			this.jobOrder = findJobOrder(getNewEntity().getJobOrder().getId(), JobSubmissionRelatedEntity.JOB_ORDER);
		}

		return jobOrder;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(), JobSubmissionRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
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

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getNewEntity().getCandidate().getId(), JobSubmissionRelatedEntity.CANDIDATE);
		}

		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), JobSubmissionRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

}
