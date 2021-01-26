package com.client.core.scheduledtasks.workflow.traversing.impl.credentialing;

import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.JobSubmissionCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

import java.util.Map;
import java.util.Set;

public class JobSubmissionCertificationRequirementEventTraverser extends AbstractScheduledTasksTraverser<JobSubmissionCertificationRequirementScheduledTaskHelper> {

    public JobSubmissionCertificationRequirementEventTraverser(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(new JobSubmissionCertificationRequirementScheduledTaskHelper(event, relatedEntityFields), EventType.getType(event.getEntityEventType()));
    }

}
