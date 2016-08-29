package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.helper.impl.LeadTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

/**
 * Created by hiqbal on 12/23/2015.
 */
public class LeadFormTriggerHelper extends LeadTriggerHelper implements FormTriggerHelper<FormLeadDto, Lead> {

    private FormLeadDto formLeadDto;

    public LeadFormTriggerHelper(FormLeadDto formLeadDto, Integer updatingUserID, BullhornData bullhornData) {
        super(updatingUserID, bullhornData);
        this.formLeadDto = formLeadDto;
    }

    @Override
    public Lead getNewEntity() {
        if (newEntity == null) {
            setNewEntity(formLeadDto.instantiateEntity());
        }
        return newEntity;
    }

    @Override
    public FormLeadDto getFormValues() {
        return formLeadDto;
    }

}
