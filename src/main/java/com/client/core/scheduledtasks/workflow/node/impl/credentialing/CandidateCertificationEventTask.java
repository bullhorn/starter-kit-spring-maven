package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.CandidateCertificationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.CandidateCertificationEventTraverser;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */
public abstract class CandidateCertificationEventTask extends AbstractEventTask<CandidateCertification, CandidateCertificationScheduledTaskHelper, CandidateCertificationEventTraverser> {

    public CandidateCertificationEventTask(Integer order) {
        super(order);
    }

    public CandidateCertificationEventTask() {
    }

}
