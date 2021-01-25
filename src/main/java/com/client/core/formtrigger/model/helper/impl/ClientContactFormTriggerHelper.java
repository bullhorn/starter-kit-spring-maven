package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.helper.impl.ClientContactTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class ClientContactFormTriggerHelper extends ClientContactTriggerHelper implements FormTriggerHelper<FormClientContactDto, ClientContact> {

	private final FormClientContactDto formClientContactDto;

	public ClientContactFormTriggerHelper(FormClientContactDto formClientContactDto, Integer updatingUserID,
										  Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formClientContactDto = formClientContactDto;
	}

	@Override
	public FormClientContactDto getFormValues() {
		return formClientContactDto;
	}

	@Override
	protected ClientContact instantiateNewEntity() {
		return formClientContactDto.instantiateEntity();
	}
}
