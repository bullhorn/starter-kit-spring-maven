package com.client.core.base.tools.query.impl;

import com.client.core.base.tools.query.QueryHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;


public class MessageSourceQueryHelper implements QueryHelper {

	private final MessageSource queries;
	private Logger log = LogManager.getLogger(getClass());

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
