package com.client.core.base.tools.web.impl;

import com.client.core.base.tools.web.JsonConverter;
import com.client.core.base.tools.web.objectmapper.CustomJsonObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Log4j2
@Service
public class StandardJsonConverter implements JsonConverter {

	private final ObjectMapper objectMapperStandard;

	public StandardJsonConverter() {
		super();
		this.objectMapperStandard = createStandardObjectMapper();

	}

	/**
	 * Create the ObjectMapper that deserializes entity to json String.
	 *
	 * Registers the JodaModule to convert DateTime so-called epoch timestamp (number of milliseconds since January 1st,
	 * 1970, UTC)
	 *
	 * @return ObjectMapper
	 */
	private ObjectMapper createStandardObjectMapper() {
		return new CustomJsonObjectMapper();
	}

	@Override
	public <T> String convertEntityToJsonString(T entity) {
		String jsonString = "";
		try {
			jsonString = objectMapperStandard.writeValueAsString(entity);
		} catch (JsonProcessingException e) {
			log.error("Error serializing entity of type" + entity.getClass() + " to jsonString.", e);
		}
		return jsonString;
	}

	/**
	 * Used to convert json into a new object specified by the type.
	 *
	 * @param jsonString json input
	 * @param type the object that will be created from the json
	 * @return Object representation of json string
	 * @param <T>
	 */
	@Override
	public <T> T convertJsonStringToEntity(String jsonString, Class<T> type) {
		T entity = null;

		try {
			entity = objectMapperStandard.readValue(jsonString, type);
		} catch (IOException e) {
			log.error("Error converting jsonString to entity of type" + type + " from jsonString: ", e);
		}

		return entity;
	}

    @Override
    public Map<String, Object> convertJsonStringToMap(String jsonString) {
        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<>() {};

        Map<String, Object> returnValues = Maps.newLinkedHashMap();
        try {
            returnValues = objectMapperStandard.readValue(jsonString, typeRef);
        } catch (IOException e) {
            log.error("Error converting jsonString to map from jsonString: "+jsonString, e);
        }

        return returnValues;
    }

}
