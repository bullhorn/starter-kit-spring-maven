package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementBatch;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class InvoiceStatementBatchDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<InvoiceStatementBatch> {

    public InvoiceStatementBatchDateLastModifiedEventTask(Integer intervalMinutes) {
        super(InvoiceStatementBatch.class, intervalMinutes);
    }

    public InvoiceStatementBatchDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(InvoiceStatementBatch.class, intervalMinutes, fields);
    }

    public InvoiceStatementBatchDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(InvoiceStatementBatch.class, intervalMinutes, includeDateAdded);
    }

    public InvoiceStatementBatchDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(InvoiceStatementBatch.class, intervalMinutes, fields, includeDateAdded);
    }

}
