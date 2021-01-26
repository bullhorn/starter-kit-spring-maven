package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.relatedentity.JobSubmissionRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.helper.impl.JobSubmissionFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.JobSubmissionFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobSubmissionFormTriggerValidator
        extends AbstractFormTriggerValidator<JobSubmission, FormJobSubmissionDto, JobSubmissionFormTriggerHelper, JobSubmissionFormTriggerTraverser> {

    public JobSubmissionFormTriggerValidator(Integer order, Map<JobSubmissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobSubmissionFormTriggerValidator(Map<JobSubmissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
