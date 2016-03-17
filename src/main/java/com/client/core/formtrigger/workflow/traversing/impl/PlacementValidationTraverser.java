package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
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

	public PlacementValidationTraverser(FormPlacementDto formPlacementDto, Integer updatingUserID, boolean edit,
			BullhornData bullhornData) {
		super(new PlacementFormTriggerHelper(formPlacementDto, updatingUserID, bullhornData), edit);
	}

    public PlacementValidationTraverser(Placement placement, Integer updatingUserID, boolean edit,
                                        boolean restTrigger, BullhornData bullhornData) {
        super(new PlacementFormTriggerHelper(placement, updatingUserID, bullhornData), edit, restTrigger);
    }

}
