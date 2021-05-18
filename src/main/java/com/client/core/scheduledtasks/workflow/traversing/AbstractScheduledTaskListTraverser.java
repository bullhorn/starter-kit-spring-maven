package com.client.core.scheduledtasks.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.client.core.base.tools.copy.KryoObjectCopyHelper;
import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

public class AbstractScheduledTaskListTraverser<T extends ScheduledTaskHelper> implements ScheduledTaskListTraverser<T> {

    private final List<T> scheduledTaskHelpers;
    private final Map<String, UpdateEntity> allEntitiesToSaveBackToBH;

    public AbstractScheduledTaskListTraverser(List<T> scheduledTaskHelpers) {
        super();
        this.scheduledTaskHelpers = scheduledTaskHelpers;
        this.allEntitiesToSaveBackToBH = Maps.newHashMap();
    }

    @Override
    public List<T> getScheduledTaskHelpers() {
        return scheduledTaskHelpers;
    }

    @Override
    public Map<String, ? extends UpdateEntity> getAllEntitiesToSave() {
        return allEntitiesToSaveBackToBH;
    }

    @Override
    public <T extends UpdateEntity> T getOneEntityToSave(T entity) {
        @SuppressWarnings("unchecked")
        T entityToSave = (T) allEntitiesToSaveBackToBH.get(entity.getClass().getSimpleName() + entity.getId());

        if (entityToSave == null) {
            entityToSave = KryoObjectCopyHelper.copy(entity);

            allEntitiesToSaveBackToBH.put(entity.getClass().getSimpleName() + entity.getId(), entityToSave);
        }

        return entityToSave;
    }

    @Override
    public String toString() {
        String NEW_LINE = System.getProperty("line.separator");
        return new StringBuilder().append(this.getClass().getName() + " Object {" + NEW_LINE)
                .append(" scheduledTaskHelpers: " + scheduledTaskHelpers + NEW_LINE)
                .append("}").toString();
    }
}
