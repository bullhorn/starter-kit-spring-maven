package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.client.core.scheduledtasks.model.helper.impl.AppointmentScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.AppointmentEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class AppointmentEventTask extends AbstractEventTask<Appointment, AppointmentScheduledTaskHelper, AppointmentEventTraverser> {

    public AppointmentEventTask(Integer order) {
        super(order);
    }

    public AppointmentEventTask() {
    }

}