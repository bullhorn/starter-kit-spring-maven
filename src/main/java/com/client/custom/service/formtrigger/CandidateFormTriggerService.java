package com.client.custom.service.formtrigger;

import com.client.core.formtrigger.workflow.traversing.impl.CandidateValidationTraverser;

/**
 * Created by john.sullivan on 6/6/2016.
 */
public interface CandidateFormTriggerService {

    boolean isCandidateActive(CandidateValidationTraverser tasks);

    void validateActiveCandidate(CandidateValidationTraverser tasks);

}
