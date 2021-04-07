package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.Traverser;

import java.util.Map;
import java.util.Set;

public interface WorkflowAction<E extends BullhornEntity, T extends Traverser> extends Comparable<WorkflowAction<E, T>> {

    Integer order();

    @Override
    default int compareTo(WorkflowAction<E, T> validator) {
        return this.order().compareTo(validator.order());
    }

    Map<? extends BullhornRelatedEntity, Set<String>> getRelatedEntityFields();

}
