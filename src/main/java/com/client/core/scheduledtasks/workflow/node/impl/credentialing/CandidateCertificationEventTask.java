package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.CandidateCertificationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.CandidateCertificationEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateCertificationEventTask extends AbstractEventTask<CandidateCertification, CandidateCertificationScheduledTaskHelper, CandidateCertificationEventTraverser> {

    public CandidateCertificationEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateCertificationEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
