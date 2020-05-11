package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.JobSubmissionCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.JobSubmissionCertificationRequirementEventTraverser;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */
public abstract class JobSubmissionCertificationRequirementEventTask extends AbstractEventTask<JobSubmissionCertificationRequirement, JobSubmissionCertificationRequirementScheduledTaskHelper, JobSubmissionCertificationRequirementEventTraverser> {

    public JobSubmissionCertificationRequirementEventTask(Integer order) {
        super(order);
    }

    public JobSubmissionCertificationRequirementEventTask() {
    }

}
