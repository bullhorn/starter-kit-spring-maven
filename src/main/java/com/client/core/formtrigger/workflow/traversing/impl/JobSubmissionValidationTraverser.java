package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.formtrigger.model.helper.impl.JobSubmissionFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class JobSubmissionValidationTraverser extends AbstractValidationTraverser<JobSubmissionFormTriggerHelper> {

	public JobSubmissionValidationTraverser(FormJobSubmissionDto formJobSubmissionDto, Integer updatingUserID, Integer corporationID,
			boolean edit, BullhornData bullhornData) {
		super(new JobSubmissionFormTriggerHelper(formJobSubmissionDto, updatingUserID, bullhornData), corporationID, edit);

	}

}
