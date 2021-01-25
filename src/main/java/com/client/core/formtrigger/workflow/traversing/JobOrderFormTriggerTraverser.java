package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.helper.impl.JobOrderFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class JobOrderFormTriggerTraverser extends AbstractTriggerTraverser<JobOrder, JobOrderFormTriggerHelper> {

	public JobOrderFormTriggerTraverser(FormJobOrderDto formJobOrderDto, Integer updatingUserID, boolean edit,
										Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new JobOrderFormTriggerHelper(formJobOrderDto, updatingUserID, relatedEntityFields), edit);
	}

}
