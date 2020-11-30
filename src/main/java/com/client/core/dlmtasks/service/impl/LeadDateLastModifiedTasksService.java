package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<Lead> {

    @Autowired
    public LeadDateLastModifiedTasksService(List<DateLastModifiedEventTask<Lead>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Lead.class);
    }

}
