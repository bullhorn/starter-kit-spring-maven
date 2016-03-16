package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formClientCorporationDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class ClientCorporationFormTriggerHelper extends AbstractFormTriggerHelper<FormClientCorporationDto, ClientCorporation> {

	public ClientCorporationFormTriggerHelper(FormClientCorporationDto formClientCorporationDto, Integer updatingUserID,
			BullhornData bullhornData) {
		super(formClientCorporationDto, updatingUserID, bullhornData);
	}

}
