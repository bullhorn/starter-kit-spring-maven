package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.relatedentity.ClientContactRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.ClientContactScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientContactEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientContactEventListTask extends AbstractEventListTask<ClientContact, ClientContactScheduledTaskHelper, ClientContactEventListTraverser> {

    public ClientContactEventListTask(Integer order, Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientContactEventListTask(Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
