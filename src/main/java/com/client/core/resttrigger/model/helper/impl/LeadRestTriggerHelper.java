package com.client.core.resttrigger.model.helper.impl;

import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.helper.impl.LeadTriggerHelper;
import com.client.core.base.util.TriggerUtil;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formLeadDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class LeadRestTriggerHelper extends LeadTriggerHelper implements RestTriggerHelper<Lead> {

	private final Integer entityID;
	private final Map<String, Object> valuesChanged;

	public LeadRestTriggerHelper(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.entityID = entityID;
		this.valuesChanged = valuesChanged;
	}

	@Override
	public Lead getNewEntity() {
		if(newEntity == null) {
			setNewEntity(TriggerUtil.populateEntity(entityID, Lead.class, valuesChanged));
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
