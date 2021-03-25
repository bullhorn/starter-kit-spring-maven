package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateReferenceRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class CandidateReferenceTriggerHelper extends AbstractTriggerHelper<CandidateReference> {

	public CandidateReferenceTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, CandidateReference.class, CandidateReferenceRelatedEntity.CANDIDATE_REFERENCE, relatedEntityFields);
	}
}
