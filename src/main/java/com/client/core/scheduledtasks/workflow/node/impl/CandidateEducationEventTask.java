package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.client.core.scheduledtasks.model.helper.impl.CandidateEducationScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEducationEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CandidateEducationEventTask extends AbstractEventTask<CandidateEducation, CandidateEducationScheduledTaskHelper, CandidateEducationEventTraverser> {

    public CandidateEducationEventTask(Integer order) {
        super(order);
    }

    public CandidateEducationEventTask() {
    }

}