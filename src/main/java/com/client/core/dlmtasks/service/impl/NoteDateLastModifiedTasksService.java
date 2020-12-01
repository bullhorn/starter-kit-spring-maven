package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.dlmtasks.service.SearchDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteDateLastModifiedTasksService extends SearchDateLastModifiedTasksService<Note> {

    @Autowired
    public NoteDateLastModifiedTasksService(List<DateLastModifiedEventTask<Note>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Note.class);
    }

}
