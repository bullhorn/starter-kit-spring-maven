package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CandidateReferenceScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateReferenceEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateReferenceEventTask extends AbstractEventTask<CandidateReference, CandidateReferenceScheduledTaskHelper, CandidateReferenceEventTraverser> {

    public CandidateReferenceEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateReferenceEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
