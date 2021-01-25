package com.client.core.base.tools.test;

import com.bullhornsdk.data.api.BullhornData;
import com.client.core.ApplicationSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestUtil {

	@Autowired
	private TestEntities testEntities;

	@Autowired
	private BullhornData bullhornData;

	@Autowired
	@Qualifier("appSettings")
	private ApplicationSettings appSettings;

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
