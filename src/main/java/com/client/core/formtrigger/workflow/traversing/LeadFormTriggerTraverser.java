package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.impl.LeadFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class LeadFormTriggerTraverser extends AbstractTriggerTraverser<Lead, LeadFormTriggerHelper> {

    public LeadFormTriggerTraverser(FormLeadDto formLeadDto, Integer updatingUserID, boolean edit,
                                    Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(new LeadFormTriggerHelper(formLeadDto, updatingUserID, relatedEntityFields), edit);
    }
}
