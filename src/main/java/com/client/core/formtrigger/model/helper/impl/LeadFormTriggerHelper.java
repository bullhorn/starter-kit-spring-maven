package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.helper.impl.LeadTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class LeadFormTriggerHelper extends LeadTriggerHelper implements FormTriggerHelper<FormLeadDto, Lead> {

    private FormLeadDto formLeadDto;

    public LeadFormTriggerHelper(FormLeadDto formLeadDto, Integer updatingUserID,
                                 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(updatingUserID, relatedEntityFields);
        this.formLeadDto = formLeadDto;
    }

    @Override
    public FormLeadDto getFormValues() {
        return formLeadDto;
    }

    @Override
    protected Lead instantiateNewEntity() {
        return formLeadDto.instantiateEntity();
    }
}
