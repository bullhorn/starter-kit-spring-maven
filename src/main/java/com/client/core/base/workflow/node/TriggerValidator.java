package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.fields.RelatedTriggerEntity;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.workflow.traversing.TriggerTraverser;

import java.util.Map;
import java.util.Set;

/**
 * Created by john.sullivan on 12/5/2017.
 */
public interface TriggerValidator<E extends BullhornEntity, H extends TriggerHelper<E>, T extends TriggerTraverser<E, H>> extends WorkflowAction<E, T> {

    void validate(T traverser);

    Map<? extends RelatedTriggerEntity, Set<String>> getTriggerEntityFields();

}
