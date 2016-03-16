package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.formtrigger.model.helper.impl.PlacementFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class PlacementValidationTraverser extends AbstractValidationTraverser<PlacementFormTriggerHelper> {

	public PlacementValidationTraverser(FormPlacementDto formPlacementDto, Integer updatingUserID, Integer corporationID, boolean edit,
			BullhornData bullhornData) {
		super(new PlacementFormTriggerHelper(formPlacementDto, updatingUserID, bullhornData), corporationID, edit);
	}
}
