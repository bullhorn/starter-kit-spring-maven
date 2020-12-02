package com.client.core.dlmtasks.model.helper;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import org.joda.time.DateTime;

import java.util.Set;

public interface DateLastModifiedEventTaskHelper<T extends BullhornEntity> {

    void process(T entity);

    boolean shouldProcess(DateTime start);

    Set<String> getFields();

    void updateLastRun(DateTime value);

    DateLastModifiedOption.IncludeDateAdded getIncludeDateAdded();

    Integer getIntervalMinutes();

}
