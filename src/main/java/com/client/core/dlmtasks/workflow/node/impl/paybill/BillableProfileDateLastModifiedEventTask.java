package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class BillableProfileDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<BillingProfile> {

    public BillableProfileDateLastModifiedEventTask(Integer intervalMinutes) {
        super(BillingProfile.class, intervalMinutes);
    }

    public BillableProfileDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(BillingProfile.class, intervalMinutes, fields);
    }

    public BillableProfileDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillingProfile.class, intervalMinutes, includeDateAdded);
    }

    public BillableProfileDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillingProfile.class, intervalMinutes, fields, includeDateAdded);
    }

}
