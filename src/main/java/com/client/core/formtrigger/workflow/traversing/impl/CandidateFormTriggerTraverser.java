package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.helper.impl.CandidateFormTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class CandidateFormTriggerTraverser extends AbstractTriggerTraverser<Candidate, CandidateFormTriggerHelper> {

	public CandidateFormTriggerTraverser(FormCandidateDto formCandidateDto, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
		super(new CandidateFormTriggerHelper(formCandidateDto, updatingUserID, bullhornData), edit);
	}

}
