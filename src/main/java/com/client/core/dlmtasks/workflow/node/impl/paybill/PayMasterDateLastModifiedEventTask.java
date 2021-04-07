package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.master.PayMaster;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class PayMasterDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<PayMaster> {

    public PayMasterDateLastModifiedEventTask(Integer intervalMinutes) {
        super(PayMaster.class, intervalMinutes);
    }

    public PayMasterDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(PayMaster.class, intervalMinutes, fields);
    }

    public PayMasterDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayMaster.class, intervalMinutes, includeDateAdded);
    }

    public PayMasterDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(PayMaster.class, intervalMinutes, fields, includeDateAdded);
    }

}
