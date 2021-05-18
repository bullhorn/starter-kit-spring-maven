package com.client.core.scheduledtasks.service;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.List;

public interface EventListWorkflowFactory {

    <T extends BullhornEntity> void execute(Class<T> type, List<CustomSubscriptionEvent> events);

}
