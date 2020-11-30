package com.client.core.dlmtasks.service.impl;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.util.Utility;
import com.client.core.dlmtasks.model.helper.DateLastModifiedEventTaskHelper;
import com.client.core.dlmtasks.model.helper.impl.StandardDateLastModifiedEventTaskHelper;
import com.client.core.dlmtasks.service.DateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public abstract class AbstractDateLastModifiedTasksService<T extends BullhornEntity> implements DateLastModifiedTasksService<T> {

    private final Logger log = Logger.getLogger(getClass());

    private final List<DateLastModifiedEventTaskHelper<T>> helpers;
    private final Class<T> type;

    public AbstractDateLastModifiedTasksService(List<DateLastModifiedEventTask<T>> eventTasks, Class<T> type) {
        this.helpers = eventTasks.parallelStream().map(eventTask -> {
            return new StandardDateLastModifiedEventTaskHelper<T>(eventTask);
        }).collect(Collectors.toList());
        this.type = type;
    }

    @Override
    public Class<T> getType() {
        return type;
    }

    @Override
    public void process(DateTime start) {
        Map<Boolean, List<DateLastModifiedEventTaskHelper<T>>> helpersByShouldProcess = helpers.parallelStream().collect(Collectors.groupingBy(helper -> {
            return helper.shouldProcess(start);
        }));

        if (helpersByShouldProcess.get(Boolean.TRUE).isEmpty()) {
            log.info("Not executing any " + type.getSimpleName() + " DLM Event Tasks as none should process");
        } else {
            process(start, helpersByShouldProcess.get(Boolean.TRUE));
        }
    }

    private void process(DateTime start, List<DateLastModifiedEventTaskHelper<T>> toProcess) {
        Map<String, List<DateLastModifiedEventTaskHelper<T>>> helpersByClause = toProcess.parallelStream().collect(Collectors.groupingBy(helper -> {
            return this.getClause(helper, start);
        }));

        helpersByClause.forEach((clause, helpers) -> {
            Set<String> fields = getAllFields(helpers);

            process(clause, fields, entity -> {
                helpers.parallelStream().forEach(helper -> {
                    helper.process(start, entity);
                });
            });
        });
    }

    protected abstract String getClause(DateLastModifiedEventTaskHelper<T> eventTask, DateTime start);

    protected abstract void process(String where, Set<String> fields, Consumer<T> process);

    private Set<String> getAllFields(List<DateLastModifiedEventTaskHelper<T>> helpers) {
        return Utility.mergeNestedFields(helpers.parallelStream().flatMap(helper -> {
            return helper.getFields().stream();
        }).collect(Collectors.toSet()));
    }

}
