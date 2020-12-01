package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillableChargeDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<BillableCharge> {

    @Autowired
    public BillableChargeDateLastModifiedTasksService(List<DateLastModifiedEventTask<BillableCharge>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, BillableCharge.class);
    }

}
