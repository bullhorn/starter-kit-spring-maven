package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.userwork.UserWorkDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("userWorkGetService")
public class UserWorkDtoFieldGetService extends DtoFieldGetService<UserWorkDto> {
	
	public UserWorkDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, UserWorkDto userWork, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if(field.equalsIgnoreCase(APPOINTMENTID)) {
			value = userWork.getAppointmentID();
		}
		else if(field.equalsIgnoreCase(ASSESSMENTID)) {
			value = userWork.getAssessmentID();
		}
		else if(field.equalsIgnoreCase(BHTIMESTAMP)) {
			value = userWork.getBhTimestamp();
		}
		else if(field.equalsIgnoreCase(CLIENT)) {
			value = userWork.getClient();
		}
		else if(field.equalsIgnoreCase(DATEADDED)) {
			value = userWork.getDateAdded();
		}
		else if(field.equalsIgnoreCase(DESCRIPTION)) {
			value = userWork.getDescription();
		}
		else if(field.equalsIgnoreCase(EXTERNALID)) {
			value = userWork.getExternalID();
		}
		else if(field.equalsIgnoreCase(ISAUCTION)) {
			value = userWork.isIsAuction();
		}
		else if(field.equalsIgnoreCase(ISDELETED)) {
			value = userWork.isIsDeleted();
		}
		else if(field.equalsIgnoreCase(ISOPEN)) {
			value = userWork.isIsOpen();
		}
		else if(field.equalsIgnoreCase(ISSENDOUT)) {
			value = userWork.isIsSendOut();
		}
		else if(field.equalsIgnoreCase(JOBORDERID)) {
			value = userWork.getJobOrderID();
		}
		else if(field.equalsIgnoreCase(MIGRATEGUID)) {
			value = userWork.getMigrateGUID();
		}
		else if(field.equalsIgnoreCase(NAME)) {
			value = userWork.getName();
		}
		else if(field.equalsIgnoreCase(OWNERID)) {
			value = userWork.getOwnerID();
		}
		else if(field.equalsIgnoreCase(PLACEMENTID)) {
			value = userWork.getPlacementID();
		}
		else if(field.equalsIgnoreCase(PRICE)) {
			value = userWork.getPrice();
		}
		else if(field.equalsIgnoreCase(PUBLISHED)) {
			value = userWork.getPublished();
		}
		else if(field.equalsIgnoreCase(QUANTITY)) {
			value = userWork.getQuantity();
		}
		else if(field.equalsIgnoreCase(SALETERMS)) {
			value = userWork.getSaleTerms();
		}
		else if(field.equalsIgnoreCase(SALETYPE)) {
			value = userWork.getSaleType();
		}
		else if(field.equalsIgnoreCase(SORTORDER)) {
			value = userWork.getSortOrder();
		}
		else if(field.equalsIgnoreCase(TIMECARDID)) {
			value = userWork.getTimecardID();
		}
		else if(field.equalsIgnoreCase(TYPE)) {
			value = userWork.getType();
		}
		else if(field.equalsIgnoreCase(USERFOLDERID)) {
			value = userWork.getUserFolderID();
		}
		else if(field.equalsIgnoreCase(USERWORKID)) {
			value = userWork.getUserWorkID();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		
		return value;
	}
	
	private String APPOINTMENTID="appointmentID";
	private String ASSESSMENTID="assessmentID";
	private String BHTIMESTAMP="bhTimestamp";
	private String CLIENT="client";
	private String DATEADDED="dateAdded";
	private String DESCRIPTION="description";
	private String EXTERNALID="externalID";
	private String ISAUCTION="isAuction";
	private String ISDELETED="isDeleted";
	private String ISOPEN="isOpen";
	private String ISSENDOUT="isSendOut";
	private String JOBORDERID="jobOrderID";
	private String MIGRATEGUID="migrateGUID";
	private String NAME="name";
	private String OWNERID="ownerID";
	private String PLACEMENTID="placementID";
	private String PRICE="price";
	private String PUBLISHED="published";
	private String QUANTITY="quantity";
	private String SALETERMS="saleTerms";
	private String SALETYPE="saleType";
	private String SORTORDER="sortOrder";
	private String TIMECARDID="timecardID";
	private String TYPE="type";
	private String USERFOLDERID="userFolderID";
	private String USERWORKID="userWorkID";

}
