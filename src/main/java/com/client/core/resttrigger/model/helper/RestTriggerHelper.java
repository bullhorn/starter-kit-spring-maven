package com.client.core.resttrigger.model.helper;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;

import java.util.Map;
import java.util.Set;

public interface RestTriggerHelper<E extends BullhornEntity> extends TriggerHelper<E> {

	Set<String> getPopulatedFields();

	Integer getEntityID();

	Map<String, Object> getValuesChanged();
}
