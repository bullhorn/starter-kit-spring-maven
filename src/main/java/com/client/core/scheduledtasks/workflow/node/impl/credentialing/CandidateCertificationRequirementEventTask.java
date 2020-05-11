package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.CandidateCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.CandidateCertificationRequirementEventTraverser;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */
public abstract class CandidateCertificationRequirementEventTask extends AbstractEventTask<CandidateCertificationRequirement, CandidateCertificationRequirementScheduledTaskHelper, CandidateCertificationRequirementEventTraverser> {

    public CandidateCertificationRequirementEventTask(Integer order) {
        super(order);
    }

    public CandidateCertificationRequirementEventTask() {
    }

}
