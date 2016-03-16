package com.client.core.soap.tools.property.getdtofields;

import com.bullhorn.entity.AbstractDto;
import com.client.core.soap.tools.property.FieldGetService;

public abstract class DtoFieldGetService<T extends AbstractDto> implements FieldGetService<T> {

	public abstract Object retrieveField(String field, T dto, Boolean isDotPrefixed) throws NoSuchMethodException;
	
	protected String removeDotPrefix(String field) {
		String[] forParse = field.split("\\.");
		
		return forParse[1];
	}
	
}
