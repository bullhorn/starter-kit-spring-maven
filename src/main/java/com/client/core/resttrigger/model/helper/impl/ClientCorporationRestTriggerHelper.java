package com.client.core.resttrigger.model.helper.impl;

import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.helper.impl.ClientCorporationTriggerHelper;
import com.client.core.base.util.TriggerUtil;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formClientCorporationDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class ClientCorporationRestTriggerHelper extends ClientCorporationTriggerHelper implements RestTriggerHelper<ClientCorporation> {

	private final Integer entityID;
	private final Map<String, Object> valuesChanged;

	public ClientCorporationRestTriggerHelper(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.entityID = entityID;
		this.valuesChanged = valuesChanged;
	}

	@Override
	public ClientCorporation getNewEntity() {
		if(newEntity == null) {
			setNewEntity(TriggerUtil.populateEntity(entityID, ClientCorporation.class, valuesChanged, ClientCorporation::new));
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
