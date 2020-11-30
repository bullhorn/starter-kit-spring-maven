package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.client.core.base.util.Utility;
import com.client.core.dlmtasks.model.DateLastModifiedOption;
import com.client.core.dlmtasks.model.helper.DateLastModifiedEventTaskHelper;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public abstract class SearchDateLastModifiedTasksService<T extends SearchEntity>  extends AbstractDateLastModifiedTasksService<T> {

    public SearchDateLastModifiedTasksService(List<DateLastModifiedEventTask<T>> dateLastModifiedEventTasks, Class<T> type) {
        super(dateLastModifiedEventTasks, type);
    }

    @Override
    protected String getClause(DateLastModifiedEventTaskHelper<T> helper, DateTime start) {
        StringBuilder query = new StringBuilder();

        DateTime intervalMinutesAgo = start.minusMinutes(helper.getIntervalMinutes());

        query.append("dateLastModified:[").append(Utility.formatDateForSearch(intervalMinutesAgo))
                .append(" TO *]");

        if (helper.getIncludeDateAdded() == DateLastModifiedOption.IncludeDateAdded.YES) {
            query.append(" OR dateAdded:[").append(Utility.formatDateForSearch(intervalMinutesAgo))
                    .append(" TO *]");
        }

        return query.toString();
    }

    @Override
    protected void process(String where, Set<String> fields, Consumer<T> process) {
        Utility.searchAndProcessAll(getType(), where, fields, process);
    }
}
