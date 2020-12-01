package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayableTransaction;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayableTransactionDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<PayableTransaction> {

    @Autowired
    public PayableTransactionDateLastModifiedTasksService(List<DateLastModifiedEventTask<PayableTransaction>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, PayableTransaction.class);
    }

}
