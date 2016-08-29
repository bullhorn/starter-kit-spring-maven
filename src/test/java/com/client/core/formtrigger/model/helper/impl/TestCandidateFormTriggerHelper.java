package com.client.core.formtrigger.model.helper.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;

public class TestCandidateFormTriggerHelper extends TestFormTriggerHelper<CandidateFormTriggerHelper, FormCandidateDto, Candidate> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getCandidateFormTriggerTraverser().getTriggerHelper();
	}

	@Test
	public void testCandidateOwner() {
		assertNotNull(helper.getCandidateOwner().getId());
	}

}
