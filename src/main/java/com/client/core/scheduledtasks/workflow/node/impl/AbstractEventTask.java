package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.node.AbstractWorkflowAction;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.EventTask;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

import java.util.Map;
import java.util.Set;

public abstract class AbstractEventTask<E extends BullhornEntity, H extends AbstractScheduledTaskHelper<E>, T extends AbstractScheduledTasksTraverser<H>>
        extends AbstractWorkflowAction<E, T>  implements EventTask<E, H, T> {

	private final Integer order;

	protected AbstractEventTask(Integer order, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(relatedEntityFields);
		this.order = order;
	}

	protected AbstractEventTask(Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(relatedEntityFields);
		this.order = -1;
	}

	@Override
	public Integer order() {
		return order;
	}

}
