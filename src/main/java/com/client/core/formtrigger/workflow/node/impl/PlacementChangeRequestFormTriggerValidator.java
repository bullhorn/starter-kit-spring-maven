package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.base.model.relatedentity.PlacementChangeRequestRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;
import com.client.core.formtrigger.model.helper.impl.PlacementChangeRequestFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.PlacementChangeRequestFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class PlacementChangeRequestFormTriggerValidator
        extends AbstractFormTriggerValidator<PlacementChangeRequest, FormPlacementChangeRequestDto, PlacementChangeRequestFormTriggerHelper, PlacementChangeRequestFormTriggerTraverser> {

    public PlacementChangeRequestFormTriggerValidator(Integer order, Map<PlacementChangeRequestRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public PlacementChangeRequestFormTriggerValidator(Map<PlacementChangeRequestRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
