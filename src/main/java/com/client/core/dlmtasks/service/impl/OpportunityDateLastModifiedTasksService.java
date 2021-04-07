package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpportunityDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<Opportunity> {

    @Autowired
    public OpportunityDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<Opportunity>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Opportunity.class);
    }

}
