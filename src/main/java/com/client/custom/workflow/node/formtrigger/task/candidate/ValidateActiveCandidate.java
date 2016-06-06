package com.client.custom.workflow.node.formtrigger.task.candidate;

import org.springframework.beans.factory.annotation.Autowired;

import com.client.core.base.workflow.node.task.Task;
import com.client.core.formtrigger.workflow.traversing.impl.CandidateValidationTraverser;
import com.client.custom.service.formtrigger.CandidateFormTriggerService;

/**
 * Created by john.sullivan on 6/6/2016.
 */
public class ValidateActiveCandidate extends Task<CandidateValidationTraverser> {

    @Autowired
    private CandidateFormTriggerService candidateFormTriggerService;

    @Override
    protected void handle(CandidateValidationTraverser tasks) {
        candidateFormTriggerService.validateActiveCandidate(tasks);
    }
}
