package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.resttrigger.model.helper.impl.OpportunityRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.OpportunityRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class OpportunityRestTriggerValidator extends AbstractRestTriggerValidator<Opportunity, OpportunityRestTriggerHelper, OpportunityRestTriggerTraverser> {

    public OpportunityRestTriggerValidator(Integer order) {
        super(order);
    }

    public OpportunityRestTriggerValidator() {
    }

}