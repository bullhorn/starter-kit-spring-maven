package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.helper.impl.JobOrderFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class JobFormTriggerTraverser extends AbstractTriggerTraverser<JobOrder, JobOrderFormTriggerHelper> {

	public JobFormTriggerTraverser(FormJobOrderDto formJobOrderDto, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
		super(new JobOrderFormTriggerHelper(formJobOrderDto, updatingUserID, bullhornData), edit);
	}

}
