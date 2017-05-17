package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.scheduledtasks.model.helper.impl.ClientContactScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientContactEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class ClientContactEventTask extends AbstractEventTask<ClientContact, ClientContactScheduledTaskHelper, ClientContactEventTraverser> {

    public ClientContactEventTask(Integer order) {
        super(order);
    }

    public ClientContactEventTask() {
    }

}