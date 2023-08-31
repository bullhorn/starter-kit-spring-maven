package com.client;

import com.client.core.security.tools.RC4;
import com.google.common.collect.ImmutableSet;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

/**
 * Filter used to authentication all calls to the web application.
 *
 * Current implementation is only to allow calls that either
 * <ol>
 *     <li>Have an 'apiKey' parameter on them equal to the apiKey in the application settings file (i.e. the one injected into {@link ApplicationSettings}</li>
 *     <li>Have an encrypted 'apiKey' in the session.  This essentially means that some previous request had an 'apiKey' url parameter and passed the filter.</li>
 * </ol>
 */
@Log4j2
@Component
public class SessionFilter extends OncePerRequestFilter {
	private final String sessionStoredApiKeyName;
	private final String encryptionKey;
    private final String apiKey;
	private static final Set<String> EXCLUDED_URL_PATHS = ImmutableSet.of("/crossdomain.xml");

	public SessionFilter(ApplicationSettings appSettings) {
		super();
		this.sessionStoredApiKeyName = RandomStringUtils.randomAlphanumeric(32);
		this.encryptionKey = RandomStringUtils.randomAlphanumeric(16);
        this.apiKey = appSettings.apiKey();
	}

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		if (EXCLUDED_URL_PATHS.contains(request.getServletPath())) {
			filterChain.doFilter(request, response);
			return;
		}

		final HttpSession session = getSession(request);
		final String apiKey = getApiKeyFromRequest(request);
		final String previouslyAuthorizedApiKeyEncrypted = getApiKeyFromSession(session);
		final String url = request.getRequestURL().toString();

		boolean allowIn = false;

		if (validApiKeyInSession(previouslyAuthorizedApiKeyEncrypted)) {
			allowIn = true;
		}

		if (validApiKey(apiKey)) {
			allowIn = true;

			encryptApiKeyAndAddToSession(session, apiKey);
		}

		if (!allowIn) {
			log.info("Attempt to get to page: " + url + " was blocked in the SessionFilter. Returning 401 unauthorized response.");

			response.sendError(HttpStatus.UNAUTHORIZED.value());
		} else {
            filterChain.doFilter(request, response);
		}
	}

	private void encryptApiKeyAndAddToSession(HttpSession session, String apiKey) {
		String encryptedApiKey = encryptApiKey(apiKey);

		session.setAttribute(sessionStoredApiKeyName, encryptedApiKey);
	}

	public String encryptApiKey(String apiKey) {
		return RC4.encryptAndEncode(apiKey, encryptionKey);
	}

	private boolean validApiKeyInSession(String previouslyAuthorizedApiKeyEncrypted) {
		if (StringUtils.isBlank(previouslyAuthorizedApiKeyEncrypted)) {
			return false;
		}

		String decryptedApiKey = decryptApiKey(previouslyAuthorizedApiKeyEncrypted);

		return validApiKey(decryptedApiKey);
	}

    private String decryptApiKey(String previouslyAuthorizedApiKeyEncrypted) {
        return RC4.decodeAndDecrypt(previouslyAuthorizedApiKeyEncrypted, encryptionKey);
    }

	private HttpSession getSession(HttpServletRequest request) {
		return request.getSession();
	}

    private String getApiKeyFromSession(HttpSession session) {
        return (String) session.getAttribute(sessionStoredApiKeyName);
    }

	private String getApiKeyFromRequest(HttpServletRequest request) {
		String apiKey = request.getParameter("apiKey");

		if (apiKey == null) {
			apiKey = "";
		}

		String[] tmp = apiKey.split("\\?");

		if (tmp.length > 1) {
			apiKey = tmp[0];
		}

		return apiKey;
	}

	private boolean validApiKey(String apiKey) {
		if (apiKey == null) {
			apiKey = "";
		}

		return apiKey.equals(this.apiKey);
	}

    public String getSessionStoredApiKeyName() {
        return sessionStoredApiKeyName;
    }

}
