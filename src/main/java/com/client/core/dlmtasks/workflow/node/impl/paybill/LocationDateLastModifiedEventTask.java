package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class LocationDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<Location> {

    public LocationDateLastModifiedEventTask(Integer intervalMinutes) {
        super(Location.class, intervalMinutes);
    }

    public LocationDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(Location.class, intervalMinutes, fields);
    }

    public LocationDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Location.class, intervalMinutes, includeDateAdded);
    }

    public LocationDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(Location.class, intervalMinutes, fields, includeDateAdded);
    }

}
