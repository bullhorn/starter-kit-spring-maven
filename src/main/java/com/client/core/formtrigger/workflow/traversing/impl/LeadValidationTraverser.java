package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.impl.LeadFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 *
 * Created by hiqbal on 12/23/2015.
 *
 */
public class LeadValidationTraverser extends AbstractValidationTraverser<LeadFormTriggerHelper> {

    public LeadValidationTraverser(FormLeadDto formLeadDto, Integer updatingUserID, boolean edit,
                                   BullhornData bullhornData) {
        super(new LeadFormTriggerHelper(formLeadDto, updatingUserID, bullhornData), edit);

    }

    public LeadValidationTraverser(Lead lead, Integer updatingUserID, boolean edit,
                                   boolean restTrigger, BullhornData bullhornData) {
        super(new LeadFormTriggerHelper(lead, updatingUserID, bullhornData), edit, restTrigger);

    }
}
