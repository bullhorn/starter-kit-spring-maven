package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.base.model.relatedentity.PlacementCommissionRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.PlacementCertificationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class PlacementCommissionScheduledTaskHelper extends AbstractScheduledTaskHelper<PlacementCommission> {
	
	private Placement placement;
	private CorporateUser user;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;
	private Candidate candidate;
	private CorporateUser candidateOwner;
	private JobOrder jobOrder;
	private CorporateUser jobOwner;
	private JobSubmission jobSubmission;
	private CorporateUser jobSubmissionSendingUser;

	public PlacementCommissionScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, PlacementCommission.class, PlacementCommissionRelatedEntity.PLACEMENT_COMMISSION, relatedEntityFields);
	}

	public PlacementCommission getPlacementCommission() {
        return getEntity();
    }

	public CorporateUser getUser() {
		if (user == null) {
			this.user = findCorporateUser(getPlacementCommission().getUser().getId(), PlacementCommissionRelatedEntity.USER);
		}

		return user;
	}

	public Placement getPlacement() {
		if (placement == null) {
			this.placement = findPlacement(getPlacementCommission().getPlacement().getId(), PlacementCommissionRelatedEntity.PLACEMENT);
		}

		return placement;
	}

	public JobOrder getJobOrder() {
		if (jobOrder == null) {
			this.jobOrder = findJobOrder(getPlacement().getJobOrder().getId(), PlacementCommissionRelatedEntity.JOB_ORDER);
		}

		return jobOrder;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(), PlacementCommissionRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getPlacement().getCandidate().getId(), PlacementCommissionRelatedEntity.CANDIDATE);
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
			this.clientContact = findClientContact(getJobOrder().getClientContact().getId(), PlacementCommissionRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(), PlacementCommissionRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public JobSubmission getJobSubmission() {
		if (jobSubmission == null) {
			this.jobSubmission = findJobSubmission(getPlacement().getJobSubmission().getId(), PlacementCommissionRelatedEntity.JOB_SUBMISSION);
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
