package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.base.model.relatedentity.PlacementChangeRequestRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.PlacementChangeRequestScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementChangeRequestEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementChangeRequestEventListTask extends AbstractEventListTask<PlacementChangeRequest, PlacementChangeRequestScheduledTaskHelper, PlacementChangeRequestEventListTraverser> {

    public PlacementChangeRequestEventListTask(Integer order, Map<PlacementChangeRequestRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementChangeRequestEventListTask(Map<PlacementChangeRequestRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
