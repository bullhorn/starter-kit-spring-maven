package com.client.core.base.tools.web.objectmapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

public class CustomJsonObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;

	public CustomJsonObjectMapper() {
		registerModule(new JodaModule());
		configure(SerializationFeature.INDENT_OUTPUT, true);
		configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
	}

}
