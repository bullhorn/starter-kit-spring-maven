package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.resttrigger.model.helper.impl.LeadRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.LeadRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class LeadRestTriggerValidator extends AbstractRestTriggerValidator<Lead, LeadRestTriggerHelper, LeadRestTriggerTraverser> {

    public LeadRestTriggerValidator(Integer order) {
        super(order);
    }

    public LeadRestTriggerValidator() {
    }

}