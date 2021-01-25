package com.client.core.scheduledtasks.service;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

public interface EventWorkflowFactory {

    <T extends BullhornEntity> void execute(Class<T> type, CustomSubscriptionEvent event);

}
