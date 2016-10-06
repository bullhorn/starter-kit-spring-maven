package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.StandardEvent;
import com.client.core.scheduledtasks.model.helper.impl.SendoutScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author johnsully
 * 
 */

public class SendoutEventTraverser extends AbstractScheduledTasksTraverser<SendoutScheduledTaskHelper> {

	public SendoutEventTraverser(StandardEvent event) {
		super(new SendoutScheduledTaskHelper(event), EventType.getType(event.getEventType()));
	}

	public SendoutEventTraverser(StandardEvent event, BullhornData bullhornData) {
		super(new SendoutScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEventType()));
	}
	
}
