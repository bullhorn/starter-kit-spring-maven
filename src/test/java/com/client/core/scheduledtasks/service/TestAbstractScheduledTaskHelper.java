package com.client.core.scheduledtasks.service;

import static org.junit.Assert.*;

import com.client.core.scheduledtasks.model.helper.StandardEvent;
import com.google.common.collect.Lists;
import org.junit.Test;

import com.client.BaseTest;
import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.scheduledtasks.model.helper.impl.CandidateScheduledTaskHelper;

public class TestAbstractScheduledTaskHelper extends BaseTest {

	
	private CandidateScheduledTaskHelper helper;
	
	
	@Test
	public void testFieldWasUpdated() {
		StandardEvent event = createEvent(new String[]{"one","two","three"});
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
		StandardEvent event = createEvent(null);
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
		StandardEvent event = createEvent(new String[]{"one","two","three"});
		this.helper = new CandidateScheduledTaskHelper(event);
		
		assertTrue(helper.getEvent().equals(event));
	}

	
	private StandardEvent createEvent(String[] updatedProperties) {
		StandardEvent event = new StandardEvent();
		event.setEntityId(1);
		event.setEntityEventType("CANDIDATE");
		event.setEventId("123");
		event.setError(false);
		event.setUpdatedProperties(Lists.newArrayList(updatedProperties));
		event.setUpdatingUserId(1);
		return event;
	}
	
}
