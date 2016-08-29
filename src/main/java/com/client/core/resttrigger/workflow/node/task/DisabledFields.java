package com.client.core.resttrigger.workflow.node.task;

import java.util.Set;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.workflow.node.task.Task;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.RestTriggerHelper;
import com.google.common.collect.Sets;

/**
 * Created by john.sullivan on 26/8/2016.
 */
public class DisabledFields<E extends BullhornEntity, H extends RestTriggerHelper<E>, T extends AbstractTriggerTraverser<E, H>> extends Task<T> {

    private final Set<String> fields;

    public DisabledFields(Set<String> fields) {
        this.fields = fields;
    }

    @Override
    protected void handle(T tasks) {
        Set<String> modifiedDisabledFields = Sets.intersection(fields, tasks.getTriggerHelper().getPopulatedFields());

        if(!modifiedDisabledFields.isEmpty()) {
            tasks.addFormResponse("error:disabledfields", "This change cannot be performed.");
        }
    }
}
