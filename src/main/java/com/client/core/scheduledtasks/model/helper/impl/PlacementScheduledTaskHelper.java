package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.base.model.relatedentity.PlacementRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.PlacementCertificationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlacementScheduledTaskHelper extends AbstractScheduledTaskHelper<Placement> {

	private List<PlacementCommission> commissions;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;
	private Candidate candidate;
	private CorporateUser candidateOwner;
	private JobOrder jobOrder;
	private CorporateUser jobOwner;
	private JobSubmission jobSubmission;
	private CorporateUser jobSubmissionSendingUser;

	public PlacementScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, Placement.class, PlacementRelatedEntity.PLACEMENT, relatedEntityFields);
	}
	
	public Placement getPlacement() {
        return getEntity();
    }

	public JobOrder getJobOrder() {
		if (jobOrder == null) {
			this.jobOrder = findJobOrder(getPlacement().getJobOrder().getId(), PlacementRelatedEntity.JOB_ORDER);
		}

		return jobOrder;
	}

	public List<PlacementCommission> getCommissions() {
		if (commissions == null) {
			this.commissions = getCommissions(getPlacement().getId(), PlacementRelatedEntity.COMMISSIONS);
		}

		return commissions;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(), PlacementRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getPlacement().getCandidate().getId(), PlacementRelatedEntity.CANDIDATE);
		}

		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), CandidateRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getJobOrder().getClientContact().getId(), PlacementRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(), PlacementRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public JobSubmission getJobSubmission() {
		if (jobSubmission == null) {
			this.jobSubmission = findJobSubmission(getPlacement().getJobSubmission().getId(), PlacementRelatedEntity.JOB_SUBMISSION);
		}

		return jobSubmission;
	}

	public CorporateUser getJobSubmissionSendingUser() {
		if (jobSubmissionSendingUser == null) {
			this.jobSubmissionSendingUser = findCorporateUser(getJobSubmission().getSendingUser().getId(),
					PlacementCertificationRelatedEntity.JOB_SUBMISSION_SENDING_USER);
		}

		return jobSubmissionSendingUser;
	}

}
