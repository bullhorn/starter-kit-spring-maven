package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.client.core.scheduledtasks.model.helper.impl.CandidateReferenceScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateReferenceEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CandidateReferenceEventTask extends AbstractEventTask<CandidateReference, CandidateReferenceScheduledTaskHelper, CandidateReferenceEventTraverser> {

    public CandidateReferenceEventTask(Integer order) {
        super(order);
    }

    public CandidateReferenceEventTask() {
    }

}