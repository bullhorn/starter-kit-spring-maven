package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.node.AbstractWorkflowAction;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;
import com.client.core.formtrigger.workflow.node.FormTriggerValidator;

import java.util.Map;
import java.util.Set;

public abstract class AbstractFormTriggerValidator<E extends BullhornEntity, D extends AbstractFormDto<E>, H extends FormTriggerHelper<D, E>, T extends TriggerTraverser<E, H>>
        extends AbstractWorkflowAction<E, T> implements FormTriggerValidator<E, D, H, T> {

    private final Integer order;

    protected AbstractFormTriggerValidator(Integer order, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
        this.order = order;
    }

    protected AbstractFormTriggerValidator(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
        this.order = -1;
    }

    @Override
    public Integer order() {
        return order;
    }

}
