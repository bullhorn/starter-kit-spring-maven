package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.OpportunityScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.OpportunityEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class OpportunityEventTask extends AbstractEventTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventTraverser> {

    public OpportunityEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public OpportunityEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
