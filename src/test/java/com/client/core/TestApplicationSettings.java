package com.client.core;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestApplicationSettings {

	@Test
	public void test() {
		ApplicationSettings appSettings = new ApplicationSettings();
		assertNotNull(appSettings.toString());

	}

}
