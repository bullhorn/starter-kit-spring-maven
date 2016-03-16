package com.client.core.scheduledtasks.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.client.BaseTest;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.CandidateScheduledTaskHelper;

public class TestAbstractScheduledTaskHelper extends BaseTest {

	
	private CandidateScheduledTaskHelper helper;
	
	
	@Test
	public void testFieldWasUpdated() {
		SubscriptionEvent event = createEvent(new String[]{"one","two","three"});
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
		SubscriptionEvent event = createEvent(null);
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
		SubscriptionEvent event = createEvent(new String[]{"one","two","three"});
		this.helper = new CandidateScheduledTaskHelper(event);
		
		assertTrue(helper.getEvent().equals(event));
	}

	
	private SubscriptionEvent createEvent(String[] updatedProperties) {
		SubscriptionEvent event = new SubscriptionEvent();
		event.setEntityID(1);
		event.setEntityType("CANDIDATE");
		event.setEventID("123");
		event.setError(false);
		event.setUpdatedProperties(updatedProperties);
		event.setUpdatingUserID(1);
		return event;
	}
	
}
