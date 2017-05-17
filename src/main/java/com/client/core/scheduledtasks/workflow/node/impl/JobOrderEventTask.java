package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.scheduledtasks.model.helper.impl.JobOrderScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.JobOrderEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class JobOrderEventTask extends AbstractEventTask<JobOrder, JobOrderScheduledTaskHelper, JobOrderEventTraverser> {

    public JobOrderEventTask(Integer order) {
        super(order);
    }

    public JobOrderEventTask() {
    }

}