package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.StandardEvent;
import com.client.core.scheduledtasks.model.helper.impl.OpportunityScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class OpportunityEventTraverser extends AbstractScheduledTasksTraverser<OpportunityScheduledTaskHelper> {

	public OpportunityEventTraverser(StandardEvent event) {
		super(new OpportunityScheduledTaskHelper(event), EventType.getType(event.getEventType()));

	}

	public OpportunityEventTraverser(StandardEvent event, BullhornData bullhornData) {
		super(new OpportunityScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEventType()));
	}

}
