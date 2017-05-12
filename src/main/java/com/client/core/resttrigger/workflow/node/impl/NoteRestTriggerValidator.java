package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.resttrigger.model.helper.impl.NoteRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.NoteRestTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class NoteRestTriggerValidator extends AbstractRestTriggerValidator<Note, NoteRestTriggerHelper, NoteRestTriggerTraverser> {

    public NoteRestTriggerValidator(Integer order) {
        super(order);
    }

    public NoteRestTriggerValidator() {
    }

}