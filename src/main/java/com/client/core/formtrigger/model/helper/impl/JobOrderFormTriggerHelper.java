package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.helper.impl.JobOrderTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class JobOrderFormTriggerHelper extends JobOrderTriggerHelper implements FormTriggerHelper<FormJobOrderDto, JobOrder> {

	private final FormJobOrderDto formJobOrderDto;

	public JobOrderFormTriggerHelper(FormJobOrderDto formJobOrderDto, Integer updatingUserID,
									 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formJobOrderDto = formJobOrderDto;
	}

	@Override
	public FormJobOrderDto getFormValues() {
		return formJobOrderDto;
	}

	@Override
	protected JobOrder instantiateNewEntity() {
		return formJobOrderDto.instantiateEntity();
	}

}
