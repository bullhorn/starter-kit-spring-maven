package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.client.core.base.model.relatedentity.CandidateReferenceRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CandidateReferenceScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateReferenceEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateReferenceEventListTask extends AbstractEventListTask<CandidateReference, CandidateReferenceScheduledTaskHelper, CandidateReferenceEventListTraverser> {

    public CandidateReferenceEventListTask(Integer order, Map<CandidateReferenceRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateReferenceEventListTask(Map<CandidateReferenceRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
