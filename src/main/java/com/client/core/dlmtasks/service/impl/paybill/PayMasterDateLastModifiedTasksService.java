package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayMasterDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<PayMaster> {

    @Autowired
    public PayMasterDateLastModifiedTasksService(List<DateLastModifiedEventTask<PayMaster>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, PayMaster.class);
    }

}
