package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.model.helper.impl.NoteFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.NoteFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class NoteFormTriggerValidator
        extends AbstractFormTriggerValidator<Note, FormNoteDto, NoteFormTriggerHelper, NoteFormTriggerTraverser> {

    public NoteFormTriggerValidator(Integer order) {
        super(order);
    }

    public NoteFormTriggerValidator() {
    }

}