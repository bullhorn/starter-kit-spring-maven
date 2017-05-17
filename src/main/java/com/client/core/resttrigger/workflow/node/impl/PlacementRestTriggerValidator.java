package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.resttrigger.model.helper.impl.PlacementRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.PlacementRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class PlacementRestTriggerValidator extends AbstractRestTriggerValidator<Placement, PlacementRestTriggerHelper, PlacementRestTriggerTraverser> {

    public PlacementRestTriggerValidator(Integer order) {
        super(order);
    }

    public PlacementRestTriggerValidator() {
    }

}