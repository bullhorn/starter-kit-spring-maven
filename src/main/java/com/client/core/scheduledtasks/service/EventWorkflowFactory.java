package com.client.core.scheduledtasks.service;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Created by john.sullivan on 12/5/2017.
 */
public interface EventWorkflowFactory {

    <T extends BullhornEntity> void execute(Class<T> type, CustomSubscriptionEvent event);

}
