package com.client.custom.workflow.node.formtrigger.conditional.candidate;

import org.springframework.beans.factory.annotation.Autowired;

import com.client.core.base.workflow.node.conditional.Conditional;
import com.client.core.formtrigger.workflow.traversing.impl.CandidateValidationTraverser;
import com.client.custom.service.formtrigger.CandidateFormTriggerService;

/**
 * Created by john.sullivan on 6/6/2016.
 */
public class IsCandidateActive extends Conditional<CandidateValidationTraverser> {

    @Autowired
    private CandidateFormTriggerService candidateFormTriggerService;

    @Override
    protected void evaluate(CandidateValidationTraverser tasks) {
        if(candidateFormTriggerService.isCandidateActive(tasks)) {
            yes(tasks);
        } else {
            no(tasks);
        }
    }

}
