package com.client.custom.workflow.node.formtrigger.conditional.placement;

import org.springframework.beans.factory.annotation.Autowired;

import com.client.core.base.workflow.node.conditional.Conditional;
import com.client.core.formtrigger.workflow.traversing.impl.PlacementValidationTraverser;
import com.client.custom.service.formtrigger.PlacementFormTriggerService;

/**
 * Created by john.sullivan on 6/6/2016.
 */
public class IsPlacementApproved extends Conditional<PlacementValidationTraverser> {

    @Autowired
    private PlacementFormTriggerService placementFormTriggerService;

    @Override
    protected void evaluate(PlacementValidationTraverser tasks) {
        if(placementFormTriggerService.isPlacementApproved(tasks)) {
            yes(tasks);
        } else {
            no(tasks);
        }
    }
}
