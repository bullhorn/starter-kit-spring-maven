package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlacementDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<Placement> {

    @Autowired
    public PlacementDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<Placement>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Placement.class);
    }

}
