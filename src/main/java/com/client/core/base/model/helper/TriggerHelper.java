package com.client.core.base.model.helper;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public interface TriggerHelper<E extends BullhornEntity> extends Helper<E> {

	/**
	 * Returns the new entity instantiated from the T form values.
	 *
	 * Example: a FormJobOrderDto will instantiate a JobOrder.
	 *
	 * @return The bullhorn {@link BullhornEntity} based on the form just saved
	 */
	E getNewEntity();

	/**
	 * The currently stored data for this entity that is saved in bullhorn.
	 *
	 * @return The currently stored data from bullhorn
	 */
	E getOldEntity();

}
