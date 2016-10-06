package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.helper.impl.ClientContactTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, FormClientContactDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class ClientContactFormTriggerHelper extends ClientContactTriggerHelper implements FormTriggerHelper<FormClientContactDto, ClientContact> {

	private final FormClientContactDto formClientContactDto;

	public ClientContactFormTriggerHelper(FormClientContactDto formClientContactDto, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formClientContactDto = formClientContactDto;
	}

	@Override
	public ClientContact getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formClientContactDto.instantiateEntity());
		}

		return newEntity;
	}

	@Override
	public FormClientContactDto getFormValues() {
		return formClientContactDto;
	}

}
