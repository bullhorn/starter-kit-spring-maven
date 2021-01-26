package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;
import com.client.core.formtrigger.model.helper.impl.JobSubmissionFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class JobSubmissionFormTriggerTraverser extends AbstractTriggerTraverser<JobSubmission, JobSubmissionFormTriggerHelper> {

	public JobSubmissionFormTriggerTraverser(FormJobSubmissionDto formJobSubmissionDto, Integer updatingUserID, boolean edit,
											 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new JobSubmissionFormTriggerHelper(formJobSubmissionDto, updatingUserID, relatedEntityFields), edit);

	}

}
