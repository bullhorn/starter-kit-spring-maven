package com.client.core.formtrigger.model.helper.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.client.core.formtrigger.model.form.impl.FormJobOrderDto;

public class TestJobOrderFormTriggerHelper extends TestFormTriggerHelper<JobOrderFormTriggerHelper, FormJobOrderDto, JobOrder> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getJobValidationTraverser().getFormTriggerHelper();
	}


	@Test
	public void testGetJobOwner() {
		assertNotNull(helper.getJobOwner().getId());
	}


	@Test
	public void testGetClientCorpration() {
		assertNotNull(helper.getClientCorpration().getId());
	}

}
