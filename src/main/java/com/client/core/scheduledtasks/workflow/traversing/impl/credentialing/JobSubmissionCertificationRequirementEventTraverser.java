package com.client.core.scheduledtasks.workflow.traversing.impl.credentialing;

import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.credentialing.JobSubmissionCertificationRequirementScheduledTaskHelper;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 *
 * @author m.kesmetzis on 06/05/2020.
 */

public class JobSubmissionCertificationRequirementEventTraverser extends AbstractScheduledTasksTraverser<JobSubmissionCertificationRequirementScheduledTaskHelper> {

    public JobSubmissionCertificationRequirementEventTraverser(CustomSubscriptionEvent event) {
        super(new JobSubmissionCertificationRequirementScheduledTaskHelper(event), EventType.getType(event.getEntityEventType()));
    }

}
