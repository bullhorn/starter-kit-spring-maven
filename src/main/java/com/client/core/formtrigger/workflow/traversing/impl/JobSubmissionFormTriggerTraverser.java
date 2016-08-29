package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.helper.impl.JobSubmissionFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class JobSubmissionFormTriggerTraverser extends AbstractTriggerTraverser<JobSubmission, JobSubmissionFormTriggerHelper> {

	public JobSubmissionFormTriggerTraverser(FormJobSubmissionDto formJobSubmissionDto, Integer updatingUserID,
                                             boolean edit, BullhornData bullhornData) {
		super(new JobSubmissionFormTriggerHelper(formJobSubmissionDto, updatingUserID, bullhornData), edit);

	}

}
