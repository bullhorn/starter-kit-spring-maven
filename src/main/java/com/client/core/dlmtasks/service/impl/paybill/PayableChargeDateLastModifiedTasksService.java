package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge;
import com.client.core.dlmtasks.service.impl.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayableChargeDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<PayableCharge> {

    @Autowired
    public PayableChargeDateLastModifiedTasksService(List<DateLastModifiedEventTask<PayableCharge>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, PayableCharge.class);
    }

}
