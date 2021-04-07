package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayableChargeDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<PayableCharge> {

    @Autowired
    public PayableChargeDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<PayableCharge>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, PayableCharge.class);
    }

}
