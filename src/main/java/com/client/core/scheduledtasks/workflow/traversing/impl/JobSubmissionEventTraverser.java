package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.JobSubmissionScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class JobSubmissionEventTraverser extends AbstractScheduledTasksTraverser<JobSubmissionScheduledTaskHelper> {

	public JobSubmissionEventTraverser(CustomSubscriptionEvent event) {
		super(new JobSubmissionScheduledTaskHelper(event), EventType.getType(event.getEventType()));
		
	}

	public JobSubmissionEventTraverser(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(new JobSubmissionScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEventType()));
	}

}
