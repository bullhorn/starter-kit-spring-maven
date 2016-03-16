package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.user.UserTypeDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("userTypeSetService")
public class UserTypeDtoFieldSetService extends DtoFieldSetService<UserTypeDto> {
	
	public UserTypeDtoFieldSetService() {
		super();
	}
	
	@Override
	public UserTypeDto changeDto(UserTypeDto userType, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(DATEADDED)) {
	
				userType.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
			} else if(field.equalsIgnoreCase(DESCRIPTION)) {
	
				userType.setDescription(value);
	
			} else if(field.equalsIgnoreCase(ENABLED)) {
	
				userType.setEnabled(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(ISHIDDEN)) {
	
				userType.setIsHidden(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(NAME)) {
	
				userType.setName(value);
	
			} else if(field.equalsIgnoreCase(USERTYPEID)) {
	
				userType.setUserTypeID(Utility.forceParseInteger(value));
			}
		}
		
		return userType;
	}

	private String DATEADDED="dateAdded";
	private String DESCRIPTION="description";
	private String ENABLED="enabled";
	private String ISHIDDEN="isHidden";
	private String NAME="name";
	private String USERTYPEID="userTypeID";

}
