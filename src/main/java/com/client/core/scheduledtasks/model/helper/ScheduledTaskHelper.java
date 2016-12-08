package com.client.core.scheduledtasks.model.helper;

import java.util.Map;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;

public interface ScheduledTaskHelper<E extends BullhornEntity> {

    /**
     * Returns the entity the subscription event occurred for
     *
     * @return
     */
    E getEntity();

	
	/**
	 * Returns the subscription event that drives this helper.
	 * 
	 * @return
	 */
	CustomSubscriptionEvent getEvent();

	/**
	 * Returns true if any of the field names passed in is part of the subscriptionEvent.updatedProperties
	 * 
	 * @param fieldsToCheck
	 * @return true if a field was updated, false otherwise
	 */

	boolean fieldWasUpdated(String... fieldsToCheck);
	
	
	<T extends BullhornEntity> Map<String, T> getAllEntitiesToSave();

	/**
	 * Returns a deep copy of the passed in entity, if a entity of type T already exists in allEntitiesToSaveBackToBH that entity will be
	 * returned, otherwise this method will return a deep copy the entity passed in to the method.
	 * 
	 * If the entity did not exist in the allDtosToSaveBackToBH map the returned copy will be added to the map.
	 * 
	 *
	 * @param entity
	 *            entity to be copied, if this object already exists in the allDtosToSaveBackToBH map then that entity will be returned.
	 * 
	 * @return A deep copy of the passed in T entity.
	 */
	<T extends UpdateEntity> T getOneEntityToSave(T entity);

    BullhornData getBullhornData();

}
