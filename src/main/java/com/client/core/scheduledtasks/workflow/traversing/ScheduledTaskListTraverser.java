package com.client.core.scheduledtasks.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.client.core.base.workflow.traversing.Traverser;
import com.client.core.scheduledtasks.model.helper.ScheduledTaskHelper;

import java.util.List;
import java.util.Map;

public interface ScheduledTaskListTraverser<T extends ScheduledTaskHelper> extends Traverser {

    List<T> getScheduledTaskHelpers();

    <T extends BullhornEntity> Map<String, T> getAllEntitiesToSave();

    /**
     * Returns a deep copy of the passed in entity, if a entity of type T already exists in allEntitiesToSaveBackToBH that entity will be
     * returned, otherwise this method will return a deep copy the entity passed in to the method.
     * <p>
     * If the entity did not exist in the allDtosToSaveBackToBH map the returned copy will be added to the map.
     *
     * @param entity entity to be copied, if this object already exists in the allDtosToSaveBackToBH map then that entity will be returned.
     * @return A deep copy of the passed in T entity.
     */
    <T extends UpdateEntity> T getOneEntityToSave(T entity);
}
