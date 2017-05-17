package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.scheduledtasks.model.helper.impl.LeadScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.LeadEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class LeadEventTask extends AbstractEventTask<Lead, LeadScheduledTaskHelper, LeadEventTraverser> {

    public LeadEventTask(Integer order) {
        super(order);
    }

    public LeadEventTask() {
    }

}