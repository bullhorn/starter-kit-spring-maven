package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.CandidateEducationScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class CandidateEducationEventTraverser extends AbstractScheduledTasksTraverser<CandidateEducationScheduledTaskHelper> {

	public CandidateEducationEventTraverser(CustomSubscriptionEvent event) {
		super(new CandidateEducationScheduledTaskHelper(event),EventType.getType(event.getEntityEventType()));
	}

}
