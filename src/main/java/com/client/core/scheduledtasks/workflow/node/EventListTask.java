package com.client.core.scheduledtasks.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.workflow.node.WorkflowAction;
import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.ScheduledTaskListTraverser;

public interface EventListTask<E extends BullhornEntity, H extends ScheduledTaskHelper<E>, T extends ScheduledTaskListTraverser<H>> extends WorkflowAction<E, T> {

    void handle(T traverser);

}
