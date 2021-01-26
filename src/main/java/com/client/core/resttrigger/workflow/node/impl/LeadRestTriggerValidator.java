package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.LeadRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.LeadRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.LeadRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class LeadRestTriggerValidator extends AbstractRestTriggerValidator<Lead, LeadRestTriggerHelper, LeadRestTriggerTraverser> {

    public LeadRestTriggerValidator(Integer order, Map<LeadRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public LeadRestTriggerValidator(Map<LeadRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
