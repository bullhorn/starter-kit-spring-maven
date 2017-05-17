package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.helper.impl.CandidateFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.CandidateFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CandidateFormTriggerValidator
        extends AbstractFormTriggerValidator<Candidate, FormCandidateDto, CandidateFormTriggerHelper, CandidateFormTriggerTraverser> {

    public CandidateFormTriggerValidator(Integer order) {
        super(order);
    }

    public CandidateFormTriggerValidator() {
    }

}