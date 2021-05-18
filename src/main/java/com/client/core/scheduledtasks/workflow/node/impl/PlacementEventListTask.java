package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.relatedentity.PlacementRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.PlacementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementEventListTask extends AbstractEventListTask<Placement, PlacementScheduledTaskHelper, PlacementEventListTraverser> {

    public PlacementEventListTask(Integer order, Map<PlacementRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementEventListTask(Map<PlacementRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
