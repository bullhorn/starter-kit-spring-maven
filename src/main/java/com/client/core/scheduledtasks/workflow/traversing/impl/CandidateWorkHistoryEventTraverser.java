package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.CandidateWorkHistoryScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class CandidateWorkHistoryEventTraverser extends AbstractScheduledTasksTraverser<CandidateWorkHistoryScheduledTaskHelper> {

	public CandidateWorkHistoryEventTraverser(CustomSubscriptionEvent event) {
		super(new CandidateWorkHistoryScheduledTaskHelper(event),EventType.getType(event.getEntityEventType()));
	
	}

}
