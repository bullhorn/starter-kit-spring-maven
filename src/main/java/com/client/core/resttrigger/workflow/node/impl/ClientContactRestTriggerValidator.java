package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.relatedentity.ClientContactRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.ClientContactRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.ClientContactRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientContactRestTriggerValidator extends AbstractRestTriggerValidator<ClientContact, ClientContactRestTriggerHelper, ClientContactRestTriggerTraverser> {

    public ClientContactRestTriggerValidator(Integer order, Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientContactRestTriggerValidator(Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
