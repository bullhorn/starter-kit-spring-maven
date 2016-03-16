package com.client.core.scheduledtasks.workflow.node.task;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.client.core.base.workflow.node.task.Task;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * Wire this class to workflows that will need to save the dtos from the scheduled tasks logic
 * 
 * @author magnus.palm
 * 
 */
public class SaveDtos extends Task<AbstractScheduledTasksTraverser<?>> {

	private final Logger log = Logger.getLogger(getClass());

	@Autowired
	private BullhornData bullhornData;

	public SaveDtos() {
		super();
	}

	@Override
	protected void handle(AbstractScheduledTasksTraverser<?> traverser) {
		saveDtos(traverser);
	}

	/**
	 * Will save all dtos updated in the other scheduled tasks.
	 * 
	 * @param traverser Contains all dtos to save
	 */
	private <T extends UpdateEntity> void saveDtos(AbstractScheduledTasksTraverser<?> traverser) {
		Map<String, T> dtosToSave = traverser.getScheduledTaskHelper().getAllEntitiesToSave();
		// save all dtos
		for (Map.Entry<String, T> entry : dtosToSave.entrySet()) {
			bullhornData.updateEntity(entry.getValue());
		}
	}
}
