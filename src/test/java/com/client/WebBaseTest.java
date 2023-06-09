package com.client;

import java.util.List;

import com.client.config.GeneralConfig;
import com.client.config.TestConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.mock.MockBullhornData;
import com.client.core.base.tools.test.TestEntities;
import com.client.matchers.JsonpPathResultMatchers;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {GeneralConfig.class, TestConfig.class})
@ConfigurationPropertiesScan
@WebAppConfiguration
@SpringBootTest
public class WebBaseTest extends AbstractTransactionalJUnit4SpringContextTests {

	private final static Log log = LogFactory.getLog(WebBaseTest.class);

	@Autowired
	private WebApplicationContext wac;

	@Autowired
	private TestEntities testEntities;

	@Autowired
	private ApplicationSettings applicationSettings;

	@Autowired
	public BullhornData bullhornData;

	private MockMvc mockMvc;

	@BeforeEach
	public void refreshTestData() {
		try {
			MockBullhornData mockBullhornData = (MockBullhornData) this.bullhornData;
			mockBullhornData.refreshTestData();
		} catch (ClassCastException e) {
			log.error("This test is not running with the MockBullhornData. Please review what Spring profile the test is running in.");
		}
	}

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testWebApplicationContextSetup() {
		Assertions.assertNotNull(wac,"webapplicationcontext is null");
		Assertions.assertNotNull(mockMvc,"mockMvc is null");
	}

	public WebApplicationContext getWac() {
		return wac;
	}

	public MockMvc getMockMvc() {
		return mockMvc;
	}

	public MockHttpServletRequestBuilder constructDataTablesParams(MockHttpServletRequestBuilder builder) {
		builder.param("sEcho", "1").param("sSearch", "").param("sSearch_0", "").param("sSearch_1", "").param("sSearch_2", "")
				.param("sSearch_3", "").param("sColumns", "1").param("iDisplayStart", "0").param("iDisplayLength", "1")
				.param("iColumns", "1").param("iSortingCols", "1").param("iSortCol_0", "1").param("sSortDir_0", "1").param("sEcho", "1");

		return builder;
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
		if ("testing".equals(applicationSettings.profileName())) {
			for (String script : scriptPaths) {
				this.executeSqlScript(script, false);
			}

		} else {
			log.info("Trying to run test scripts with a non-testing maven profile. THIS SHOULD NOT BE DONE! The scripts can contain table truncate etc. things we don't want to happen with prod or staging tables.");
		}
	}

	/**
	 * Use this method instead of MockMvcResultMatchers.jsonPath when evaluating jsonp (json with padding). This method will remove the
	 * callback() from the response and only leave the json for evaluation using the standard jsonPath handling.
	 *
	 * @param expression
	 * @param args
	 * @return
	 */
	public static JsonpPathResultMatchers jsonpPath(String expression, Object... args) {
		return new JsonpPathResultMatchers(expression, args);
	}
}
