package com.client.core.base.tools.query.impl;

import com.client.core.base.tools.query.QueryHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;


public class MessageSourceQueryHelper implements QueryHelper {

	private final MessageSource queries;
	private static Log log = LogFactory.getLog(MessageSourceQueryHelper.class);

	public MessageSourceQueryHelper(MessageSource queries) {
		super();
		this.queries = queries;
	}

	@Override
	public String getQueryUsingKey(String key) {

		String query = "";
		try {
			query = queries.getMessage(key, null, Locale.US);
		} catch (NoSuchMessageException e) {
			log.error("No query with key: " + key + " exists.", e);
		}
		return query;
	}

}
