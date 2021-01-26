package com.client.core.resttrigger.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;

public interface RestTriggerValidator<E extends BullhornEntity, H extends RestTriggerHelper<E>, T extends TriggerTraverser<E, H>> extends TriggerValidator<E, H, T> {

}
