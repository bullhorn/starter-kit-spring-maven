package com.client.core.base.util.oauth;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import net.oauth.OAuth;
import net.oauth.OAuthAccessor;
import net.oauth.OAuthConsumer;
import net.oauth.OAuthException;
import net.oauth.OAuthMessage;

import com.bullhorn.apiservice.oauth.PartnerSessionRequest;

public class OAuthUtility {

	public static final String USER_ID = "userId";
	public static final String CORPORATION_ID = "corporationId";
	private static final String SCOPE = "http://api.bullhornstaffing.com";

	public static PartnerSessionRequest generatePartnerSessionRequest(String consumerKey, String consumerSecret, Integer userId, Integer corporationId) throws Exception {
		PartnerSessionRequest request = new PartnerSessionRequest();
		
		request.setOauthConsumerKey(consumerKey);
		request.setUserId(userId);
		request.setCorporationId(corporationId);

		Map<String, String> params = new HashMap<String, String>();
		params.put(USER_ID, String.valueOf(userId));
		params.put(CORPORATION_ID, String.valueOf(corporationId));

		OAuthMessage message = buildOauthMessage(consumerKey, consumerSecret, SCOPE, params);
		
		request.setOauthSignatureMethod(message.getSignatureMethod());
		request.setOauthSignature(message.getSignature());
		request.setOauthNonce(message.getParameter(OAuth.OAUTH_NONCE));
		request.setOauthTimeStamp(message.getParameter(OAuth.OAUTH_TIMESTAMP));
		request.setOauthVersion(message.getParameter(OAuth.OAUTH_VERSION));

		return request;
	}

	private static OAuthMessage buildOauthMessage(String consumerKey, String comsumerSecret, String scope,  Map<String, String> params)
			throws OAuthException, IOException, URISyntaxException {
		
		OAuthMessage message = new OAuthMessage(OAuthMessage.GET, SCOPE, params.entrySet());
		OAuthConsumer consumer = new OAuthConsumer(null, consumerKey, comsumerSecret, null);
		OAuthAccessor accessor = new OAuthAccessor(consumer);
		
		message.addRequiredParameters(accessor);
		
		return message;
	}

}
