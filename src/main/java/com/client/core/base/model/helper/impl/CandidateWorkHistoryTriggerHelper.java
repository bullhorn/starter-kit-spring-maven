package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateWorkHistoryRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class CandidateWorkHistoryTriggerHelper extends AbstractTriggerHelper<CandidateWorkHistory> {

	public CandidateWorkHistoryTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, CandidateWorkHistory.class, CandidateWorkHistoryRelatedEntity.CANDIDATE_WORK_HISTORY, relatedEntityFields);
	}
}
