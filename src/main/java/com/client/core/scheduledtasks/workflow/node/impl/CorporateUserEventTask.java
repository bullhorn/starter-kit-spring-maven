package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.scheduledtasks.model.helper.impl.CorporateUserScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CorporateUserEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CorporateUserEventTask extends AbstractEventTask<CorporateUser, CorporateUserScheduledTaskHelper, CorporateUserEventTraverser> {

    public CorporateUserEventTask(Integer order) {
        super(order);
    }

    public CorporateUserEventTask() {
    }

}