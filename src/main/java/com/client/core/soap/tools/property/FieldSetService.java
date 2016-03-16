package com.client.core.soap.tools.property;

import java.util.Map;

import com.bullhorn.entity.AbstractDto;

public interface FieldSetService<T extends AbstractDto> {

	public T changeDto(T dto, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed);
	
}
