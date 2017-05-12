package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.resttrigger.model.helper.impl.ClientCorporationRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.ClientCorporationRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class ClientCorporationRestTriggerValidator extends AbstractRestTriggerValidator<ClientCorporation, ClientCorporationRestTriggerHelper, ClientCorporationRestTriggerTraverser> {

    public ClientCorporationRestTriggerValidator(Integer order) {
        super(order);
    }

    public ClientCorporationRestTriggerValidator() {
    }

}