package com.client.core.formtrigger.model.helper.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;

public class TestPlacementChangeRequestFormTriggerHelper extends
		TestFormTriggerHelper<PlacementChangeRequestFormTriggerHelper, FormPlacementChangeRequestDto, PlacementChangeRequest> {

	@Override
	public void scaffoldThis() {
		this.helper = testUtil.getPlacementChangeRequestFormTriggerTraverser("Approved").getTriggerHelper();
	}

	
	@Test
	public void testGetPlacement() {
		assertNotNull(helper.getPlacement().getId());
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
