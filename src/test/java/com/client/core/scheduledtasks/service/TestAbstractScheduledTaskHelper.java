package com.client.core.scheduledtasks.service;

import static org.junit.Assert.*;

import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import com.client.BaseTest;
import com.client.core.scheduledtasks.model.helper.impl.CandidateScheduledTaskHelper;

public class TestAbstractScheduledTaskHelper extends BaseTest {

	
	private CandidateScheduledTaskHelper helper;
	
	
	@Test
	public void testFieldWasUpdated() {
		CustomSubscriptionEvent event = createEvent(new String[]{"one","two","three"});
		this.helper = new CandidateScheduledTaskHelper(event);
		
		assertTrue(helper.fieldWasUpdated("one"));
		assertTrue(helper.fieldWasUpdated("two"));
		assertTrue(helper.fieldWasUpdated("three"));
		assertFalse(helper.fieldWasUpdated("four"));
		assertFalse(helper.fieldWasUpdated(""));
		assertFalse(helper.fieldWasUpdated(null));
	}
	
	@Test
	public void testFieldWasUpdatedNull1() {
		CustomSubscriptionEvent event = createEvent(null);
		this.helper = new CandidateScheduledTaskHelper(event);
		
		assertFalse(helper.fieldWasUpdated("one"));
		assertFalse(helper.fieldWasUpdated("two"));
		assertFalse(helper.fieldWasUpdated("three"));
		assertFalse(helper.fieldWasUpdated("four"));
		assertFalse(helper.fieldWasUpdated(""));
		assertFalse(helper.fieldWasUpdated(null));
		
	}
	

	@Test
	public void testGetEvent() {
		CustomSubscriptionEvent event = createEvent(new String[]{"one","two","three"});
		this.helper = new CandidateScheduledTaskHelper(event);
		
		assertTrue(helper.getEvent().equals(event));
	}

	
	private CustomSubscriptionEvent createEvent(String[] updatedProperties) {
		CustomSubscriptionEvent event = new CustomSubscriptionEvent();
		event.setEntityId(1);
		event.setEntityEventType("CANDIDATE");
		event.setEventId("123");
		event.setError(false);
		event.setUpdatedProperties(Sets.newHashSet(updatedProperties));
		event.setUpdatingUserId(1);
		return event;
	}
	
}
