package com.client.core.dlmtasks;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.dlmtasks.service.DateLastModifiedTasksService;
import lombok.extern.log4j.Log4j2;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class DateLastModifiedEventProcessing implements Runnable {

    private final List<DateLastModifiedTasksService<? extends BullhornEntity>> dateLastModifiedTasksServices;

    @Autowired
    public DateLastModifiedEventProcessing(List<DateLastModifiedTasksService<? extends BullhornEntity>> dateLastModifiedTasksServices) {
        this.dateLastModifiedTasksServices = dateLastModifiedTasksServices;
    }

    @Override
    @Scheduled(cron = "${date.last.modified.cron.expression}")
    public void run() {
        DateTime start = new DateTime().withSecondOfMinute(0).withMillisOfSecond(0);

        this.dateLastModifiedTasksServices.parallelStream().forEach(dateLastModifiedTasksService -> {
            try {
                dateLastModifiedTasksService.process(start);
            } catch (RuntimeException e) {
                log.error("Error occurred running DLM Tasks for " + dateLastModifiedTasksService.getType().getSimpleName(), e);
            }
        });
    }

}
