package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.OpportunityRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.OpportunityScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.OpportunityEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class OpportunityEventTask extends AbstractEventTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventTraverser> {

    public OpportunityEventTask(Integer order, Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public OpportunityEventTask(Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
