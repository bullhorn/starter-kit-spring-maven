package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.resttrigger.model.helper.impl.JobOrderRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.JobOrderRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class JobOrderRestTriggerValidator extends AbstractRestTriggerValidator<JobOrder, JobOrderRestTriggerHelper, JobOrderRestTriggerTraverser> {

    public JobOrderRestTriggerValidator(Integer order) {
        super(order);
    }

    public JobOrderRestTriggerValidator() {
    }

}