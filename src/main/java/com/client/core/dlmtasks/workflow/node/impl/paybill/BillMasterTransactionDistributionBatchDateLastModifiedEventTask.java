package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.distribution.BillMasterTransactionDistributionBatch;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class BillMasterTransactionDistributionBatchDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<BillMasterTransactionDistributionBatch> {

    public BillMasterTransactionDistributionBatchDateLastModifiedEventTask(Integer intervalMinutes) {
        super(BillMasterTransactionDistributionBatch.class, intervalMinutes);
    }

    public BillMasterTransactionDistributionBatchDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(BillMasterTransactionDistributionBatch.class, intervalMinutes, fields);
    }

    public BillMasterTransactionDistributionBatchDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillMasterTransactionDistributionBatch.class, intervalMinutes, includeDateAdded);
    }

    public BillMasterTransactionDistributionBatchDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillMasterTransactionDistributionBatch.class, intervalMinutes, fields, includeDateAdded);
    }

}
