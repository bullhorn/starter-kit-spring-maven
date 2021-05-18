package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.client.core.base.model.relatedentity.PlacementCommissionRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.PlacementCommissionScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementCommissionEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementCommissionEventListTask extends AbstractEventListTask<PlacementCommission, PlacementCommissionScheduledTaskHelper, PlacementCommissionEventListTraverser> {

    public PlacementCommissionEventListTask(Integer order, Map<PlacementCommissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementCommissionEventListTask(Map<PlacementCommissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
