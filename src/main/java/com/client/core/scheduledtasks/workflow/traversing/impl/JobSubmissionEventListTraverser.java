package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.JobSubmissionScheduledTaskHelper;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTaskListTraverser;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JobSubmissionEventListTraverser extends AbstractScheduledTaskListTraverser<JobSubmissionScheduledTaskHelper> {

    public JobSubmissionEventListTraverser(List<CustomSubscriptionEvent> events, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(events.parallelStream().map(event -> new JobSubmissionScheduledTaskHelper(event, relatedEntityFields)).collect(Collectors.toList()));
    }

}
