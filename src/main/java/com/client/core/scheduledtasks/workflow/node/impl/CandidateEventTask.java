package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.scheduledtasks.model.helper.impl.CandidateScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CandidateEventTask extends AbstractEventTask<Candidate, CandidateScheduledTaskHelper, CandidateEventTraverser> {

    public CandidateEventTask(Integer order) {
        super(order);
    }

    public CandidateEventTask() {
    }

}