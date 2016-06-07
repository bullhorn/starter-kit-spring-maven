package com.client.custom.service.scheduledtask.standard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.base.util.Utility;
import com.client.core.scheduledtasks.service.AbstractScheduledTaskService;
import com.client.core.scheduledtasks.workflow.traversing.impl.PlacementEventTraverser;
import com.client.custom.CustomSettings;
import com.client.custom.service.scheduledtask.PlacementScheduledTaskService;

/**
 * Created by john.sullivan on 7/6/2016.
 */
@Service
public class StandardPlacementScheduledTaskService extends AbstractScheduledTaskService implements PlacementScheduledTaskService {

    private final CustomSettings customSettings;

    @Autowired
    public StandardPlacementScheduledTaskService(CustomSettings customSettings) {
        this.customSettings = customSettings;
    }

    @Override
    public boolean isPlacementCompleted(PlacementEventTraverser tasks) {
        String status = tasks.getScheduledTaskHelper().getPlacement().getStatus();

        return Utility.listContains(customSettings.getPlacementStatusesCompleted(), status)
            && tasks.getScheduledTaskHelper().fieldWasUpdated("status");
    }

    @Override
    public void updateCandidateStatusToActive(PlacementEventTraverser tasks) {
        Candidate toUpdate = new Candidate(tasks.getScheduledTaskHelper().getCandidate().getId());

        toUpdate = tasks.getScheduledTaskHelper().getOneEntityToSave(toUpdate);

        toUpdate.setStatus(customSettings.getCandidateStatusActive());
    }
}
