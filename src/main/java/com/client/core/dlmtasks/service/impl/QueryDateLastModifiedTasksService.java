package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.client.core.base.util.Utility;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.model.helper.DateLastModifiedEventTaskHelper;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public abstract class QueryDateLastModifiedTasksService<T extends QueryEntity> extends AbstractDateLastModifiedTasksService<T> {

    public QueryDateLastModifiedTasksService(List<DateLastModifiedEventTask<T>> dateLastModifiedEventTasks, Class<T> type) {
        super(dateLastModifiedEventTasks, type);
    }

    @Override
    protected String getClause(DateLastModifiedEventTaskHelper<T> helper, DateTime start) {
        StringBuilder where = new StringBuilder();

        Long intervalMinutesAgo = start.minusMinutes(helper.getIntervalMinutes()).getMillis();

        where.append("dateLastModified >= ").append(intervalMinutesAgo);

        if (helper.getIncludeDateAdded() == DateLastModifiedOption.IncludeDateAdded.YES) {
            where.append(" OR dateAdded >= ").append(intervalMinutesAgo);
        }

        return where.toString();
    }

    @Override
    protected void process(String where, Set<String> fields, Consumer<T> process) {
        Utility.queryAndProcessAll(getType(), where, fields, process);
    }

}
