package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.ClientCorporationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientCorporationEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientCorporationEventTask extends AbstractEventTask<ClientCorporation, ClientCorporationScheduledTaskHelper, ClientCorporationEventTraverser> {

    public ClientCorporationEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientCorporationEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
