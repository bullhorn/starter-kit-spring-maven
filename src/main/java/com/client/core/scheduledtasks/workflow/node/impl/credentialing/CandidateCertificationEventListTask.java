package com.client.core.scheduledtasks.workflow.node.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.client.core.base.model.relatedentity.credentialing.CandidateCertificationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.CandidateCertificationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.node.impl.AbstractEventListTask;
import com.client.core.scheduledtasks.workflow.traversing.impl.credentialing.CandidateCertificationEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateCertificationEventListTask extends AbstractEventListTask<CandidateCertification, CandidateCertificationScheduledTaskHelper, CandidateCertificationEventListTraverser> {

    public CandidateCertificationEventListTask(Integer order, Map<CandidateCertificationRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateCertificationEventListTask(Map<CandidateCertificationRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
