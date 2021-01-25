package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.NoteScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.NoteEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class NoteEventTask extends AbstractEventTask<Note, NoteScheduledTaskHelper, NoteEventTraverser> {

    public NoteEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public NoteEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
