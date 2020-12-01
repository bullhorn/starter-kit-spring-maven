package com.client.core.dlmtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.workflow.node.AbstractDateLastModifiedEventTask;

import java.util.Set;

public abstract class ClientCorporationDateLastModifiedEventTask extends AbstractDateLastModifiedEventTask<ClientCorporation> {
    
    public ClientCorporationDateLastModifiedEventTask(Integer intervalMinutes) {
        super(ClientCorporation.class, intervalMinutes);
    }

    public ClientCorporationDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields) {
        super(ClientCorporation.class, intervalMinutes, fields);
    }

    public ClientCorporationDateLastModifiedEventTask(Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(ClientCorporation.class, intervalMinutes, includeDateAdded);
    }

    public ClientCorporationDateLastModifiedEventTask(Integer intervalMinutes, Set<String> fields, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        super(ClientCorporation.class, intervalMinutes, fields, includeDateAdded);
    }
    
}
