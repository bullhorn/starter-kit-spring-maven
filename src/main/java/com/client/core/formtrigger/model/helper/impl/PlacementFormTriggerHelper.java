package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.helper.impl.PlacementTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * @author magnus.palm
 * 
 * 
 */
public class PlacementFormTriggerHelper extends PlacementTriggerHelper implements FormTriggerHelper<FormPlacementDto, Placement> {

	private final FormPlacementDto formPlacementDto;

	public PlacementFormTriggerHelper(FormPlacementDto formPlacementDto, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formPlacementDto = formPlacementDto;
	}

	@Override
	public FormPlacementDto getFormValues() {
		return formPlacementDto;
	}

	@Override
	public Placement getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formPlacementDto.instantiateEntity());
		}

		return newEntity;
	}

}
