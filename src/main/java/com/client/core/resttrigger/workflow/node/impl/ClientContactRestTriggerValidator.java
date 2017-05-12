package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.resttrigger.model.helper.impl.ClientContactRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.ClientContactRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class ClientContactRestTriggerValidator extends AbstractRestTriggerValidator<ClientContact, ClientContactRestTriggerHelper, ClientContactRestTriggerTraverser> {

    public ClientContactRestTriggerValidator(Integer order) {
        super(order);
    }

    public ClientContactRestTriggerValidator() {
    }

}