package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.relatedentity.PlacementRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.model.helper.impl.PlacementFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.PlacementFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementFormTriggerValidator
        extends AbstractFormTriggerValidator<Placement, FormPlacementDto, PlacementFormTriggerHelper, PlacementFormTriggerTraverser> {

    public PlacementFormTriggerValidator(Integer order, Map<PlacementRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementFormTriggerValidator(Map<PlacementRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
