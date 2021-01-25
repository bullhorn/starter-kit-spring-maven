package com.client.core.formtrigger.model.form;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public interface CustomDto<T extends BullhornEntity> {

	/**
	 * Returns the Bullhorn type T
	 * 
	 * @return
	 */
	public T instantiateEntity();

}
