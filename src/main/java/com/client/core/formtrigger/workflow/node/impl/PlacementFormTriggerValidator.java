package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.model.helper.impl.PlacementFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.PlacementFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class PlacementFormTriggerValidator
        extends AbstractFormTriggerValidator<Placement, FormPlacementDto, PlacementFormTriggerHelper, PlacementFormTriggerTraverser> {

    public PlacementFormTriggerValidator(Integer order) {
        super(order);
    }

    public PlacementFormTriggerValidator() {
    }

}