package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.impl.OpportunityFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class OpportunityFormTriggerTraverser extends AbstractTriggerTraverser<Opportunity, OpportunityFormTriggerHelper> {

	public OpportunityFormTriggerTraverser(FormOpportunityDto formOpportunityDto, Integer updatingUserID, boolean edit,
										   Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new OpportunityFormTriggerHelper(formOpportunityDto, updatingUserID, relatedEntityFields), edit);
	}

}
