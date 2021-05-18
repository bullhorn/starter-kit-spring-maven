package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.base.model.relatedentity.CandidateWorkHistoryRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CandidateWorkHistoryScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateWorkHistoryEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateWorkHistoryEventListTask extends AbstractEventListTask<CandidateWorkHistory, CandidateWorkHistoryScheduledTaskHelper, CandidateWorkHistoryEventListTraverser> {

    public CandidateWorkHistoryEventListTask(Integer order, Map<CandidateWorkHistoryRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateWorkHistoryEventListTask(Map<CandidateWorkHistoryRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
