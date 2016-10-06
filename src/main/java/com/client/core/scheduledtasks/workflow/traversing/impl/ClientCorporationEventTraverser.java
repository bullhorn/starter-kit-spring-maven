package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.ClientCorporationScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class ClientCorporationEventTraverser extends
        AbstractScheduledTasksTraverser<ClientCorporationScheduledTaskHelper> {

	public ClientCorporationEventTraverser(CustomSubscriptionEvent event ) {
		super(new ClientCorporationScheduledTaskHelper(event),EventType.getType(event.getEventType()));

	}

}
