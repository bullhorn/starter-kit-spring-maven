package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.CandidateCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.CandidateCertificationRequirementEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateCertificationRequirementEventTask extends AbstractEventTask<CandidateCertificationRequirement, CandidateCertificationRequirementScheduledTaskHelper, CandidateCertificationRequirementEventTraverser> {

    public CandidateCertificationRequirementEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateCertificationRequirementEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
