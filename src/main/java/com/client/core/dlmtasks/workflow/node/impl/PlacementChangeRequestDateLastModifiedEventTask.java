package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PlacementChangeRequestDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<PlacementChangeRequest> {
    
    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes) {
        super(PlacementChangeRequest.class, intervalMinutes);
    }

    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(PlacementChangeRequest.class, intervalMinutes, fields);
    }

    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PlacementChangeRequest.class, intervalMinutes, includeDateAdded);
    }

    public PlacementChangeRequestDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PlacementChangeRequest.class, intervalMinutes, fields, includeDateAdded);
    }
    
}
