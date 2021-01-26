package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.client.core.base.model.relatedentity.AppointmentRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.AppointmentScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.AppointmentEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class AppointmentEventTask extends AbstractEventTask<Appointment, AppointmentScheduledTaskHelper, AppointmentEventTraverser> {

    public AppointmentEventTask(Integer order, Map<AppointmentRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public AppointmentEventTask(Map<AppointmentRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
