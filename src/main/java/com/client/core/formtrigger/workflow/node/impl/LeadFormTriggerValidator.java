package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.LeadRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormLeadDto;
import com.client.core.formtrigger.model.helper.impl.LeadFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.LeadFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class LeadFormTriggerValidator
        extends AbstractFormTriggerValidator<Lead, FormLeadDto, LeadFormTriggerHelper, LeadFormTriggerTraverser> {

    public LeadFormTriggerValidator(Integer order, Map<LeadRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public LeadFormTriggerValidator(Map<LeadRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
