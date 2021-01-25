package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;
import com.client.core.formtrigger.model.helper.impl.PlacementChangeRequestFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class PlacementChangeRequestFormTriggerTraverser extends AbstractTriggerTraverser<PlacementChangeRequest, PlacementChangeRequestFormTriggerHelper> {

	public PlacementChangeRequestFormTriggerTraverser(FormPlacementChangeRequestDto formPlacementChangeRequestDto, Integer updatingUserID, boolean edit,
													  Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new PlacementChangeRequestFormTriggerHelper(formPlacementChangeRequestDto, updatingUserID, relatedEntityFields), edit);
	}

}
