package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.LeadScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class LeadEventTraverser extends AbstractScheduledTasksTraverser<LeadScheduledTaskHelper> {

	public LeadEventTraverser(CustomSubscriptionEvent event) {
		super(new LeadScheduledTaskHelper(event),EventType.getType(event.getEventType()));
	}

	public LeadEventTraverser(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(new LeadScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEventType()));
	}

}