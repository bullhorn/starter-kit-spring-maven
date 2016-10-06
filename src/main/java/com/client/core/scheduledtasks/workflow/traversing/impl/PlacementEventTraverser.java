package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.PlacementScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class PlacementEventTraverser extends AbstractScheduledTasksTraverser<PlacementScheduledTaskHelper> {

	public PlacementEventTraverser(CustomSubscriptionEvent event) {
		super(new PlacementScheduledTaskHelper(event), EventType.getType(event.getEventType()));

	}

	public PlacementEventTraverser(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(new PlacementScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEventType()));
	}
}
