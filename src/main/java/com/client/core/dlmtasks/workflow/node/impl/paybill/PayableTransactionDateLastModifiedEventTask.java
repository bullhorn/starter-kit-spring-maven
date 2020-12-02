package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayableTransaction;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PayableTransactionDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<PayableTransaction> {

    public PayableTransactionDateLastModifiedEventTask(Integer intervalMinutes) {
        super(PayableTransaction.class, intervalMinutes);
    }

    public PayableTransactionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(PayableTransaction.class, intervalMinutes, fields);
    }

    public PayableTransactionDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayableTransaction.class, intervalMinutes, includeDateAdded);
    }

    public PayableTransactionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayableTransaction.class, intervalMinutes, fields, includeDateAdded);
    }

}
