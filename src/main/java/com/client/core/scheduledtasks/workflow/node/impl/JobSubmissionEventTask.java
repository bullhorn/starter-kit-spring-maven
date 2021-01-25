package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.JobSubmissionScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobSubmissionEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobSubmissionEventTask extends AbstractEventTask<JobSubmission, JobSubmissionScheduledTaskHelper, JobSubmissionEventTraverser> {

    public JobSubmissionEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobSubmissionEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
