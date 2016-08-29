package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.model.helper.impl.ClientContactFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class ClientContactFormTriggerTraverser extends AbstractTriggerTraverser<ClientContact, ClientContactFormTriggerHelper> {

	public ClientContactFormTriggerTraverser(FormClientContactDto formClientContactDto, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
		super(new ClientContactFormTriggerHelper(formClientContactDto, updatingUserID, bullhornData), edit);
	}

}
