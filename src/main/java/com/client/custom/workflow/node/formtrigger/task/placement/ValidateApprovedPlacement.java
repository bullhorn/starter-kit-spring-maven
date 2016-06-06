package com.client.custom.workflow.node.formtrigger.task.placement;

import org.springframework.beans.factory.annotation.Autowired;

import com.client.core.base.workflow.node.task.Task;
import com.client.core.formtrigger.workflow.traversing.impl.PlacementValidationTraverser;
import com.client.custom.service.formtrigger.PlacementFormTriggerService;

/**
 * Created by john.sullivan on 6/6/2016.
 */
public class ValidateApprovedPlacement extends Task<PlacementValidationTraverser> {

    @Autowired
    private PlacementFormTriggerService placementFormTriggerService;

    @Override
    protected void handle(PlacementValidationTraverser tasks) {
        placementFormTriggerService.validateApprovedPlacement(tasks);
    }

}
