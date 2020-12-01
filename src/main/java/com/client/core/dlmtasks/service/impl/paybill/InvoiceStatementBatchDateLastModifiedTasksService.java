package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementBatch;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceStatementBatchDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<InvoiceStatementBatch> {

    @Autowired
    public InvoiceStatementBatchDateLastModifiedTasksService(List<DateLastModifiedEventTask<InvoiceStatementBatch>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, InvoiceStatementBatch.class);
    }

}
