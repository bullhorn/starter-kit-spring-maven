package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.formtrigger.model.helper.impl.PlacementChangeRequestFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class PlacementChangeRequestValidationTraverser extends AbstractValidationTraverser<PlacementChangeRequestFormTriggerHelper> {

	public PlacementChangeRequestValidationTraverser(FormPlacementChangeRequestDto formPlacementChangeRequestDto, Integer updatingUserID,
			boolean edit, BullhornData bullhornData) {
		super(new PlacementChangeRequestFormTriggerHelper(formPlacementChangeRequestDto, updatingUserID, bullhornData),
				edit);
	}

}
