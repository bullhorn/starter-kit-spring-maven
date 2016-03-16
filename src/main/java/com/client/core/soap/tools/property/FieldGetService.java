package com.client.core.soap.tools.property;

import com.bullhorn.entity.AbstractDto;

public interface FieldGetService<T extends AbstractDto> {
	
	public Object retrieveField(String field, T dto, Boolean isDotPrefixed) throws NoSuchMethodException;
	
}
