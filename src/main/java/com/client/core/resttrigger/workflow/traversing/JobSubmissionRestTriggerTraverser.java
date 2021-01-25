package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.JobSubmissionRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class JobSubmissionRestTriggerTraverser extends AbstractTriggerTraverser<JobSubmission, JobSubmissionRestTriggerHelper> {

	public JobSubmissionRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
											 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new JobSubmissionRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
