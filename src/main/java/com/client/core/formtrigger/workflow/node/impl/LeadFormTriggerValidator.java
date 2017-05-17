package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.impl.LeadFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.LeadFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class LeadFormTriggerValidator
        extends AbstractFormTriggerValidator<Lead, FormLeadDto, LeadFormTriggerHelper, LeadFormTriggerTraverser> {

    public LeadFormTriggerValidator(Integer order) {
        super(order);
    }

    public LeadFormTriggerValidator() {
    }

}