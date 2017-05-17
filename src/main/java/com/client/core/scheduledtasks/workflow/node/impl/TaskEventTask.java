package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.client.core.scheduledtasks.model.helper.impl.TaskScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.TaskEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class TaskEventTask extends AbstractEventTask<Task, TaskScheduledTaskHelper, TaskEventTraverser> {

    public TaskEventTask(Integer order) {
        super(order);
    }

    public TaskEventTask() {
    }

}