package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.client.core.base.model.relatedentity.AppointmentRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.AppointmentScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.AppointmentEventListTraverser;
import com.client.core.scheduledtasks.workflow.traversing.impl.AppointmentEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class AppointmentEventListTask extends AbstractEventListTask<Appointment, AppointmentScheduledTaskHelper, AppointmentEventListTraverser> {

    public AppointmentEventListTask(Integer order, Map<AppointmentRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public AppointmentEventListTask(Map<AppointmentRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
