package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.workflow.node.AbstractWorkflowAction;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;
import com.client.core.formtrigger.workflow.node.FormTriggerValidator;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class AbstractFormTriggerValidator<E extends BullhornEntity, D extends AbstractFormDto<E>, H extends FormTriggerHelper<D, E>, T extends TriggerTraverser<E, H>>
        extends AbstractWorkflowAction<E, T> implements FormTriggerValidator<E, D, H, T> {

    private final Integer order;

    protected AbstractFormTriggerValidator(Integer order) {
        this.order = order;
    }

    protected AbstractFormTriggerValidator() {
        this.order = -1;
    }

    @Override
    public Integer order() {
        return order;
    }

}
