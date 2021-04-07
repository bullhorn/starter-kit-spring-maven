package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.JobOrderScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobOrderEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobOrderEventTask extends AbstractEventTask<JobOrder, JobOrderScheduledTaskHelper, JobOrderEventTraverser> {

    public JobOrderEventTask(Integer order, Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobOrderEventTask(Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
