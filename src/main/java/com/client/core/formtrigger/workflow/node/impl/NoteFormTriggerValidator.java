package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.relatedentity.NoteRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormNoteDto;
import com.client.core.formtrigger.model.helper.impl.NoteFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.NoteFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class NoteFormTriggerValidator
        extends AbstractFormTriggerValidator<Note, FormNoteDto, NoteFormTriggerHelper, NoteFormTriggerTraverser> {

    public NoteFormTriggerValidator(Integer order, Map<NoteRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public NoteFormTriggerValidator(Map<NoteRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
