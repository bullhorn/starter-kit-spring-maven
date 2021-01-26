package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.helper.impl.CandidateTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class CandidateFormTriggerHelper extends CandidateTriggerHelper implements FormTriggerHelper<FormCandidateDto, Candidate> {

	private final FormCandidateDto formCandidateDto;

	public CandidateFormTriggerHelper(FormCandidateDto formCandidateDto, Integer updatingUserID,
									  Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formCandidateDto = formCandidateDto;
	}

	@Override
	public FormCandidateDto getFormValues() {
		return formCandidateDto;
	}

	@Override
	protected Candidate instantiateNewEntity() {
		return formCandidateDto.instantiateEntity();
	}
}
