package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.OpportunityRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class OpportunityRestTriggerTraverser extends AbstractTriggerTraverser<Opportunity, OpportunityRestTriggerHelper> {

	public OpportunityRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
										   Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new OpportunityRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
