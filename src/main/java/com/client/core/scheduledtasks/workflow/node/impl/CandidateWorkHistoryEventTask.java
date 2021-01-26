package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CandidateWorkHistoryScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateWorkHistoryEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateWorkHistoryEventTask extends AbstractEventTask<CandidateWorkHistory, CandidateWorkHistoryScheduledTaskHelper, CandidateWorkHistoryEventTraverser> {

    public CandidateWorkHistoryEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateWorkHistoryEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
