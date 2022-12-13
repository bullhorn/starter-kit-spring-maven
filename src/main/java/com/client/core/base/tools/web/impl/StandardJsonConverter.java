package com.client.core.base.tools.web.impl;

import com.client.core.base.tools.web.JsonConverter;
import com.client.core.base.tools.web.objectmapper.CustomJsonObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class StandardJsonConverter implements JsonConverter {

	private static Log log = LogFactory.getLog(StandardJsonConverter.class);

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
	 * @return
	 */
	private ObjectMapper createStandardObjectMapper() {
		ObjectMapper objectMapper = new CustomJsonObjectMapper();
		return objectMapper;
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

	@Override
	public <T> T convertJsonStringToEntity(String jsonString, Class<T> type) {
		T entity = null;

		try {
			entity = objectMapperStandard.readValue(jsonString, type);
		} catch (IOException e) {
			log.error("Error coverting jsonString to entity of type" + type + " from jsonString: ", e);
		}

		return entity;
	}

    @Override
    public <T, E> T convertJsonStringToEntity(String jsonString, Class<T> parameterizedType, Class<E> parameterType) {
        T entity = null;

        try {
            JavaType type = objectMapperStandard.getTypeFactory().constructParametrizedType(parameterizedType, parameterizedType, parameterType);

            entity = objectMapperStandard.readValue(jsonString, type);
        } catch (IOException e) {
            log.error("Error coverting jsonString to entity of type" + parameterizedType.toString() + " from jsonString: ", e);
        }

        return entity;
    }

    @Override
    public Map<String, Object> convertJsonStringToMap(String jsonString) {
        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
        };

        Map<String, Object> returnValues = Maps.newLinkedHashMap();
        try {
            returnValues = objectMapperStandard.readValue(jsonString, typeRef);
        } catch (IOException e) {
            log.error("Error coverting jsonString to map from jsonString: "+jsonString, e);
        }

        return returnValues;
    }

}
