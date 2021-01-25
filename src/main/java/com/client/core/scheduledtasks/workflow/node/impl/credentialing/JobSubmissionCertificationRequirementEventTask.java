package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.JobSubmissionCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.JobSubmissionCertificationRequirementEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobSubmissionCertificationRequirementEventTask extends AbstractEventTask<JobSubmissionCertificationRequirement, JobSubmissionCertificationRequirementScheduledTaskHelper, JobSubmissionCertificationRequirementEventTraverser> {

    public JobSubmissionCertificationRequirementEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobSubmissionCertificationRequirementEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
