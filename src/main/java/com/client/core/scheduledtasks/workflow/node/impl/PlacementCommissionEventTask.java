package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.client.core.base.model.relatedentity.PlacementCommissionRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.PlacementCommissionScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementCommissionEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementCommissionEventTask extends AbstractEventTask<PlacementCommission, PlacementCommissionScheduledTaskHelper, PlacementCommissionEventTraverser> {

    public PlacementCommissionEventTask(Integer order, Map<PlacementCommissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementCommissionEventTask(Map<PlacementCommissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
