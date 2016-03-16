package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.user.UserTypeDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("userTypeGetService")
public class UserTypeDtoFieldGetService extends DtoFieldGetService<UserTypeDto> {
	
	public UserTypeDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, UserTypeDto userType, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if(field.equalsIgnoreCase(DATEADDED)) {
			value = userType.getDateAdded();
		}
		else if(field.equalsIgnoreCase(DESCRIPTION)) {
			value = userType.getDescription();
		}
		else if(field.equalsIgnoreCase(ENABLED)) {
			value = userType.isEnabled();
		}
		else if(field.equalsIgnoreCase(ISHIDDEN)) {
			value = userType.isIsHidden();
		}
		else if(field.equalsIgnoreCase(NAME)) {
			value = userType.getName();
		}
		else if(field.equalsIgnoreCase(USERTYPEID)) {
			value = userType.getUserTypeID();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
	}

    private String DATEADDED="dateAdded";
    private String DESCRIPTION="description";
    private String ENABLED="enabled";
    private String ISHIDDEN="isHidden";
    private String NAME="name";
    private String USERTYPEID="userTypeID";

}
