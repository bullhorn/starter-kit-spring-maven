package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.formtrigger.model.helper.impl.ClientCorporationFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class ClientCorporationValidationTraverser extends AbstractValidationTraverser<ClientCorporationFormTriggerHelper> {

	public ClientCorporationValidationTraverser(FormClientCorporationDto formClientCorporationDto, Integer updatingUserID,
			Integer corporationID, boolean edit, BullhornData bullhornData) {
		super(new ClientCorporationFormTriggerHelper(formClientCorporationDto, updatingUserID, bullhornData), corporationID, edit);

	}
}
