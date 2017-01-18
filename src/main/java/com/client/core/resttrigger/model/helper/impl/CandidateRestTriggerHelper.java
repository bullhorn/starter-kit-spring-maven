package com.client.core.resttrigger.model.helper.impl;

import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.helper.impl.CandidateTriggerHelper;
import com.client.core.base.util.TriggerUtil;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formCandidateDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class CandidateRestTriggerHelper extends CandidateTriggerHelper implements RestTriggerHelper<Candidate> {

	private final Integer entityID;
	private final Map<String, Object> valuesChanged;

	public CandidateRestTriggerHelper(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.entityID = entityID;
		this.valuesChanged = valuesChanged;
	}

	@Override
	public Candidate getNewEntity() {
		if(newEntity == null) {
			setNewEntity(TriggerUtil.populateEntity(entityID, Candidate.class, valuesChanged, Candidate::new));
		}

		return newEntity;
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
}
