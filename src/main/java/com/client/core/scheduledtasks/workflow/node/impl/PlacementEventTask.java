package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.PlacementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementEventTask extends AbstractEventTask<Placement, PlacementScheduledTaskHelper, PlacementEventTraverser> {

    public PlacementEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
