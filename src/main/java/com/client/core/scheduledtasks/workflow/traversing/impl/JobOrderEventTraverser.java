package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.JobOrderScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class JobOrderEventTraverser extends AbstractScheduledTasksTraverser<JobOrderScheduledTaskHelper> {

	public JobOrderEventTraverser(CustomSubscriptionEvent event) {
		super(new JobOrderScheduledTaskHelper(event), EventType.getType(event.getEntityEventType()));

	}

	public JobOrderEventTraverser(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(new JobOrderScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEntityEventType()));
	}

}
