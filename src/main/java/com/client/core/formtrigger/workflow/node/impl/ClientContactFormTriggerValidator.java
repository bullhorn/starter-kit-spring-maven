package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.model.helper.impl.ClientContactFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.ClientContactFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class ClientContactFormTriggerValidator
        extends AbstractFormTriggerValidator<ClientContact, FormClientContactDto, ClientContactFormTriggerHelper, ClientContactFormTriggerTraverser> {

    public ClientContactFormTriggerValidator(Integer order) {
        super(order);
    }

    public ClientContactFormTriggerValidator() {
    }

}