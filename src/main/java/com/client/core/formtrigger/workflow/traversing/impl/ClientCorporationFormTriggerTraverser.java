package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.model.helper.impl.ClientCorporationFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class ClientCorporationFormTriggerTraverser extends AbstractTriggerTraverser<ClientCorporation, ClientCorporationFormTriggerHelper> {

	public ClientCorporationFormTriggerTraverser(FormClientCorporationDto formClientCorporationDto, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
		super(new ClientCorporationFormTriggerHelper(formClientCorporationDto, updatingUserID, bullhornData), edit);
	}
}
