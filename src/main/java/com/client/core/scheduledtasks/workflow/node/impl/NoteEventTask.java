package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.scheduledtasks.model.helper.impl.NoteScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.NoteEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class NoteEventTask extends AbstractEventTask<Note, NoteScheduledTaskHelper, NoteEventTraverser> {

    public NoteEventTask(Integer order) {
        super(order);
    }

    public NoteEventTask() {
    }

}