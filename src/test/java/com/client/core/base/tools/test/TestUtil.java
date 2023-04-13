package com.client.core.base.tools.test;

import com.bullhornsdk.data.api.BullhornData;
import com.client.ApplicationSettings;
import org.springframework.beans.factory.annotation.Autowired;

public class TestUtil {

	@Autowired
	private TestEntities testEntities;

	@Autowired
	private BullhornData bullhornData;

	@Autowired
	private ApplicationSettings applicationSettings;

	public TestUtil() {
		super();
	}

	public TestEntities getTestEntities() {
		return testEntities;
	}

	public void setTestEntities(TestEntities testEntities) {
		this.testEntities = testEntities;
	}

}
