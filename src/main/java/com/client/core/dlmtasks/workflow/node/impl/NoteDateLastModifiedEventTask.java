package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class NoteDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<Note> {
    
    public NoteDateLastModifiedEventTask(Integer intervalMinutes) {
        super(Note.class, intervalMinutes);
    }

    public NoteDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(Note.class, intervalMinutes, fields);
    }

    public NoteDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Note.class, intervalMinutes, includeDateAdded);
    }

    public NoteDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Note.class, intervalMinutes, fields, includeDateAdded);
    }
    
}
