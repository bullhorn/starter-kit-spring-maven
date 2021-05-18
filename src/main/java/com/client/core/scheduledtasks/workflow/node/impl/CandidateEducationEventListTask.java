package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.client.core.base.model.relatedentity.CandidateEducationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CandidateEducationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEducationEventListTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateEducationEventListTask extends AbstractEventListTask<CandidateEducation, CandidateEducationScheduledTaskHelper, CandidateEducationEventListTraverser> {

    public CandidateEducationEventListTask(Integer order, Map<CandidateEducationRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateEducationEventListTask(Map<CandidateEducationRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
