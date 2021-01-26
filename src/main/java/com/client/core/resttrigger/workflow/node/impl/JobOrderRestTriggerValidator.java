package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.JobOrderRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.JobOrderRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobOrderRestTriggerValidator extends AbstractRestTriggerValidator<JobOrder, JobOrderRestTriggerHelper, JobOrderRestTriggerTraverser> {

    public JobOrderRestTriggerValidator(Integer order, Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobOrderRestTriggerValidator(Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
