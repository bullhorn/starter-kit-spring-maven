package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.OpportunityRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.OpportunityScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.OpportunityEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class OpportunityEventListTask extends AbstractEventListTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventListTraverser> {

    public OpportunityEventListTask(Integer order, Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public OpportunityEventListTask(Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
