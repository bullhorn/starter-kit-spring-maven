package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.resttrigger.model.helper.impl.CandidateRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.CandidateRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CandidateRestTriggerValidator extends AbstractRestTriggerValidator<Candidate, CandidateRestTriggerHelper, CandidateRestTriggerTraverser> {

    public CandidateRestTriggerValidator(Integer order) {
        super(order);
    }

    public CandidateRestTriggerValidator() {
    }

}