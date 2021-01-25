package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.helper.impl.CandidateFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class CandidateFormTriggerTraverser extends AbstractTriggerTraverser<Candidate, CandidateFormTriggerHelper> {

	public CandidateFormTriggerTraverser(FormCandidateDto formCandidateDto, Integer updatingUserID, boolean edit,
										 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new CandidateFormTriggerHelper(formCandidateDto, updatingUserID, relatedEntityFields), edit);
	}

}
