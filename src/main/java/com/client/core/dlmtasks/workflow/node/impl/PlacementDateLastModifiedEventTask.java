package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PlacementDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<Placement> {
    
    public PlacementDateLastModifiedEventTask(Integer intervalMinutes) {
        super(Placement.class, intervalMinutes);
    }

    public PlacementDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(Placement.class, intervalMinutes, fields);
    }

    public PlacementDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Placement.class, intervalMinutes, includeDateAdded);
    }

    public PlacementDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Placement.class, intervalMinutes, fields, includeDateAdded);
    }
    
}
