package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;
import com.client.core.formtrigger.model.helper.impl.PlacementChangeRequestFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.PlacementChangeRequestFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class PlacementChangeRequestFormTriggerValidator
        extends AbstractFormTriggerValidator<PlacementChangeRequest, FormPlacementChangeRequestDto, PlacementChangeRequestFormTriggerHelper, PlacementChangeRequestFormTriggerTraverser> {

    public PlacementChangeRequestFormTriggerValidator(Integer order) {
        super(order);
    }

    public PlacementChangeRequestFormTriggerValidator() {
    }

}