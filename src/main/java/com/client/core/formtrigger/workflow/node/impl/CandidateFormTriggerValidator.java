package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.helper.impl.CandidateFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.CandidateFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateFormTriggerValidator
        extends AbstractFormTriggerValidator<Candidate, FormCandidateDto, CandidateFormTriggerHelper, CandidateFormTriggerTraverser> {

    public CandidateFormTriggerValidator(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateFormTriggerValidator(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
