package com.client.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApplicationSettings {

	@Test
	public void test() {
		ApplicationSettings appSettings = new ApplicationSettings();
		Assertions.assertNotNull(appSettings.toString());

	}

}
