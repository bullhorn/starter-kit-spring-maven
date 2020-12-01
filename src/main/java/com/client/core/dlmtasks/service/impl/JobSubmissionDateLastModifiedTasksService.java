package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSubmissionDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<JobSubmission> {

    @Autowired
    public JobSubmissionDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<JobSubmission>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, JobSubmission.class);
    }

}
