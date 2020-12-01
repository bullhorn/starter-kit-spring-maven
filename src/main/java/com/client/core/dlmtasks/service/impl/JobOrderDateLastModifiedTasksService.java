package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobOrderDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<JobOrder> {

    @Autowired
    public JobOrderDateLastModifiedTasksService(List<DateLastModifiedEventTask<JobOrder>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, JobOrder.class);
    }

}
