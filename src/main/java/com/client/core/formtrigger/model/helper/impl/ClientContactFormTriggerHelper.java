package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, FormClientContactDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class ClientContactFormTriggerHelper extends AbstractFormTriggerHelper<FormClientContactDto, ClientContact> {

	private ClientCorporation clientCorporation;

	public ClientContactFormTriggerHelper(FormClientContactDto formClientContactDto, Integer updatingUserID, BullhornData bullhornData) {
		super(formClientContactDto, updatingUserID, bullhornData);
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			setClientCorporation(findClientCorporation(getFormValues().getClient_clientCorporationID()));
		}
		return clientCorporation;
	}

	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

}
