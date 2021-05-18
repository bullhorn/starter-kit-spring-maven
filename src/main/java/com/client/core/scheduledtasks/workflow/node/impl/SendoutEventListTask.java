package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.client.core.base.model.relatedentity.SendoutRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.SendoutScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.SendoutEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class SendoutEventListTask extends AbstractEventListTask<Sendout, SendoutScheduledTaskHelper, SendoutEventListTraverser> {

    public SendoutEventListTask(Integer order, Map<SendoutRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public SendoutEventListTask(Map<SendoutRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
