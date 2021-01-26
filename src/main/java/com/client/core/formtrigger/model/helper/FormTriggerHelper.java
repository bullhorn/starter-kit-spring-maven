package com.client.core.formtrigger.model.helper;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.formtrigger.model.form.AbstractFormDto;

public interface FormTriggerHelper<T extends AbstractFormDto<E>, E extends BullhornEntity> extends TriggerHelper<E> {

	T getFormValues();

}
