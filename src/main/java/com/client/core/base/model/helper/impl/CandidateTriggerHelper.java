package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.fields.RelatedTriggerEntity;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.fields.CandidateTriggerEntity;

import java.util.Map;
import java.util.Set;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formCandidateDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class CandidateTriggerHelper extends AbstractTriggerHelper<Candidate> {

	private CorporateUser candidateOwner;

	public CandidateTriggerHelper(Integer updatingUserID, BullhornData bullhornData, Map<? extends RelatedTriggerEntity, Set<String>> triggerEntityFields) {
		super(updatingUserID, bullhornData, triggerEntityFields);
	}

	@Override
	public Candidate getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findCandidate(getNewEntity().getId(), CandidateTriggerEntity.CANDIDATE));
		}

		return oldEntity;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getNewEntity().getOwner().getId(), CandidateTriggerEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

}
