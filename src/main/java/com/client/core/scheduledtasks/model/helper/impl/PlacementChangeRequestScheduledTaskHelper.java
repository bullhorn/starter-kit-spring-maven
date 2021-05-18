package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.base.model.relatedentity.PlacementChangeRequestRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.PlacementCertificationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlacementChangeRequestScheduledTaskHelper extends AbstractScheduledTaskHelper<PlacementChangeRequest> {

	private Placement placement;
	private List<PlacementCommission> commissions;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;
	private Candidate candidate;
	private CorporateUser candidateOwner;
	private JobOrder jobOrder;
	private CorporateUser jobOwner;
	private JobSubmission jobSubmission;
	private CorporateUser jobSubmissionSendingUser;

	public PlacementChangeRequestScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, PlacementChangeRequest.class, PlacementChangeRequestRelatedEntity.PLACEMENT_CHANGE_REQUEST, relatedEntityFields);
	}

	public PlacementChangeRequest getPlacementChangeRequest() {
        return getEntity();
    }

	public Placement getPlacement() {
		if (placement == null) {
			this.placement = findPlacement(getPlacementChangeRequest().getPlacement().getId(), PlacementChangeRequestRelatedEntity.PLACEMENT);
		}

		return placement;
	}

	public JobOrder getJobOrder() {
		if (jobOrder == null) {
			this.jobOrder = findJobOrder(getPlacement().getJobOrder().getId(), PlacementChangeRequestRelatedEntity.JOB_ORDER);
		}

		return jobOrder;
	}

	public List<PlacementCommission> getCommissions() {
		if (commissions == null) {
			this.commissions = getCommissions(getPlacement().getId(), PlacementChangeRequestRelatedEntity.COMMISSIONS);
		}

		return commissions;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(), PlacementChangeRequestRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getPlacement().getCandidate().getId(), PlacementChangeRequestRelatedEntity.CANDIDATE);
		}

		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), PlacementChangeRequestRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getJobOrder().getClientContact().getId(), PlacementChangeRequestRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(), PlacementChangeRequestRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public JobSubmission getJobSubmission() {
		if (jobSubmission == null) {
			this.jobSubmission = findJobSubmission(getPlacement().getJobSubmission().getId(), PlacementChangeRequestRelatedEntity.JOB_SUBMISSION);
		}

		return jobSubmission;
	}

	public CorporateUser getJobSubmissionSendingUser() {
		if (jobSubmissionSendingUser == null) {
			this.jobSubmissionSendingUser = findCorporateUser(getJobSubmission().getSendingUser().getId(),
					PlacementChangeRequestRelatedEntity.JOB_SUBMISSION_SENDING_USER);
		}

		return jobSubmissionSendingUser;
	}

}
