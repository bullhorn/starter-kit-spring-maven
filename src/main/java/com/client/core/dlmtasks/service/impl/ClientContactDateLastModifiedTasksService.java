package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientContactDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<ClientContact> {

    @Autowired
    public ClientContactDateLastModifiedTasksService(List<DateLastModifiedEventTask<ClientContact>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, ClientContact.class);
    }

}
