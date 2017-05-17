package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.impl.OpportunityFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.OpportunityFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class OpportunityFormTriggerValidator
        extends AbstractFormTriggerValidator<Opportunity, FormOpportunityDto, OpportunityFormTriggerHelper, OpportunityFormTriggerTraverser> {

    public OpportunityFormTriggerValidator(Integer order) {
        super(order);
    }

    public OpportunityFormTriggerValidator() {
    }

}