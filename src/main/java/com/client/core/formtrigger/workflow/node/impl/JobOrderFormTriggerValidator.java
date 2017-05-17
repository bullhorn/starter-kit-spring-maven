package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;
import com.client.core.formtrigger.model.helper.impl.JobOrderFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.JobOrderFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class JobOrderFormTriggerValidator
        extends AbstractFormTriggerValidator<JobOrder, FormJobOrderDto, JobOrderFormTriggerHelper, JobOrderFormTriggerTraverser> {

    public JobOrderFormTriggerValidator(Integer order) {
        super(order);
    }

    public JobOrderFormTriggerValidator() {
    }

}