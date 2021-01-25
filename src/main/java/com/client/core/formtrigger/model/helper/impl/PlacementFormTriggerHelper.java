package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.base.model.helper.impl.PlacementTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class PlacementFormTriggerHelper extends PlacementTriggerHelper implements FormTriggerHelper<FormPlacementDto, Placement> {

	private final FormPlacementDto formPlacementDto;

	public PlacementFormTriggerHelper(FormPlacementDto formPlacementDto, Integer updatingUserID,
									  Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formPlacementDto = formPlacementDto;
	}

	@Override
	public FormPlacementDto getFormValues() {
		return formPlacementDto;
	}

	@Override
	protected Placement instantiateNewEntity() {
		return formPlacementDto.instantiateEntity();
	}

}
