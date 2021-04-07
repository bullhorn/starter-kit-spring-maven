package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.client.core.dlmtasks.service.SearchDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteDateLastModifiedTasksService extends SearchDateLastModifiedTasksService<Note> {

    @Autowired
    public NoteDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<Note>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Note.class);
    }

}
