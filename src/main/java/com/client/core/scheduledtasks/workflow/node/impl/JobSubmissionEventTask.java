package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.scheduledtasks.model.helper.impl.JobSubmissionScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobSubmissionEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class JobSubmissionEventTask extends AbstractEventTask<JobSubmission, JobSubmissionScheduledTaskHelper, JobSubmissionEventTraverser> {

    public JobSubmissionEventTask(Integer order) {
        super(order);
    }

    public JobSubmissionEventTask() {
    }

}