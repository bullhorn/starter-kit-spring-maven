package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.PlacementChangeRequestScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class PlacementChangeRequestEventTraverser extends AbstractScheduledTasksTraverser<PlacementChangeRequestScheduledTaskHelper> {

	public PlacementChangeRequestEventTraverser(CustomSubscriptionEvent event) {
		super(new PlacementChangeRequestScheduledTaskHelper(event),EventType.getType(event.getEntityEventType()));
		
	}

	public PlacementChangeRequestEventTraverser(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(new PlacementChangeRequestScheduledTaskHelper(event,bullhornData),EventType.getType(event.getEntityEventType()));
	}

}
