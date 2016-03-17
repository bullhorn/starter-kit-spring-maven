package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
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
			boolean edit, BullhornData bullhornData) {
		super(new ClientCorporationFormTriggerHelper(formClientCorporationDto, updatingUserID, bullhornData), edit);

	}

    public ClientCorporationValidationTraverser(ClientCorporation clientCorporation, Integer updatingUserID,
                                                boolean edit, boolean restTrigger, BullhornData bullhornData) {
        super(new ClientCorporationFormTriggerHelper(clientCorporation, updatingUserID, bullhornData), edit, restTrigger);

    }
}
