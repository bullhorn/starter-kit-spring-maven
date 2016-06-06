package com.client.custom.service.formtrigger;

import com.client.core.formtrigger.workflow.traversing.impl.PlacementValidationTraverser;

/**
 * Created by john.sullivan on 6/6/2016.
 */
public interface PlacementFormTriggerService {

    boolean isPlacementApproved(PlacementValidationTraverser tasks);

    void validateApprovedPlacement(PlacementValidationTraverser tasks);

}
