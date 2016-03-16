package com.client.core.formtrigger.model.form;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Represents a custom version of a bullhorn entity T
 * 
 * @author Magnus
 * 
 * @param <T>
 */
public interface CustomDto<T extends BullhornEntity> {

	/**
	 * Returns the Bullhorn type T
	 * 
	 * @return
	 */
	public T instantiateEntity();

}
