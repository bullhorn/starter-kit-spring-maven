package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.helper.impl.ClientCorporationTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class ClientCorporationFormTriggerHelper extends ClientCorporationTriggerHelper implements FormTriggerHelper<FormClientCorporationDto, ClientCorporation> {

	private final FormClientCorporationDto formClientCorporationDto;

	public ClientCorporationFormTriggerHelper(FormClientCorporationDto formClientCorporationDto, Integer updatingUserID,
											  Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formClientCorporationDto = formClientCorporationDto;
	}

	@Override
	public FormClientCorporationDto getFormValues() {
		return formClientCorporationDto;
	}

	@Override
	protected ClientCorporation instantiateNewEntity() {
		return formClientCorporationDto.instantiateEntity();
	}

}
