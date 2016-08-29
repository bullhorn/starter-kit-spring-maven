package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.helper.impl.JobSubmissionTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobSubmissionDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class JobSubmissionFormTriggerHelper extends JobSubmissionTriggerHelper implements FormTriggerHelper<FormJobSubmissionDto, JobSubmission> {

	private final FormJobSubmissionDto formJobSubmissionDto;

	public JobSubmissionFormTriggerHelper(FormJobSubmissionDto formJobSubmissionDto, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formJobSubmissionDto = formJobSubmissionDto;
	}

	@Override
	public JobSubmission getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formJobSubmissionDto.instantiateEntity());
		}
		return newEntity;
	}

	@Override
	public FormJobSubmissionDto getFormValues() {
		return formJobSubmissionDto;
	}

}