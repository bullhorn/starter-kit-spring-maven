package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
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

	public JobValidationTraverser(FormJobOrderDto formJobOrderDto, Integer updatingUserID, boolean edit,
			BullhornData bullhornData) {
		super(new JobOrderFormTriggerHelper(formJobOrderDto, updatingUserID, bullhornData), edit);

	}

    public JobValidationTraverser(JobOrder jobOrder, Integer updatingUserID, boolean edit,
                                  boolean restTrigger, BullhornData bullhornData) {
        super(new JobOrderFormTriggerHelper(jobOrder, updatingUserID, bullhornData), edit, restTrigger);

    }

}
