package com.client.core.resttrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.helper.impl.PlacementTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.PlacementRelatedEntity;
import com.client.core.base.util.TriggerUtil;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class PlacementRestTriggerHelper extends PlacementTriggerHelper implements RestTriggerHelper<Placement> {

	private final Integer entityID;
	private final Map<String, Object> valuesChanged;

	public PlacementRestTriggerHelper(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID,
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
	protected Placement instantiateNewEntity() {
		return TriggerUtil.populateEntity(entityID, Placement.class, valuesChanged, Placement::new, getFields(PlacementRelatedEntity.PLACEMENT));
	}

}
