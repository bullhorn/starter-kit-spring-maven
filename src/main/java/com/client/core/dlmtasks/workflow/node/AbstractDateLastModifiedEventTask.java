package com.client.core.dlmtasks.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.google.common.collect.Sets;

import java.util.Set;

public abstract class AbstractDateLastModifiedEventTask<T extends BullhornEntity> {

    private static final Set<String> ID = Sets.newHashSet("id");

    private final Class<T> type;
    private final Integer intervalMinutes;
    private final Set<String> fields;
    private final DateLastModifiedOption.IncludeDateAdded includeDateAdded;

    public AbstractDateLastModifiedEventTask(Class<T> type, Integer intervalMinutes) {
        this.type = type;
        this.intervalMinutes = intervalMinutes;
        this.fields = Sets.newHashSet("id");
        this.includeDateAdded = DateLastModifiedOption.IncludeDateAdded.YES;
    }

    public AbstractDateLastModifiedEventTask(Class<T> type, Integer intervalMinutes, Set<String> fields) {
        this.type = type;
        this.intervalMinutes = intervalMinutes;
        this.fields = fields;
        this.includeDateAdded = DateLastModifiedOption.IncludeDateAdded.YES;
    }

    public AbstractDateLastModifiedEventTask(Class<T> type, Integer intervalMinutes, DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        this.type = type;
        this.intervalMinutes = intervalMinutes;
        this.fields = ID;
        this.includeDateAdded = includeDateAdded;
    }

    public AbstractDateLastModifiedEventTask(Class<T> type, Integer intervalMinutes, Set<String> fields,
                                             DateLastModifiedOption.IncludeDateAdded includeDateAdded) {
        this.type = type;
        this.intervalMinutes = intervalMinutes;
        this.fields = fields;
        this.includeDateAdded = includeDateAdded;
    }

    public abstract void process(T entity);

    public Class<T> getType() {
        return type;
    }

    public Integer getIntervalMinutes() {
        return intervalMinutes;
    }

    public Set<String> getFields() {
        return fields;
    }

    public DateLastModifiedOption.IncludeDateAdded getIncludeDateAdded() {
        return includeDateAdded;
    }
}
