package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillMasterTransactionDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<BillMasterTransaction> {

    @Autowired
    public BillMasterTransactionDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<BillMasterTransaction>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, BillMasterTransaction.class);
    }

}
