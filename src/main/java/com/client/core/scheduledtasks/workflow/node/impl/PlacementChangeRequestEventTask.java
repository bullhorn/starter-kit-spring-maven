package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.PlacementChangeRequestScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementChangeRequestEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementChangeRequestEventTask extends AbstractEventTask<PlacementChangeRequest, PlacementChangeRequestScheduledTaskHelper, PlacementChangeRequestEventTraverser> {

    public PlacementChangeRequestEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementChangeRequestEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
