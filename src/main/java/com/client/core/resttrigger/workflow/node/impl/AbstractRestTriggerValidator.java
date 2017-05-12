package com.client.core.resttrigger.workflow.node.impl;

import java.util.stream.Stream;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.workflow.node.AbstractWorkflowAction;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;
import com.client.core.resttrigger.workflow.node.RestTriggerValidator;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class AbstractRestTriggerValidator<E extends BullhornEntity, H extends RestTriggerHelper<E>, T extends TriggerTraverser<E, H>>
        extends AbstractWorkflowAction<E, T> implements RestTriggerValidator<E, H, T> {

    private final Integer order;

    protected AbstractRestTriggerValidator(Integer order) {
        this.order = order;
    }

    protected AbstractRestTriggerValidator() {
        this.order = -1;
    }

    @Override
    public Integer order() {
        return order;
    }

    protected <E extends BullhornEntity, H extends RestTriggerHelper<E>> Boolean fieldWasUpdated(H helper, String... fields) {
        return Stream.of(fields).anyMatch(field -> {
            return helper.getPopulatedFields().contains(field);
        });
    }

}
