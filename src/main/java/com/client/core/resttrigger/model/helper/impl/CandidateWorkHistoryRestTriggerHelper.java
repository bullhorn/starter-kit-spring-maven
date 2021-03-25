package com.client.core.resttrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.base.model.helper.impl.CandidateWorkHistoryTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateWorkHistoryRelatedEntity;
import com.client.core.base.util.TriggerUtil;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class CandidateWorkHistoryRestTriggerHelper extends CandidateWorkHistoryTriggerHelper implements RestTriggerHelper<CandidateWorkHistory> {

	private final Integer entityID;
	private final Map<String, Object> valuesChanged;

	public CandidateWorkHistoryRestTriggerHelper(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID,
                                                 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.entityID = entityID;
		this.valuesChanged = valuesChanged;
	}

	@Override
	public Set<String> getPopulatedFields() {
		return valuesChanged.keySet();
	}

	@Override
	public Integer getEntityID() {
		return entityID;
	}

	@Override
	public Map<String, Object> getValuesChanged() {
		return valuesChanged;
	}

	@Override
	protected CandidateWorkHistory instantiateNewEntity() {
		return TriggerUtil.populateEntity(entityID, CandidateWorkHistory.class, valuesChanged, CandidateWorkHistory::new, getFields(CandidateWorkHistoryRelatedEntity.CANDIDATE_WORK_HISTORY));
	}
}
