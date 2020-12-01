package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class LeadDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<Lead> {
    
    public LeadDateLastModifiedEventTask(Integer intervalMinutes) {
        super(Lead.class, intervalMinutes);
    }

    public LeadDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(Lead.class, intervalMinutes, fields);
    }

    public LeadDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Lead.class, intervalMinutes, includeDateAdded);
    }

    public LeadDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Lead.class, intervalMinutes, fields, includeDateAdded);
    }
    
}
