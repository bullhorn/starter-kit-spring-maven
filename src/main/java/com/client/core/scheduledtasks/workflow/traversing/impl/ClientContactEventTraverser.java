package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.ClientContactScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class ClientContactEventTraverser extends AbstractScheduledTasksTraverser<ClientContactScheduledTaskHelper> {

	public ClientContactEventTraverser(CustomSubscriptionEvent event) {
		super(new ClientContactScheduledTaskHelper(event),EventType.getType(event.getEventType()));
		
	}
	
	public ClientContactEventTraverser(CustomSubscriptionEvent event, BullhornData bullhornData) {
		super(new ClientContactScheduledTaskHelper(event,bullhornData), EventType.getType(event.getEventType()));
	}

}
