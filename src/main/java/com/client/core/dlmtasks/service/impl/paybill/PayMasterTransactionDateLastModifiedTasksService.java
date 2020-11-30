package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayMasterTransaction;
import com.client.core.dlmtasks.service.impl.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayMasterTransactionDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<PayMasterTransaction> {

    @Autowired
    public PayMasterTransactionDateLastModifiedTasksService(List<DateLastModifiedEventTask<PayMasterTransaction>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, PayMasterTransaction.class);
    }

}
