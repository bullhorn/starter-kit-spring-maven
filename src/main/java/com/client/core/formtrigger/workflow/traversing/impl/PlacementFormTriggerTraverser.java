package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.model.helper.impl.PlacementFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class PlacementFormTriggerTraverser extends AbstractTriggerTraverser<Placement, PlacementFormTriggerHelper> {

    public PlacementFormTriggerTraverser(FormPlacementDto formPlacementDto, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
		super(new PlacementFormTriggerHelper(formPlacementDto, updatingUserID, bullhornData), edit);
	}

}
