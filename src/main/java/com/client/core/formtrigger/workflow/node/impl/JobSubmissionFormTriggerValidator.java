package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.helper.impl.JobSubmissionFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.JobSubmissionFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class JobSubmissionFormTriggerValidator
        extends AbstractFormTriggerValidator<JobSubmission, FormJobSubmissionDto, JobSubmissionFormTriggerHelper, JobSubmissionFormTriggerTraverser> {

    public JobSubmissionFormTriggerValidator(Integer order) {
        super(order);
    }

    public JobSubmissionFormTriggerValidator() {
    }

}