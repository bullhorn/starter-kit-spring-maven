package com.client.custom.workflow.node.scheduledtask.task;

import org.springframework.beans.factory.annotation.Autowired;

import com.client.core.base.workflow.node.task.Task;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;
import com.client.custom.service.scheduledtask.PlacementScheduledTaskService;

/**
 * Created by john.sullivan on 7/6/2016.
 */
public class UpdateCandidateStatusToActive extends Task<PlacementEventTraverser> {

    @Autowired
    private PlacementScheduledTaskService placementScheduledTaskService;

    @Override
    protected void handle(PlacementEventTraverser tasks) {
        placementScheduledTaskService.updateCandidateStatusToActive(tasks);
    }
}
