package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.relatedentity.NoteRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.NoteScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.NoteEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class NoteEventListTask extends AbstractEventListTask<Note, NoteScheduledTaskHelper, NoteEventListTraverser> {

    public NoteEventListTask(Integer order, Map<NoteRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public NoteEventListTask(Map<NoteRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
