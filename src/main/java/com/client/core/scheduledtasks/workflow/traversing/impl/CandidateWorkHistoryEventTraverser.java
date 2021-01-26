package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.CandidateWorkHistoryScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

import java.util.Map;
import java.util.Set;

public class CandidateWorkHistoryEventTraverser extends AbstractScheduledTasksTraverser<CandidateWorkHistoryScheduledTaskHelper> {

	public CandidateWorkHistoryEventTraverser(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new CandidateWorkHistoryScheduledTaskHelper(event, relatedEntityFields), EventType.getType(event.getEntityEventType()));
	
	}

}
