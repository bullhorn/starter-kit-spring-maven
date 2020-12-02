package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.transaction.PayMasterTransaction;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PayMasterTransactionDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<PayMasterTransaction> {

    public PayMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes) {
        super(PayMasterTransaction.class, intervalMinutes);
    }

    public PayMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(PayMasterTransaction.class, intervalMinutes, fields);
    }

    public PayMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayMasterTransaction.class, intervalMinutes, includeDateAdded);
    }

    public PayMasterTransactionDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayMasterTransaction.class, intervalMinutes, fields, includeDateAdded);
    }

}
