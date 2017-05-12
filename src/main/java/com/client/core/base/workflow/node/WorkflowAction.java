package com.client.core.base.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.workflow.traversing.Traverser;

/**
 * Created by john.sullivan on 12/5/2017.
 */
public interface WorkflowAction<E extends BullhornEntity, T extends Traverser> extends Comparable<WorkflowAction<E, T>> {

    Integer order();

    @Override
    default int compareTo(WorkflowAction<E, T> validator) {
        return this.order().compareTo(validator.order());
    }

}
