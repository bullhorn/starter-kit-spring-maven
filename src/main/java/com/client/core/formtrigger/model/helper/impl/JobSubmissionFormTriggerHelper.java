package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.helper.impl.JobSubmissionTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class JobSubmissionFormTriggerHelper extends JobSubmissionTriggerHelper implements FormTriggerHelper<FormJobSubmissionDto, JobSubmission> {

	private final FormJobSubmissionDto formJobSubmissionDto;

	public JobSubmissionFormTriggerHelper(FormJobSubmissionDto formJobSubmissionDto, Integer updatingUserID,
										  Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formJobSubmissionDto = formJobSubmissionDto;
	}

	@Override
	public FormJobSubmissionDto getFormValues() {
		return formJobSubmissionDto;
	}

	@Override
	protected JobSubmission instantiateNewEntity() {
		return formJobSubmissionDto.instantiateEntity();
	}
}
