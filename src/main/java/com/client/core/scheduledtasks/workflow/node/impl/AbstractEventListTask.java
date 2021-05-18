package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.node.AbstractWorkflowAction;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.EventListTask;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTaskListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class AbstractEventListTask<E extends BullhornEntity, H extends AbstractScheduledTaskHelper<E>, T extends AbstractScheduledTaskListTraverser<H>>
        extends AbstractWorkflowAction<E, T> implements EventListTask<E, H, T> {

    private final Integer order;

    protected AbstractEventListTask(Integer order, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
        this.order = order;
    }

    protected AbstractEventListTask(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
        this.order = -1;
    }

    @Override
    public Integer order() {
        return order;
    }

}
