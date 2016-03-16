package com.client.core.soap.tools.id.standard;

import com.bullhorn.entity.task.TaskDto;
import com.client.core.soap.tools.id.EntityIdHelper;

public class TaskEntityIdHelper implements EntityIdHelper<TaskDto, Integer> {

    @Override
    public Integer getEntityId(TaskDto entity) {
        return entity.getTaskID();
    }

    private TaskEntityIdHelper() {
        super();
    }

    public static TaskEntityIdHelper instanceOf() {
        return new TaskEntityIdHelper();
    }

}
