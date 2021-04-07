package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.relatedentity.PlacementRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.PlacementRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.PlacementRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementRestTriggerValidator extends AbstractRestTriggerValidator<Placement, PlacementRestTriggerHelper, PlacementRestTriggerTraverser> {

    public PlacementRestTriggerValidator(Integer order, Map<PlacementRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementRestTriggerValidator(Map<PlacementRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
