package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.client.core.base.model.relatedentity.CandidateRelatedEntity;
import com.client.core.scheduledtasks.model.helper.impl.CandidateEducationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEducationEventTraverser;

import java.util.Map;
import java.util.Set;

public abstract class CandidateEducationEventTask extends AbstractEventTask<CandidateEducation, CandidateEducationScheduledTaskHelper, CandidateEducationEventTraverser> {

    public CandidateEducationEventTask(Integer order, Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public CandidateEducationEventTask(Map<CandidateRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
