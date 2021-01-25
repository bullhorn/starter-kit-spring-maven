package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.LeadScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.LeadEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class LeadEventTask extends AbstractEventTask<Lead, LeadScheduledTaskHelper, LeadEventTraverser> {

    public LeadEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public LeadEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
