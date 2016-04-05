package com.client.core.base.tools.web.objectmapper;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * Defines an ObjectMapper with JodaModule configured, to handle DateTime values in rest service
 * 
 * @author Magnus Fiore Palm
 * 
 */
public class CustomJsonObjectMapper extends ObjectMapper {

	private final Logger log = Logger.getLogger(CustomJsonObjectMapper.class);
	private static final long serialVersionUID = 1L;

	public CustomJsonObjectMapper() {
		registerModule(new JodaModule());
		configure(SerializationFeature.INDENT_OUTPUT, true);
		configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
	}

}
