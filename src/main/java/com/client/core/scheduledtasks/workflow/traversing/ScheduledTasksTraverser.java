package com.client.core.scheduledtasks.workflow.traversing;

import com.client.core.base.workflow.traversing.Traverser;
import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;

/**
 * Created by john.sullivan on 18/11/2015.
 */
public interface ScheduledTasksTraverser<T extends ScheduledTaskHelper> extends Traverser {

    T getScheduledTaskHelper();

    EventType getEventType();

}