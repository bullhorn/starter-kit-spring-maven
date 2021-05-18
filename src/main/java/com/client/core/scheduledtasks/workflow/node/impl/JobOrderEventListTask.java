package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.JobOrderScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobOrderEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobOrderEventListTask extends AbstractEventListTask<JobOrder, JobOrderScheduledTaskHelper, JobOrderEventListTraverser> {

    public JobOrderEventListTask(Integer order, Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobOrderEventListTask(Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
