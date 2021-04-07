package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.SendoutRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class SendoutScheduledTaskHelper extends AbstractScheduledTaskHelper<Sendout> {

	private CorporateUser user;
	private JobSubmission jobSubmission;
	private JobOrder jobOrder;
	private ClientContact jobOrderClientContact;
	private ClientCorporation jobOrderClientCorporation;
	private CorporateUser jobOwner;
	private Candidate candidate;
	private CorporateUser candidateOwner;
	private ClientContact clientContact;
	private ClientCorporation clientCorporation;
	
	public SendoutScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, Sendout.class, SendoutRelatedEntity.SENDOUT, relatedEntityFields);
	}

	public Sendout getSendout() {
        return getEntity();
    }

	public JobSubmission getJobSubmission() {
		if (jobSubmission == null) {
			this.jobSubmission = findJobSubmission(getSendout().getJobSubmission().getId(), SendoutRelatedEntity.JOB_SUBMISSION);
		}

		return jobSubmission;
	}

	public CorporateUser getUser() {
		if (user == null) {
			this.user = findCorporateUser(getSendout().getUser().getId(), SendoutRelatedEntity.USER);
		}

		return user;
	}

	public JobOrder getJobOrder() {
		if (jobOrder == null) {
			this.jobOrder = findJobOrder(getSendout().getJobOrder().getId(), SendoutRelatedEntity.JOB_ORDER);
		}

		return jobOrder;
	}

	public ClientCorporation getJobOrderClientCorporation() {
		if (jobOrderClientCorporation == null) {
			this.jobOrderClientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(), SendoutRelatedEntity.JOB_ORDER_CLIENT_CORPORATION);
		}

		return jobOrderClientCorporation;
	}

	public ClientContact getJobOrderClientContact() {
		if (jobOrderClientContact == null) {
			this.jobOrderClientContact = findClientContact(getJobOrder().getClientContact().getId(), SendoutRelatedEntity.JOB_ORDER_CLIENT_CONTACT);
		}

		return jobOrderClientContact;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(), SendoutRelatedEntity.JOB_OWNER);
		}

		return jobOwner;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getSendout().getCandidate().getId(), SendoutRelatedEntity.CANDIDATE);
		}

		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), SendoutRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getSendout().getClientCorporation().getId(), SendoutRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getSendout().getClientContact().getId(), SendoutRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}
	
}
