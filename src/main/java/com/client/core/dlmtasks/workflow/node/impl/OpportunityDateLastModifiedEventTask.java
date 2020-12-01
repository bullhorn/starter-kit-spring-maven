package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class OpportunityDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<Opportunity> {
    
    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes) {
        super(Opportunity.class, intervalMinutes);
    }

    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(Opportunity.class, intervalMinutes, fields);
    }

    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Opportunity.class, intervalMinutes, includeDateAdded);
    }

    public OpportunityDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Opportunity.class, intervalMinutes, fields, includeDateAdded);
    }
    
}
