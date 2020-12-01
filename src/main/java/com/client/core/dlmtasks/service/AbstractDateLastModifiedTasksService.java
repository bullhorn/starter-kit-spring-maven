package com.client.core.dlmtasks.service;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.util.Utility;
import com.client.core.dlmtasks.model.helper.DateLastModifiedEventTaskHelper;
import com.client.core.dlmtasks.model.helper.impl.StandardDateLastModifiedEventTaskHelper;
import com.client.core.dlmtasks.service.DateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public abstract class AbstractDateLastModifiedTasksService<T extends BullhornEntity> implements DateLastModifiedTasksService<T> {

    private static final Set<String> ID = Sets.newHashSet("id");

    private final Logger log = Logger.getLogger(getClass());

    private final List<DateLastModifiedEventTaskHelper<T>> helpers;
    private final Class<T> type;

    public AbstractDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<T>>> eventTasks, Class<T> type) {
        this.helpers = eventTasks.orElseGet(Lists::newArrayList).parallelStream().map(eventTask -> {
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

        List<DateLastModifiedEventTaskHelper<T>> toProcess = helpersByShouldProcess.getOrDefault(Boolean.TRUE, Lists.newArrayList());

        if (toProcess.isEmpty()) {
            log.debug("Not executing any " + type.getSimpleName() + " DLM Event Tasks as none should process");
        } else {
            log.info("Processing " + toProcess.size() + " " + type.getSimpleName() + " DLM tasks ");

            process(start, toProcess);
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
                    helper.process(entity);
                });
            });

            helpers.parallelStream().forEach(helper -> {
                helper.updateLastRun(start);
            });
        });
    }

    protected abstract String getClause(DateLastModifiedEventTaskHelper<T> eventTask, DateTime start);

    protected abstract void process(String where, Set<String> fields, Consumer<T> process);

    private Set<String> getAllFields(List<DateLastModifiedEventTaskHelper<T>> helpers) {
        return Sets.union(ID, Utility.mergeNestedFields(helpers.parallelStream().flatMap(helper -> {
            return helper.getFields().stream();
        }).collect(Collectors.toSet())));
    }

}
