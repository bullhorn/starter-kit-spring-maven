package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.base.model.relatedentity.JobOrderRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.helper.impl.JobOrderFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.JobOrderFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class JobOrderFormTriggerValidator
        extends AbstractFormTriggerValidator<JobOrder, FormJobOrderDto, JobOrderFormTriggerHelper, JobOrderFormTriggerTraverser> {

    public JobOrderFormTriggerValidator(Integer order, Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public JobOrderFormTriggerValidator(Map<JobOrderRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
