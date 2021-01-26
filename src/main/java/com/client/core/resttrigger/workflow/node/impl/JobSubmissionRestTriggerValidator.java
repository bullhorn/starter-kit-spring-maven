package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.relatedentity.JobSubmissionRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.JobSubmissionRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.JobSubmissionRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobSubmissionRestTriggerValidator extends AbstractRestTriggerValidator<JobSubmission, JobSubmissionRestTriggerHelper, JobSubmissionRestTriggerTraverser> {

    public JobSubmissionRestTriggerValidator(Integer order, Map<JobSubmissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobSubmissionRestTriggerValidator(Map<JobSubmissionRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
