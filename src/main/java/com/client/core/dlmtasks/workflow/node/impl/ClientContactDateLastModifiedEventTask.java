package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class ClientContactDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<ClientContact> {
    
    public ClientContactDateLastModifiedEventTask(Integer intervalMinutes) {
        super(ClientContact.class, intervalMinutes);
    }

    public ClientContactDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(ClientContact.class, intervalMinutes, fields);
    }

    public ClientContactDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(ClientContact.class, intervalMinutes, includeDateAdded);
    }

    public ClientContactDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(ClientContact.class, intervalMinutes, fields, includeDateAdded);
    }
    
}
