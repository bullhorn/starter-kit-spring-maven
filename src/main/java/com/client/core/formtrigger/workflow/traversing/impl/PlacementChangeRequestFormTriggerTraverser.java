package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;
import com.client.core.formtrigger.model.helper.impl.PlacementChangeRequestFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class PlacementChangeRequestFormTriggerTraverser extends AbstractTriggerTraverser<PlacementChangeRequest, PlacementChangeRequestFormTriggerHelper> {

	public PlacementChangeRequestFormTriggerTraverser(FormPlacementChangeRequestDto formPlacementChangeRequestDto, Integer updatingUserID,
                                                      boolean edit, BullhornData bullhornData) {
		super(new PlacementChangeRequestFormTriggerHelper(formPlacementChangeRequestDto, updatingUserID, bullhornData),
				edit);
	}

}
