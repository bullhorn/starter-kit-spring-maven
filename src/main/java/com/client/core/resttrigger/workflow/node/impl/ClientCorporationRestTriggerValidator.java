package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.relatedentity.ClientCorporationRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.ClientCorporationRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.ClientCorporationRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientCorporationRestTriggerValidator extends AbstractRestTriggerValidator<ClientCorporation, ClientCorporationRestTriggerHelper, ClientCorporationRestTriggerTraverser> {

    public ClientCorporationRestTriggerValidator(Integer order, Map<ClientCorporationRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientCorporationRestTriggerValidator(Map<ClientCorporationRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
