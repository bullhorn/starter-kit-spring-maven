package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateReferenceRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Optional;
import java.util.Set;


public class CandidateReferenceScheduledTaskHelper extends AbstractScheduledTaskHelper<CandidateReference> {

	private Candidate candidate;
	private CorporateUser candidateOwner;
	private ClientCorporation clientCorporation;
	private JobOrder jobOrder;
	private ClientContact referenceClientContact;

	public CandidateReferenceScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, CandidateReference.class, CandidateReferenceRelatedEntity.CANDIDATE_REFERENCE, relatedEntityFields);
	}

	public CandidateReference getCandidateReference() {
        return getEntity();
    }

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getCandidateReference().getCandidate().getId(), CandidateReferenceRelatedEntity.CANDIDATE);
		}

		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), CandidateReferenceRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

	public Optional<ClientCorporation> getClientCorporation() {
		if (this.clientCorporation == null && isPopulated(getCandidateReference().getClientCorporation())) {
			this.clientCorporation = findClientCorporation(getCandidateReference().getClientCorporation().getId(), CandidateReferenceRelatedEntity.CLIENT_CORPORATION);
		}

		return Optional.ofNullable(clientCorporation);
	}

	public Optional<JobOrder> getJobOrder() {
		if (this.jobOrder == null && isPopulated(getCandidateReference().getJobOrder())) {
			this.jobOrder = findJobOrder(getCandidateReference().getJobOrder().getId(), CandidateReferenceRelatedEntity.JOB_ORDER);
		}

		return Optional.ofNullable(jobOrder);
	}

	public Optional<ClientContact> getReferenceClientContact() {
		if (this.referenceClientContact == null && isPopulated(getCandidateReference().getReferenceClientContact())) {
			this.referenceClientContact = findClientContact(getCandidateReference().getReferenceClientContact().getId(), CandidateReferenceRelatedEntity.REFERENCE_CLIENT_CONTACT);
		}

		return Optional.ofNullable(referenceClientContact);
	}
}
