package com.client.core.dlmtasks.workflow.node;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.dlmtasks.model.DateLastModifiedOption;

import java.util.Set;

public interface DateLastModifiedEventTask<T extends BullhornEntity> {

    void process(T entity);

    Class<T> getType();

    Integer getIntervalMinutes();

    Set<String> getFields();

    DateLastModifiedOption.IncludeDateAdded getIncludeDateAdded();

}
