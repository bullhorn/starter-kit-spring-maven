package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.workflow.traversing.TriggerTraverser;

public interface TriggerValidator<E extends BullhornEntity, H extends TriggerHelper<E>, T extends TriggerTraverser<E, H>> extends WorkflowAction<E, T> {

    void validate(T traverser);

}
