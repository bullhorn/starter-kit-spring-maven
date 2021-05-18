package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.relatedentity.ClientCorporationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.ClientCorporationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientCorporationEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientCorporationEventListTask extends AbstractEventListTask<ClientCorporation, ClientCorporationScheduledTaskHelper, ClientCorporationEventListTraverser> {

    public ClientCorporationEventListTask(Integer order, Map<ClientCorporationRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientCorporationEventListTask(Map<ClientCorporationRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
