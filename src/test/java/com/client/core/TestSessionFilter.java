package com.client.core;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.client.BaseTest;
import com.client.core.security.SessionFilter;

public class TestSessionFilter extends BaseTest {

	@Autowired
	@Qualifier("appSettings")
	private ApplicationSettings applicationSettings;

	private SessionFilter sessionFilter;

	private MockHttpServletRequest req;
	private MockHttpServletResponse rsp;
	private MockFilterChain mockChain;

	@Before
	public void setup() throws IOException, ServletException {
		this.sessionFilter = new SessionFilter();
		this.mockChain = new MockFilterChain();
		this.req = new MockHttpServletRequest();
		this.rsp = new MockHttpServletResponse();

	}

	@Test
	public void testDoFilterBlockCore() throws IOException, ServletException {
		this.req.setServletPath("/main/files/getFiles");
		this.req.setMethod("GET");
		this.sessionFilter.doFilter(req, rsp, mockChain);
		assertTrue(
				"The SessionFilter is not setup correctly. Security is compromised. Please make sure the web.xml has the SessionFilter setup for all relevant urls.",
				rsp.getStatus() == HttpStatus.UNAUTHORIZED.value());
	}

	@Test
	public void testDoFilterAllowInCore() throws IOException, ServletException {
		this.req.setServletPath("/main/files/getFiles");
		this.req.setMethod("GET");
		this.req.setParameter("apiKey", applicationSettings.getApiKey());
		this.sessionFilter.doFilter(req, rsp, mockChain);
		assertTrue("Issue with session filter. The apiKey is provided but still not being let in.",
				rsp.getStatus() == HttpStatus.OK.value());
	}

	@Test
	public void testDoFilterSessionStoredApiKeyCore() throws IOException, ServletException {
		this.req.setServletPath("/main/files/getFiles");
		this.req.setMethod("GET");
		this.req.getSession().setAttribute(sessionFilter.getSessionStoredApiKeyName(),
				sessionFilter.encryptApiKey(applicationSettings.getApiKey()));
		this.sessionFilter.doFilter(req, rsp, mockChain);
		assertTrue("Issue with session filter. The apiKey is provided but still not being let in.",
				rsp.getStatus() == HttpStatus.OK.value());
	}

	@Test
	public void testDestroy() {
		sessionFilter.destroy();

	}

}
