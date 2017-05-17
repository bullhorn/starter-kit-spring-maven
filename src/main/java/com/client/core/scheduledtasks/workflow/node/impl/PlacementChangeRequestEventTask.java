package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.scheduledtasks.model.helper.impl.PlacementChangeRequestScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementChangeRequestEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class PlacementChangeRequestEventTask extends AbstractEventTask<PlacementChangeRequest, PlacementChangeRequestScheduledTaskHelper, PlacementChangeRequestEventTraverser> {

    public PlacementChangeRequestEventTask(Integer order) {
        super(order);
    }

    public PlacementChangeRequestEventTask() {
    }

}