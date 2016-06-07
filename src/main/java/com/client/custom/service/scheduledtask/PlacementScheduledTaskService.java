package com.client.custom.service.scheduledtask;

import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;

/**
 * Created by john.sullivan on 7/6/2016.
 */
public interface PlacementScheduledTaskService {

    boolean isPlacementCompleted(PlacementEventTraverser tasks);

    void updateCandidateStatusToActive(PlacementEventTraverser tasks);

}