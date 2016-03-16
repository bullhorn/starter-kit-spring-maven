package com.client.core.formtrigger.model.helper.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;

public class TestPlacementFormTriggerHelper extends TestFormTriggerHelper<PlacementFormTriggerHelper, FormPlacementDto, Placement> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getPlacementValidationTraverser("Approved").getFormTriggerHelper();
	}

	@Test
	public void testGetJob() {
		assertNotNull(helper.getJob().getId());
	}

	@Test
	public void testGetCommissions() {
		assertFalse(helper.getCommissions().isEmpty());
	}

	@Test
	public void testGetJobOwner() {
		assertNotNull(helper.getJobOwner().getId());
	}

	@Test
	public void testGetCandidate() {
		assertNotNull(helper.getCandidate().getId());
	}

	@Test
	public void testGetClientCorpration() {
		assertNotNull(helper.getClientCorpration().getId());
	}

}
