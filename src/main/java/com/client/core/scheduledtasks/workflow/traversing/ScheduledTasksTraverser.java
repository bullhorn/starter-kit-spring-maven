package com.client.core.scheduledtasks.workflow.traversing;

import com.client.core.base.workflow.traversing.Traverser;
import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;

public interface ScheduledTasksTraverser<T extends ScheduledTaskHelper> extends Traverser {

    T getScheduledTaskHelper();

    EventType getEventType();

}
