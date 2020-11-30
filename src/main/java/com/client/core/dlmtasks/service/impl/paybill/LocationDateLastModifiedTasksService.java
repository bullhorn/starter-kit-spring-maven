package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.Location;
import com.client.core.dlmtasks.service.impl.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<Location> {

    @Autowired
    public LocationDateLastModifiedTasksService(List<DateLastModifiedEventTask<Location>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, Location.class);
    }

}
