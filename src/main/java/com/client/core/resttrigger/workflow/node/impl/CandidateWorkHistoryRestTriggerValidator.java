package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.base.model.relatedentity.CandidateWorkHistoryRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.CandidateWorkHistoryRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.CandidateWorkHistoryRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateWorkHistoryRestTriggerValidator extends AbstractRestTriggerValidator<CandidateWorkHistory, CandidateWorkHistoryRestTriggerHelper, CandidateWorkHistoryRestTriggerTraverser> {

    public CandidateWorkHistoryRestTriggerValidator(Integer order, Map<CandidateWorkHistoryRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateWorkHistoryRestTriggerValidator(Map<CandidateWorkHistoryRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
