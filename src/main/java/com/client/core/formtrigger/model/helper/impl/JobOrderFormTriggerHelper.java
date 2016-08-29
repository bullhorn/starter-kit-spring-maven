package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.helper.impl.JobOrderTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class JobOrderFormTriggerHelper extends JobOrderTriggerHelper implements FormTriggerHelper<FormJobOrderDto, JobOrder> {

	private final FormJobOrderDto formJobOrderDto;

	public JobOrderFormTriggerHelper(FormJobOrderDto formJobOrderDto, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formJobOrderDto = formJobOrderDto;
	}

	@Override
	public JobOrder getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formJobOrderDto.instantiateEntity());
		}

		return newEntity;
	}

	@Override
	public FormJobOrderDto getFormValues() {
		return formJobOrderDto;
	}

}
