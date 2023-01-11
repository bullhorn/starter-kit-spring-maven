package com.client;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.mock.MockBullhornData;
import com.client.core.ApplicationSettings;
import com.client.core.base.tools.test.TestEntities;
import com.client.core.base.tools.test.TestUtil;

// TODO: Update 'MockitoExtension.class' to 'SpringExtension.class' once Spring Boot is added
@ExtendWith(MockitoExtension.class)
@ContextConfiguration(locations = { "/applicationContext.xml", "classpath*:/*-workflow.xml", "classpath*:/*-config.xml",
		"classpath*:/*-scheduledtasks.xml", "classpath*:/*-applicationContext.xml", "/*-test.xml" })
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

	private final static Log log = LogFactory.getLog(BaseTest.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	public TestEntities testEntities;

	@Autowired
	public TestUtil testUtil;

	@Autowired
	@Qualifier("appSettings")
	public ApplicationSettings appSettings;

	@Autowired
	public BullhornData bullhornData;

	@BeforeEach
	public void refreshTestData() {
		try {
			MockBullhornData mockBullhornData = (MockBullhornData) this.bullhornData;
			mockBullhornData.refreshTestData();
		} catch (ClassCastException e) {
			log.error("This test is not running with the MockBullhornData. Please review what Spring profile the test is running in.");
		}
	}

	@Test
	public void testApplicationContextSetup() {
		Assertions.assertNotNull(applicationContext);
	}

	/**
	 * Returns the container of bullhorn test entities
	 *
	 * @return
	 */
	public TestEntities getTestEntities() {
		return testEntities;
	}

	/**
	 * Pass in a list of scripts to execute. This will only run if the app is run with maven profile "testing", since these scripts can
	 * truncate tables etc.
	 *
	 * The format for the path is: classpath:testdata/test-data-exampletable.sql
	 *
	 * @param scriptPaths
	 *            The format for the path is: classpath:testdata/test-data-exampletable.sql
	 */
	public void runScripts(List<String> scriptPaths) {
		if ("testing".equals(appSettings.getProfileName())) {
			if (this.jdbcTemplate != null) {
				for (String script : scriptPaths) {
					this.executeSqlScript(script, false);
				}
			}

		} else {
			log.info("Trying to run test scripts with a non-testing maven profile. THIS SHOULD NOT BE DONE! The scripts can contain table truncate etc. things we don't want to happen with prod or staging tables.");
		}
	}

}
