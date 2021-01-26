package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.base.model.helper.impl.PlacementChangeRequestTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class PlacementChangeRequestFormTriggerHelper extends PlacementChangeRequestTriggerHelper implements FormTriggerHelper<FormPlacementChangeRequestDto, PlacementChangeRequest> {

	private final FormPlacementChangeRequestDto formPlacementChangeRequestDto;

	public PlacementChangeRequestFormTriggerHelper(FormPlacementChangeRequestDto formPlacementChangeRequestDto, Integer updatingUserID,
												   Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formPlacementChangeRequestDto = formPlacementChangeRequestDto;
	}

	@Override
	public FormPlacementChangeRequestDto getFormValues() {
		return formPlacementChangeRequestDto;
	}

	@Override
	protected PlacementChangeRequest instantiateNewEntity() {
		return formPlacementChangeRequestDto.instantiateEntity();
	}
}
