package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.client.core.scheduledtasks.model.helper.impl.PlacementCommissionScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementCommissionEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class PlacementCommissionEventTask extends AbstractEventTask<PlacementCommission, PlacementCommissionScheduledTaskHelper, PlacementCommissionEventTraverser> {

    public PlacementCommissionEventTask(Integer order) {
        super(order);
    }

    public PlacementCommissionEventTask() {
    }

}