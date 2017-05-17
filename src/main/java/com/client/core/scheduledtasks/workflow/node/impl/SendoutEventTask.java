package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.client.core.scheduledtasks.model.helper.impl.SendoutScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.SendoutEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class SendoutEventTask extends AbstractEventTask<Sendout, SendoutScheduledTaskHelper, SendoutEventTraverser> {

    public SendoutEventTask(Integer order) {
        super(order);
    }

    public SendoutEventTask() {
    }

}