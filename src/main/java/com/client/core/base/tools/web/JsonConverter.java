package com.client.core.base.tools.web;

import java.util.Map;

public interface JsonConverter {

    /**
     * Converts an entity to a json String using the standard nested format.
     *
     * @param entity
     * @return
     */
    <T> String convertEntityToJsonString(T entity);

    /**
     * Converts a json string into an entity of type T.
     *
     * @param jsonString
     * @param type
     * @return
     */
    <T> T convertJsonStringToEntity(String jsonString, Class<T> type);

    <T, E> T convertJsonStringToEntity(String jsonString, Class<T> parameterizedType, Class<E> parameterType);


    Map<String, Object> convertJsonStringToMap(String jsonString);
	
}
