package com.client.core.formtrigger.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.client.core.formtrigger.model.helper.FormTriggerHelper;

public interface FormTriggerValidator<E extends BullhornEntity, D extends AbstractFormDto<E>, H extends FormTriggerHelper<D, E>, T extends TriggerTraverser<E, H>> extends TriggerValidator<E, H, T> {

}
