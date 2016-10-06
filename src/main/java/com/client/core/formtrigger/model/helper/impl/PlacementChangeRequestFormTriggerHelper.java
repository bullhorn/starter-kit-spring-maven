package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.base.model.helper.impl.PlacementChangeRequestTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * 
 * 
 * @author magnus.palm
 * 
 * 
 */
public class PlacementChangeRequestFormTriggerHelper extends PlacementChangeRequestTriggerHelper implements FormTriggerHelper<FormPlacementChangeRequestDto, PlacementChangeRequest> {

	private final FormPlacementChangeRequestDto formPlacementChangeRequestDto;

	public PlacementChangeRequestFormTriggerHelper(FormPlacementChangeRequestDto formPlacementChangeRequestDto, Integer updatingUserID,
			BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formPlacementChangeRequestDto = formPlacementChangeRequestDto;
	}

	@Override
	public FormPlacementChangeRequestDto getFormValues() {
		return formPlacementChangeRequestDto;
	}

	@Override
	public PlacementChangeRequest getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formPlacementChangeRequestDto.instantiateEntity());
		}

		return newEntity;
	}

}
