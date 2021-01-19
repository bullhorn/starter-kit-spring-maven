package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.fields.CandidateTriggerEntity;
import com.client.core.base.model.fields.RelatedTriggerEntity;
import com.client.core.resttrigger.model.helper.impl.CandidateRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.CandidateRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CandidateRestTriggerValidator extends AbstractRestTriggerValidator<Candidate, CandidateRestTriggerHelper, CandidateRestTriggerTraverser> {

    public CandidateRestTriggerValidator(Integer order, Map<CandidateTriggerEntity, Set<String>> triggerEntityFields) {
        super(order, triggerEntityFields);
    }

    public CandidateRestTriggerValidator(Map<CandidateTriggerEntity, Set<String>> triggerEntityFields) {
        super(triggerEntityFields);
    }

}
