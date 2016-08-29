package com.client.core.resttrigger.model.helper;

import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;

/**
 * The main interface for form trigger helpers.
 * 
 * @author magnus.palm
 *
 * @param <E>
 *            The bullhorn entity corresponding to the T
 */
public interface RestTriggerHelper<E extends BullhornEntity> extends TriggerHelper<E> {

	Set<String> getPopulatedFields();

	Integer getEntityID();

	Map<String, Object> getValuesChanged();
}
