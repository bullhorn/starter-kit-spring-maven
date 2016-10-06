package com.client.core.formtrigger.model.helper.impl;


import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.helper.impl.OpportunityTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobOrderDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class OpportunityFormTriggerHelper extends OpportunityTriggerHelper implements FormTriggerHelper<FormOpportunityDto, Opportunity> {

	private final FormOpportunityDto formOpportunityDto;

	public OpportunityFormTriggerHelper(FormOpportunityDto formOpportunityDto, Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
		this.formOpportunityDto = formOpportunityDto;
	}

	@Override
	public Opportunity getNewEntity() {
		if (newEntity == null) {
			setNewEntity(formOpportunityDto.instantiateEntity());
		}
		return newEntity;
	}

	@Override
	public FormOpportunityDto getFormValues() {
		return formOpportunityDto;
	}

}
