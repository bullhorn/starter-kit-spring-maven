package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.model.helper.impl.CandidateTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formCandidateDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class CandidateFormTriggerHelper extends CandidateTriggerHelper implements FormTriggerHelper<FormCandidateDto, Candidate> {

	private final FormCandidateDto formCandidateDto;

	public CandidateFormTriggerHelper(FormCandidateDto formCandidateDto, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formCandidateDto = formCandidateDto;
	}

	@Override
	public Candidate getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formCandidateDto.instantiateEntity());
		}

		return newEntity;
	}

	@Override
	public FormCandidateDto getFormValues() {
		return formCandidateDto;
	}

}
