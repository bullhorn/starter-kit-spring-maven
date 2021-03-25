package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.client.core.base.model.relatedentity.CandidateReferenceRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.CandidateReferenceRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.CandidateReferenceRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateReferenceRestTriggerValidator extends AbstractRestTriggerValidator<CandidateReference, CandidateReferenceRestTriggerHelper, CandidateReferenceRestTriggerTraverser> {

    public CandidateReferenceRestTriggerValidator(Integer order, Map<CandidateReferenceRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateReferenceRestTriggerValidator(Map<CandidateReferenceRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
