package com.client.core.formtrigger.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
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

	public CandidateValidationTraverser(FormCandidateDto formCandidateDto, Integer updatingUserID, Integer corporationID, boolean edit,
			BullhornData bullhornData) {
		super(new CandidateFormTriggerHelper(formCandidateDto, updatingUserID, bullhornData), corporationID, edit);
	}

}
