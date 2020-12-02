package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayMasterTransaction;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayMasterTransactionDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<PayMasterTransaction> {

    @Autowired
    public PayMasterTransactionDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<PayMasterTransaction>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, PayMasterTransaction.class);
    }

}
