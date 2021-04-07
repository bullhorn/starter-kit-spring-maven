package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.JobOrderRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class JobOrderRestTriggerTraverser extends AbstractTriggerTraverser<JobOrder, JobOrderRestTriggerHelper> {

	public JobOrderRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
										Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new JobOrderRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
