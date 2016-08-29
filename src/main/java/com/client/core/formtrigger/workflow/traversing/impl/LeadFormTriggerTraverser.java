package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.impl.LeadFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 *
 * Created by hiqbal on 12/23/2015.
 *
 */
public class LeadFormTriggerTraverser extends AbstractTriggerTraverser<Lead, LeadFormTriggerHelper> {

    public LeadFormTriggerTraverser(FormLeadDto formLeadDto, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
        super(new LeadFormTriggerHelper(formLeadDto, updatingUserID, bullhornData), edit);
    }
}
