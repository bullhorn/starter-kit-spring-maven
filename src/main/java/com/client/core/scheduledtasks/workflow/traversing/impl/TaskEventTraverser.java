package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.scheduledtasks.model.helper.StandardEvent;
import com.client.core.scheduledtasks.model.helper.impl.TaskScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class TaskEventTraverser extends AbstractScheduledTasksTraverser<TaskScheduledTaskHelper> {

	public TaskEventTraverser(StandardEvent event) {
		super(new TaskScheduledTaskHelper(event), EventType.getType(event.getEventType()));
	}

}
