package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.client.core.base.model.relatedentity.TaskRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.TaskScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.TaskEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class TaskEventTask extends AbstractEventTask<Task, TaskScheduledTaskHelper, TaskEventTraverser> {

    public TaskEventTask(Integer order, Map<TaskRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public TaskEventTask(Map<TaskRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
