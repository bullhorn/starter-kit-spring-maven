package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateWorkHistoryRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Optional;
import java.util.Set;


public class CandidateWorkHistoryScheduledTaskHelper extends AbstractScheduledTaskHelper<CandidateWorkHistory> {

	private Candidate candidate;
	private CorporateUser candidateOwner;
	private ClientCorporation clientCorporation;
	private JobOrder jobOrder;
	private Placement placement;

	public CandidateWorkHistoryScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, CandidateWorkHistory.class, CandidateWorkHistoryRelatedEntity.CANDIDATE_WORK_HISTORY, relatedEntityFields);
	}

	public CandidateWorkHistory getCandidateWorkHistory() {
        return getEntity();
    }

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getCandidateWorkHistory().getCandidate().getId(), CandidateWorkHistoryRelatedEntity.CANDIDATE);
		}

		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), CandidateWorkHistoryRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

	public Optional<ClientCorporation> getClientCorporation() {
		if (clientCorporation == null && isPopulated(getCandidateWorkHistory().getClientCorporation())) {
			this.clientCorporation = findClientCorporation(getCandidateWorkHistory().getClientCorporation().getId(), CandidateWorkHistoryRelatedEntity.CLIENT_CORPORATION);
		}

		return Optional.ofNullable(clientCorporation);
	}

	public Optional<JobOrder> getJobOrder() {
		if (jobOrder == null && isPopulated(getCandidateWorkHistory().getJobOrder())) {
			this.jobOrder = findJobOrder(getCandidateWorkHistory().getJobOrder().getId(), CandidateWorkHistoryRelatedEntity.JOB_ORDER);
		}

		return Optional.ofNullable(jobOrder);
	}

	public Optional<Placement> getPlacement() {
		if (placement == null && isPopulated(getCandidateWorkHistory().getPlacement())) {
			this.placement = findPlacement(getCandidateWorkHistory().getPlacement().getId(), CandidateWorkHistoryRelatedEntity.PLACEMENT);
		}

		return Optional.ofNullable(placement);
	}

	@Override
    public String toString() {
        return new StringBuilder("CandidateWorkHistoryScheduledTaskHelper {")
                .append("\n\t\"candidate\": ")
                .append(candidate)
                .append(",\n\t\"candidateOwner\": ")
                .append(candidateOwner)
                .append('}')
                .toString();
    }
}
