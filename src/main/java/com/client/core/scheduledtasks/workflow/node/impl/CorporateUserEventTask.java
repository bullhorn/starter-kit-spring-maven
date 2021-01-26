package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.relatedentity.CorporateUserRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CorporateUserScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CorporateUserEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CorporateUserEventTask extends AbstractEventTask<CorporateUser, CorporateUserScheduledTaskHelper, CorporateUserEventTraverser> {

    public CorporateUserEventTask(Integer order, Map<CorporateUserRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CorporateUserEventTask(Map<CorporateUserRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
