package com.client.core.formtrigger.model.helper.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.client.BaseTest;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.AbstractFormDto;
import com.google.common.collect.Sets;

public abstract class TestFormTriggerHelper<T extends AbstractFormTriggerHelper<F, R>, F extends AbstractFormDto<R>, R extends BullhornEntity>
		extends BaseTest {

	public T helper;

	@Before
	public void runTheSetup() {
		this.scaffoldThis();
	}

	public abstract void scaffoldThis();

	@Test
	public void testGetFormValues() {
		assertNotNull(helper.getFormValues());
	}

	@Test
	public void testGetNewEntity() {
		assertNotNull(helper.getNewEntity());
	}

	@Test
	public void testSetNewEntity() throws InstantiationException, IllegalAccessException {

		R entity = (R) helper.getNewEntity().getClass().newInstance();
		Integer newId = 87;
		entity.setId(newId);
		helper.setNewEntity(entity);
		assertTrue(helper.getNewEntity().getId().equals(newId));
	}

	@Test
	public void testGetOldEntity() {
		assertNotNull(helper.getOldEntity());
	}

	@Test
	public void testSetOldEntity() throws InstantiationException, IllegalAccessException {
		R entity = (R) helper.getOldEntity().getClass().newInstance();
		Integer newId = 87;
		entity.setId(newId);
		helper.setOldEntity(entity);
		assertTrue(helper.getOldEntity().getId().equals(newId));
	}

	@Test
	public void testGetUpdatingUserID() {
		assertNotNull(helper.getUpdatingUserID());
	}

	@Test
	public void testGetUpdatingUser() {
		assertNotNull(helper.getUpdatingUser());
	}

	@Test
	public void testSetUpdatingUser() {
		CorporateUser user = new CorporateUser();
		user.setId(123);
		helper.setUpdatingUser(user);
		assertTrue(helper.getUpdatingUser().getId().equals(user.getId()));
	}

	@Test
	public void testGetUpdatingUserUserType() {
		assertNotNull(helper.getUpdatingUserUserType());
	}

	@Test
	public void testSetUpdatingUserUserType() {

		UserType type = new UserType();
		type.setId(1234567);
		helper.setUpdatingUserUserType(type);
		assertTrue(helper.getUpdatingUserUserType().getId().equals(type.getId()));
	}

	@Test
	public void testSaveDto() {
		helper.saveDto(new Candidate(testEntities.getCandidateId()));
	}

	@Test
	public void testFindUserType() {
		assertNotNull(helper.getUpdatingUser());
	}

	@Test
	public void testFindCorporateUser() {
		assertNotNull(helper.findCorporateUser(testEntities.getCorporateUserId()));
	}

	@Test
	public void testFindEntityClassOfREInteger() {
		assertNotNull(helper.findEntity(Candidate.class, testEntities.getCandidateId()));
	}

	@Test
	public void testFindEntityClassOfREIntegerSetOfString() {
		assertNotNull(helper.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "name")));
	}

	@Test
	public void testFindCandidate() {
		assertNotNull(helper.findCandidate(testEntities.getCandidateId()).getId());
	}

	@Test
	public void testFindClientCorporation() {
		assertNotNull(helper.findClientCorporation(testEntities.getClientCorporationId()).getId());
	}

	@Test
	public void testFindClientContact() {
		assertNotNull(helper.findClientContact(testEntities.getClientContactId()).getId());
	}

	@Test
	public void testFindPlacement() {
		assertNotNull(helper.findPlacement(testEntities.getPlacementId()).getId());
	}

	@Test
	public void testFindJobSubmission() {
		assertNotNull(helper.findJobSubmission(testEntities.getJobSubmissionId()).getId());
	}

	@Test
	public void testFindJobOrder() {
		assertNotNull(helper.findJobOrder(testEntities.getJobOrderId()).getId());
	}

	@Test
	public void testFindNote() {
		assertNotNull(helper.findNote(testEntities.getNoteId()).getId());
	}

	@Test
	public void testFindPlacementChangeRequest() {
		assertNotNull(helper.findPlacementChangeRequest(testEntities.getPlacementChangeRequestId()).getId());
	}

	@Test
	public void testGetCommissions() {
		assertFalse(helper.getCommissions(testEntities.getPlacementId()).isEmpty());
	}

	@Test
	public void testGetBullhornData() {
		assertNotNull(helper.getBullhornData());
	}

}
