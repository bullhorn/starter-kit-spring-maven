package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.model.helper.impl.JobScheduledTaskHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class JobEventTraverser extends AbstractScheduledTasksTraverser<JobScheduledTaskHelper> {

	public JobEventTraverser(SubscriptionEvent event) {
		super(new JobScheduledTaskHelper(event), EventType.getType(event.getEventType()));

	}

	public JobEventTraverser(SubscriptionEvent event, BullhornData bullhornData) {
		super(new JobScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEventType()));
	}

}
