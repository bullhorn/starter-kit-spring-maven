package com.client.core.formtrigger.model.helper;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.formtrigger.model.form.AbstractFormDto;

/**
 * The main interface for form trigger helpers.
 * 
 * @author magnus.palm
 *
 * @param <T>
 *            The T AbstractFormDto from the bullhorn form
 * @param <E>
 *            The bullhorn entity corresponding to the T
 */
public interface FormTriggerHelper<T extends AbstractFormDto<E>, E extends BullhornEntity> extends TriggerHelper<E> {

	/**
	 * Gets the implementation of AbstractFormDto, that is the data from the bullhorn form. This databinding between the request parameters
	 * from the form and T is handled by Spring.
	 * 
	 * @return the T form dto containing data from the bullhorn form
	 */
	T getFormValues();

}
