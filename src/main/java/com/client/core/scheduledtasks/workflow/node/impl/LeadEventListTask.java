package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.LeadRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.LeadScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.LeadEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class LeadEventListTask extends AbstractEventListTask<Lead, LeadScheduledTaskHelper, LeadEventListTraverser> {

    public LeadEventListTask(Integer order, Map<LeadRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public LeadEventListTask(Map<LeadRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
