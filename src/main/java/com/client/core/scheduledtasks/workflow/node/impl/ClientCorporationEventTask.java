package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.scheduledtasks.model.helper.impl.ClientCorporationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.ClientCorporationEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class ClientCorporationEventTask extends AbstractEventTask<ClientCorporation, ClientCorporationScheduledTaskHelper, ClientCorporationEventTraverser> {

    public ClientCorporationEventTask(Integer order) {
        super(order);
    }

    public ClientCorporationEventTask() {
    }

}