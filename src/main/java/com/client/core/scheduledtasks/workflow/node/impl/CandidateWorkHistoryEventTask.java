package com.client.core.scheduledtasks.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.client.core.scheduledtasks.model.helper.impl.CandidateWorkHistoryScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.impl.CandidateWorkHistoryEventTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class CandidateWorkHistoryEventTask extends AbstractEventTask<CandidateWorkHistory, CandidateWorkHistoryScheduledTaskHelper, CandidateWorkHistoryEventTraverser> {

    public CandidateWorkHistoryEventTask(Integer order) {
        super(order);
    }

    public CandidateWorkHistoryEventTask() {
    }

}