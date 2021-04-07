package com.client.core.resttrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.relatedentity.NoteRelatedEntity;
import com.client.core.resttrigger.model.helper.impl.NoteRestTriggerHelper;
import com.client.core.resttrigger.workflow.traversing.NoteRestTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class NoteRestTriggerValidator extends AbstractRestTriggerValidator<Note, NoteRestTriggerHelper, NoteRestTriggerTraverser> {

    public NoteRestTriggerValidator(Integer order, Map<NoteRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public NoteRestTriggerValidator(Map<NoteRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
