package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.helper.impl.ClientCorporationTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formClientCorporationDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class ClientCorporationFormTriggerHelper extends ClientCorporationTriggerHelper implements FormTriggerHelper<FormClientCorporationDto, ClientCorporation> {

	private final FormClientCorporationDto formClientCorporationDto;

	public ClientCorporationFormTriggerHelper(FormClientCorporationDto formClientCorporationDto, Integer updatingUserID,
			BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formClientCorporationDto = formClientCorporationDto;
	}

	@Override
	public ClientCorporation getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formClientCorporationDto.instantiateEntity());
		}

		return newEntity;
	}

	@Override
	public FormClientCorporationDto getFormValues() {
		return formClientCorporationDto;
	}

}
