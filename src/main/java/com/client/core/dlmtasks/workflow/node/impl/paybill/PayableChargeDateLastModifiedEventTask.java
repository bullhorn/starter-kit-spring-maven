package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.charge.PayableCharge;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PayableChargeDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<PayableCharge> {

    public PayableChargeDateLastModifiedEventTask(Integer intervalMinutes) {
        super(PayableCharge.class, intervalMinutes);
    }

    public PayableChargeDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(PayableCharge.class, intervalMinutes, fields);
    }

    public PayableChargeDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayableCharge.class, intervalMinutes, includeDateAdded);
    }

    public PayableChargeDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayableCharge.class, intervalMinutes, fields, includeDateAdded);
    }

}
