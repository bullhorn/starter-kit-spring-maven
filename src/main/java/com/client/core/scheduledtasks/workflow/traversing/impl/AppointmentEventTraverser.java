package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.model.helper.impl.AppointmentScheduledTaskHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class AppointmentEventTraverser extends AbstractScheduledTasksTraverser<AppointmentScheduledTaskHelper> {

	public AppointmentEventTraverser(CustomSubscriptionEvent event) {
		super(new AppointmentScheduledTaskHelper(event),EventType.getType(event.getEventType()));
	}

}
