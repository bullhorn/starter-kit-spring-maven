package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CandidateScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateEventListTask extends AbstractEventListTask<Candidate, CandidateScheduledTaskHelper, CandidateEventListTraverser> {

    public CandidateEventListTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateEventListTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
