package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.OpportunityRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormOpportunityDto;
import com.client.core.formtrigger.model.helper.impl.OpportunityFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.OpportunityFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class OpportunityFormTriggerValidator
        extends AbstractFormTriggerValidator<Opportunity, FormOpportunityDto, OpportunityFormTriggerHelper, OpportunityFormTriggerTraverser> {

    public OpportunityFormTriggerValidator(Integer order, Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public OpportunityFormTriggerValidator(Map<OpportunityRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
