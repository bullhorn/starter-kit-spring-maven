package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateDateLastModifiedTasksService extends SearchDateLastModifiedTasksService<Candidate> {

    @Autowired
    public CandidateDateLastModifiedTasksService(List<DateLastModifiedEventTask<Candidate>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Candidate.class);
    }

}
