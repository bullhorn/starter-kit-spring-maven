package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class BillMasterTransactionDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<BillMasterTransaction> {

    public BillMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes) {
        super(BillMasterTransaction.class, intervalMinutes);
    }

    public BillMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(BillMasterTransaction.class, intervalMinutes, fields);
    }

    public BillMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillMasterTransaction.class, intervalMinutes, includeDateAdded);
    }

    public BillMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillMasterTransaction.class, intervalMinutes, fields, includeDateAdded);
    }

}
