package com.client.core.base.workflow.traversing;


import java.util.Map;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;

public interface TriggerTraverser<E extends BullhornEntity, H extends TriggerHelper<E>> extends Traverser {

    /**
     * {@inheritDoc}
     */
    void addFormResponse(String key, String message);

    H getTriggerHelper();

    Map<String, Object> getFormResponse();

    boolean isEdit();

    boolean hasErrors();

}
