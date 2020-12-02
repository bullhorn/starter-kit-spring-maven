package com.client.core.dlmtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.model.helper.DateLastModifiedEventTaskHelper;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.util.Set;

public class StandardDateLastModifiedEventTaskHelper<T extends BullhornEntity> implements DateLastModifiedEventTaskHelper<T> {

    private final Logger log = Logger.getLogger(getClass());

    private final DateLastModifiedEventTask<T> eventTask;

    private DateTime lastRun;

    public StandardDateLastModifiedEventTaskHelper(DateLastModifiedEventTask<T> eventTask) {
        this.eventTask = eventTask;
    }

    @Override
    public void process(T entity) {
        try {
            eventTask.process(entity);
        } catch (RuntimeException e) {
            log.error("Error occurred running " + eventTask.getClass().getSimpleName() + " for " + eventTask.getType().getSimpleName() + " #" + entity.getId(), e);
        }
    }

    @Override
    public boolean shouldProcess(DateTime start) {
        if (this.lastRun == null) {
            return start.getMinuteOfHour() % this.eventTask.getIntervalMinutes() == 0;
        }

        DateTime nextRun = this.lastRun.plusMinutes(this.eventTask.getIntervalMinutes());

        return start.isAfter(nextRun) || start.isEqual(nextRun);
    }

    @Override
    public Set<String> getFields() {
        return this.eventTask.getFields();
    }

    @Override
    public void updateLastRun(DateTime value) {
        this.lastRun = value;
    }

    @Override
    public DateLastModifiedOption.IncludeDateAdded getIncludeDateAdded() {
        return this.eventTask.getIncludeDateAdded();
    }

    @Override
    public Integer getIntervalMinutes() {
        return eventTask.getIntervalMinutes();
    }

    protected Class<T> getType() {
        return this.eventTask.getType();
    }

}
