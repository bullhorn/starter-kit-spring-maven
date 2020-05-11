package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.PlacementCertification;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.PlacementCertificationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.PlacementCertificationEventTraverser;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */
public abstract class PlacementCertificationEventTask extends AbstractEventTask<PlacementCertification, PlacementCertificationScheduledTaskHelper, PlacementCertificationEventTraverser> {

    public PlacementCertificationEventTask(Integer order) {
        super(order);
    }

    public PlacementCertificationEventTask() {
    }

}
