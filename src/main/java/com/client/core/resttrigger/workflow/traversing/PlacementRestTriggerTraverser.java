package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.PlacementRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class PlacementRestTriggerTraverser extends AbstractTriggerTraverser<Placement, PlacementRestTriggerHelper> {

	public PlacementRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
										 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new PlacementRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
