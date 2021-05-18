package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.client.core.base.model.relatedentity.credentialing.JobSubmissionCertificationRequirementRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.JobSubmissionCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventListTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.JobSubmissionCertificationRequirementEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobSubmissionCertificationRequirementEventListTask extends AbstractEventListTask<JobSubmissionCertificationRequirement, JobSubmissionCertificationRequirementScheduledTaskHelper, JobSubmissionCertificationRequirementEventListTraverser> {

    public JobSubmissionCertificationRequirementEventListTask(Integer order, Map<JobSubmissionCertificationRequirementRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobSubmissionCertificationRequirementEventListTask(Map<JobSubmissionCertificationRequirementRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
