package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.impl.OpportunityFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class OpportunityValidationTraverser extends AbstractValidationTraverser<OpportunityFormTriggerHelper> {

	public OpportunityValidationTraverser(FormOpportunityDto formOpportunityDto, Integer updatingUserID, boolean edit,
                                          BullhornData bullhornData) {
		super(new OpportunityFormTriggerHelper(formOpportunityDto, updatingUserID, bullhornData), edit);

	}

	public OpportunityValidationTraverser(Opportunity opportunity, Integer updatingUserID, boolean edit,
                                          boolean restTrigger, BullhornData bullhornData) {
		super(new OpportunityFormTriggerHelper(opportunity, updatingUserID, bullhornData), edit, restTrigger);
	}

}
