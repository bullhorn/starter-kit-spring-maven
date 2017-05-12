package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.scheduledtasks.model.helper.impl.PlacementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class PlacementEventTask extends AbstractEventTask<Placement, PlacementScheduledTaskHelper, PlacementEventTraverser> {

    public PlacementEventTask(Integer order) {
        super(order);
    }

    public PlacementEventTask() {
    }

}