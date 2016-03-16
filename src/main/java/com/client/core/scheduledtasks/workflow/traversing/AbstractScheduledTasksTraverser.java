package com.client.core.scheduledtasks.workflow.traversing;

import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;

public class AbstractScheduledTasksTraverser<T extends ScheduledTaskHelper> implements ScheduledTasksTraverser<T> {

	private final T scheduledTaskHelper;
	private final EventType eventType;

	public AbstractScheduledTasksTraverser(T scheduledTaskHelper, EventType eventType) {
		super();
		this.scheduledTaskHelper = scheduledTaskHelper;
		this.eventType = eventType;
	}

    @Override
	public T getScheduledTaskHelper() {
		return scheduledTaskHelper;
	}

    @Override
	public EventType getEventType() {
		return eventType;
	}

	@Override
	public String toString() {
		String NEW_LINE = System.getProperty("line.separator");
        return new StringBuilder().append(this.getClass().getName() + " Object {" + NEW_LINE)
		    .append(" scheduledTaskHelper: " + scheduledTaskHelper + NEW_LINE)
		    .append(" eventType: " + eventType + NEW_LINE)
		    .append("}").toString();
	}

}
