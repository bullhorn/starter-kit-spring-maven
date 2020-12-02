package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class CandidateDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<Candidate> {

    public CandidateDateLastModifiedEventTask(Integer intervalMinutes) {
        super(Candidate.class, intervalMinutes);
    }

    public CandidateDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(Candidate.class, intervalMinutes, fields);
    }

    public CandidateDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Candidate.class, intervalMinutes, includeDateAdded);
    }

    public CandidateDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Candidate.class, intervalMinutes, fields, includeDateAdded);
    }

}
