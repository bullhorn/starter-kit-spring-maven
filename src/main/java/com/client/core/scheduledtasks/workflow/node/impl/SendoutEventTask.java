package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.SendoutScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.SendoutEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class SendoutEventTask extends AbstractEventTask<Sendout, SendoutScheduledTaskHelper, SendoutEventTraverser> {

    public SendoutEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public SendoutEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
