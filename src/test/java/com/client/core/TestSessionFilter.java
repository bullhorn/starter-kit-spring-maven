package com.client.core;

import java.io.IOException;

import javax.servlet.ServletException;

import com.client.ApplicationSettings;
import com.client.SessionFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.client.BaseTest;

public class TestSessionFilter extends BaseTest {

	@Autowired
	private ApplicationSettings applicationSettings;

	private SessionFilter sessionFilter;

	private MockHttpServletRequest req;
	private MockHttpServletResponse rsp;
	private MockFilterChain mockChain;

	@BeforeEach
	public void setup() throws IOException, ServletException {
		this.sessionFilter = new SessionFilter(applicationSettings);
		this.mockChain = new MockFilterChain();
		this.req = new MockHttpServletRequest();
		this.rsp = new MockHttpServletResponse();

	}

	@Test
	public void testDoFilterBlockCore() throws IOException, ServletException {
		this.req.setServletPath("/main/files/getFiles");
		this.req.setMethod("GET");
		this.sessionFilter.doFilter(req, rsp, mockChain);
		Assertions.assertEquals(rsp.getStatus(), HttpStatus.UNAUTHORIZED.value(),
				"The SessionFilter is not setup correctly. Security is compromised. Please make sure the web.xml has the SessionFilter setup for all relevant urls."
		);
	}

	@Test
	public void testDoFilterAllowInCore() throws IOException, ServletException {
		this.req.setServletPath("/main/files/getFiles");
		this.req.setMethod("GET");
		this.req.setParameter("apiKey", applicationSettings.apiKey());
		this.sessionFilter.doFilter(req, rsp, mockChain);
		Assertions.assertTrue(
				rsp.getStatus() == HttpStatus.OK.value(),
				"Issue with session filter. The apiKey is provided but still not being let in."
		);
	}

	@Test
	public void testDoFilterSessionStoredApiKeyCore() throws IOException, ServletException {
		this.req.setServletPath("/main/files/getFiles");
		this.req.setMethod("GET");
		this.req.getSession().setAttribute(sessionFilter.getSessionStoredApiKeyName(),
				sessionFilter.encryptApiKey(applicationSettings.apiKey()));
		this.sessionFilter.doFilter(req, rsp, mockChain);
		Assertions.assertTrue(
				rsp.getStatus() == HttpStatus.OK.value(),
				"Issue with session filter. The apiKey is provided but still not being let in.");
	}

	@Test
	public void testDestroy() {
		sessionFilter.destroy();

	}

}
