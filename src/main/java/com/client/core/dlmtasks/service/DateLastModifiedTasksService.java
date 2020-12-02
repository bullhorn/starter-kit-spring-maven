package com.client.core.dlmtasks.service;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import org.joda.time.DateTime;

public interface DateLastModifiedTasksService<T extends BullhornEntity> {

    Class<T> getType();

    void process(DateTime start);

}
