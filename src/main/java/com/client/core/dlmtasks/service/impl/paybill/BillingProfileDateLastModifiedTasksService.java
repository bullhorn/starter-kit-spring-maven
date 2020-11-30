package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.client.core.dlmtasks.service.impl.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingProfileDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<BillingProfile> {

    @Autowired
    public BillingProfileDateLastModifiedTasksService(List<DateLastModifiedEventTask<BillingProfile>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, BillingProfile.class);
    }

}
