package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.CandidateRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.CandidateRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateRestTriggerValidator extends AbstractRestTriggerValidator<Candidate, CandidateRestTriggerHelper, CandidateRestTriggerTraverser> {

    public CandidateRestTriggerValidator(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateRestTriggerValidator(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
