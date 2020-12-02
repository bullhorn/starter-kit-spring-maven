package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.charge.PayExportBatch;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PayExportBatchDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<PayExportBatch> {

    public PayExportBatchDateLastModifiedEventTask(Integer intervalMinutes) {
        super(PayExportBatch.class, intervalMinutes);
    }

    public PayExportBatchDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(PayExportBatch.class, intervalMinutes, fields);
    }

    public PayExportBatchDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayExportBatch.class, intervalMinutes, includeDateAdded);
    }

    public PayExportBatchDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayExportBatch.class, intervalMinutes, fields, includeDateAdded);
    }

}
