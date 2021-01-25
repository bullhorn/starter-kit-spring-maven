package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class CandidateTriggerHelper extends AbstractTriggerHelper<Candidate> {

	private CorporateUser candidateOwner;

	public CandidateTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, Candidate.class, CandidateRelatedEntity.CANDIDATE, relatedEntityFields);
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getNewEntity().getOwner().getId(), CandidateRelatedEntity.CANDIDATE_OWNER);
		}

		return candidateOwner;
	}

}
