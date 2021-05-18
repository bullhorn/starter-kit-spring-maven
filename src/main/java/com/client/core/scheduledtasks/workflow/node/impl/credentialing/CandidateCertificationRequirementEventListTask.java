package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.client.core.base.model.relatedentity.credentialing.CandidateCertificationRequirementRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.CandidateCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventListTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.CandidateCertificationRequirementEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateCertificationRequirementEventListTask extends AbstractEventListTask<CandidateCertificationRequirement, CandidateCertificationRequirementScheduledTaskHelper, CandidateCertificationRequirementEventListTraverser> {

    public CandidateCertificationRequirementEventListTask(Integer order, Map<CandidateCertificationRequirementRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateCertificationRequirementEventListTask(Map<CandidateCertificationRequirementRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
