package com.client.custom.workflow.node.scheduledtask.conditional;

import org.springframework.beans.factory.annotation.Autowired;

import com.client.core.base.workflow.node.conditional.Conditional;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;
import com.client.custom.service.scheduledtask.PlacementScheduledTaskService;

/**
 * Created by john.sullivan on 7/6/2016.
 */
public class IsPlacementCompleted extends Conditional<PlacementEventTraverser> {

    @Autowired
    private PlacementScheduledTaskService placementScheduledTaskService;

    @Override
    protected void evaluate(PlacementEventTraverser tasks) {
        if(placementScheduledTaskService.isPlacementCompleted(tasks)) {
            yes(tasks);
        } else {
            no(tasks);
        }
    }
}
