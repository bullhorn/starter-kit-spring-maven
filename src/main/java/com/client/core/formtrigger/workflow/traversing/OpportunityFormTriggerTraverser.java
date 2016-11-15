package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.impl.OpportunityFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class OpportunityFormTriggerTraverser extends AbstractTriggerTraverser<Opportunity, OpportunityFormTriggerHelper> {

	public OpportunityFormTriggerTraverser(FormOpportunityDto formOpportunityDto, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
		super(new OpportunityFormTriggerHelper(formOpportunityDto, updatingUserID, bullhornData), edit);
	}

}
