package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.model.helper.impl.PlacementFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class PlacementFormTriggerTraverser extends AbstractTriggerTraverser<Placement, PlacementFormTriggerHelper> {

    public PlacementFormTriggerTraverser(FormPlacementDto formPlacementDto, Integer updatingUserID, boolean edit,
										 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new PlacementFormTriggerHelper(formPlacementDto, updatingUserID, relatedEntityFields), edit);
	}

}
