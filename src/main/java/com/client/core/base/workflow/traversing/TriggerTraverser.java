package com.client.core.base.workflow.traversing;


import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;

import java.util.Map;

public interface TriggerTraverser<E extends BullhornEntity, H extends TriggerHelper<E>> extends Traverser {

    void addFormResponse(String key, String message);

    H getTriggerHelper();

    Map<String, Object> getFormResponse();

    boolean isEdit();

    boolean hasErrors();

}
