package com.client.core.soap.tools.property.setdtofields;

import java.util.Map;

import com.bullhorn.entity.AbstractDto;
import com.client.core.soap.tools.property.FieldSetService;

/**
 * Service class that handles Dto updates based on a 
 * Map<String,String> containing the key "placement.[field]" or "[field]"
 * and the value in the map being the value that field should be updated to.
 * 
 * Examples: "placement.approvingClientContactID":"12345" or "approvingClientContactID":"12345"
 * will update approvingClientContactID to 12345 on the PlacementDto.
 *
 */
public abstract class DtoFieldSetService<T extends AbstractDto> implements FieldSetService<T> {
	
	public abstract T changeDto(T dto, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed);
	
	protected String removeDotPrefix(String field) {
		String[] forParse = field.split("\\.");
		
		return forParse[1];
	}
	
}
