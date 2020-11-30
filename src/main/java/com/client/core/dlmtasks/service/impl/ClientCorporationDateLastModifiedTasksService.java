package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientCorporationDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<ClientCorporation> {

    @Autowired
    public ClientCorporationDateLastModifiedTasksService(List<DateLastModifiedEventTask<ClientCorporation>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, ClientCorporation.class);
    }

}
