package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.formtrigger.model.helper.impl.ClientContactFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 */
public class ClientContactValidationTraverser extends AbstractValidationTraverser<ClientContactFormTriggerHelper> {

	public ClientContactValidationTraverser(FormClientContactDto formClientContactDto, Integer updatingUserID,
			boolean edit, BullhornData bullhornData) {
		super(new ClientContactFormTriggerHelper(formClientContactDto, updatingUserID, bullhornData), edit);
	}

    public ClientContactValidationTraverser(ClientContact clientContact, Integer updatingUserID,
                                            boolean edit, boolean restTrigger, BullhornData bullhornData) {
        super(new ClientContactFormTriggerHelper(clientContact, updatingUserID, bullhornData), edit, restTrigger);

    }

}
