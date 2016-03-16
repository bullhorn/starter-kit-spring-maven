package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.formtrigger.model.helper.impl.JobOrderFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class JobValidationTraverser extends AbstractValidationTraverser<JobOrderFormTriggerHelper> {

	public JobValidationTraverser(FormJobOrderDto formJobOrderDto, Integer updatingUserID, Integer corporationID, boolean edit,
			BullhornData bullhornData) {
		super(new JobOrderFormTriggerHelper(formJobOrderDto, updatingUserID, bullhornData), corporationID, edit);

	}

}
