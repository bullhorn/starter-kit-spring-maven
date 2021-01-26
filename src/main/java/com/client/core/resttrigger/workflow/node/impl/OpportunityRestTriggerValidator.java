package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.OpportunityRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.OpportunityRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.OpportunityRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class OpportunityRestTriggerValidator extends AbstractRestTriggerValidator<Opportunity, OpportunityRestTriggerHelper, OpportunityRestTriggerTraverser> {

    public OpportunityRestTriggerValidator(Integer order, Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public OpportunityRestTriggerValidator(Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
