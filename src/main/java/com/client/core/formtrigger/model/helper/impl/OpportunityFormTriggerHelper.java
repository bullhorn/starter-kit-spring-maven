package com.client.core.formtrigger.model.helper.impl;


import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.helper.impl.OpportunityTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class OpportunityFormTriggerHelper extends OpportunityTriggerHelper implements FormTriggerHelper<FormOpportunityDto, Opportunity> {

	private final FormOpportunityDto formOpportunityDto;

	public OpportunityFormTriggerHelper(FormOpportunityDto formOpportunityDto, Integer updatingUserID,
										Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, relatedEntityFields);
		this.formOpportunityDto = formOpportunityDto;
	}

	@Override
	public FormOpportunityDto getFormValues() {
		return formOpportunityDto;
	}

	@Override
	protected Opportunity instantiateNewEntity() {
		return formOpportunityDto.instantiateEntity();
	}
}
