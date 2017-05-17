package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.scheduledtasks.model.helper.impl.OpportunityScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.OpportunityEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class OpportunityEventTask extends AbstractEventTask<Opportunity, OpportunityScheduledTaskHelper, OpportunityEventTraverser> {

    public OpportunityEventTask(Integer order) {
        super(order);
    }

    public OpportunityEventTask() {
    }

}