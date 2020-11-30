package com.client.core.dlmtasks;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.dlmtasks.service.DateLastModifiedTasksService;
import com.google.common.collect.Lists;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DateLastModifiedEventProcessing implements Runnable {

    private final Logger log = Logger.getLogger(getClass());

    private final List<DateLastModifiedTasksService<? extends BullhornEntity>> dateLastModifiedTasksServices;

    @Autowired
    public DateLastModifiedEventProcessing(Optional<List<DateLastModifiedTasksService<? extends BullhornEntity>>> dateLastModifiedTasksServices) {
        this.dateLastModifiedTasksServices = dateLastModifiedTasksServices.orElseGet(Lists::newArrayList);
    }

    @Override
    public void run() {
        DateTime start = new DateTime();

        this.dateLastModifiedTasksServices.parallelStream().forEach(dateLastModifiedTasksService -> {
            try {
                dateLastModifiedTasksService.process(start);
            } catch (RuntimeException e) {
                log.error("Error occurred running DLM Tasks for " + dateLastModifiedTasksService.getType().getSimpleName(), e);
            }
        });
    }

}
