package com.client.core.formtrigger.model.helper.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;

public class TestJobSubmissionFormTriggerHelper extends
		TestFormTriggerHelper<JobSubmissionFormTriggerHelper, FormJobSubmissionDto, JobSubmission> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getJobSubmissionFormTriggerTraverser("Submitted", testEntities.getCandidateId()).getTriggerHelper();
	}

	@Test
	public void testGetJobOwner() {
		assertNotNull(helper.getJobOwner().getId());
	}

	@Test
	public void testGetClientCorpration() {
		assertNotNull(helper.getClientCorpration().getId());
	}

	@Test
	public void testGetJob() {
		assertNotNull(helper.getJob().getId());
	}

	@Test
	public void testGetCandidate() {
		assertNotNull(helper.getCandidate().getId());
	}

}
