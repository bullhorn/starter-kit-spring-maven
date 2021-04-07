package com.client.core.dlmtasks.workflow.node.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.master.BillMaster;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class BillMasterDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<BillMaster> {

    public BillMasterDateLastModifiedEventTask(Integer intervalMinutes) {
        super(BillMaster.class, intervalMinutes);
    }

    public BillMasterDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(BillMaster.class, intervalMinutes, fields);
    }

    public BillMasterDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillMaster.class, intervalMinutes, includeDateAdded);
    }

    public BillMasterDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(BillMaster.class, intervalMinutes, fields, includeDateAdded);
    }

}
