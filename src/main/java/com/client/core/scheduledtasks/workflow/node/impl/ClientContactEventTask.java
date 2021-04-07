package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.relatedentity.ClientContactRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.ClientContactScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientContactEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientContactEventTask extends AbstractEventTask<ClientContact, ClientContactScheduledTaskHelper, ClientContactEventTraverser> {

    public ClientContactEventTask(Integer order, Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientContactEventTask(Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
