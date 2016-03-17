package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.formtrigger.model.helper.impl.CandidateFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */
public class CandidateValidationTraverser extends AbstractValidationTraverser<CandidateFormTriggerHelper> {

	public CandidateValidationTraverser(FormCandidateDto formCandidateDto, Integer updatingUserID, boolean edit,
			BullhornData bullhornData) {
		super(new CandidateFormTriggerHelper(formCandidateDto, updatingUserID, bullhornData), edit);
	}

    public CandidateValidationTraverser(Candidate candidate, Integer updatingUserID, boolean edit,
                                        Boolean restTrigger, BullhornData bullhornData) {
        super(new CandidateFormTriggerHelper(candidate, updatingUserID, bullhornData), edit, restTrigger);

    }

}
