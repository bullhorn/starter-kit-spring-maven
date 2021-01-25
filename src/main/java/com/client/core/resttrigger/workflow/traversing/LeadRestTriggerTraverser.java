package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.LeadRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class LeadRestTriggerTraverser extends AbstractTriggerTraverser<Lead, LeadRestTriggerHelper> {

	public LeadRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
									Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new LeadRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
