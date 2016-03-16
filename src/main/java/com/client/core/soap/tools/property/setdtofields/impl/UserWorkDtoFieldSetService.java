package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.userwork.UserWorkDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("userWorkSetService")
public class UserWorkDtoFieldSetService extends DtoFieldSetService<UserWorkDto> {
	
	public UserWorkDtoFieldSetService() {
		super();
	}

	@Override
	public UserWorkDto changeDto(UserWorkDto userWork, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
			if(field.equalsIgnoreCase(APPOINTMENTID)) {

				userWork.setAppointmentID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(ASSESSMENTID)) {

				userWork.setAssessmentID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(BHTIMESTAMP)) {

				userWork.setBhTimestamp(value.getBytes());

			} else if(field.equalsIgnoreCase(CLIENT)) {

				userWork.setClient(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				userWork.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DESCRIPTION)) {

				userWork.setDescription(value);

			} else if(field.equalsIgnoreCase(EXTERNALID)) {

				userWork.setExternalID(value);

			} else if(field.equalsIgnoreCase(ISAUCTION)) {

				userWork.setIsAuction(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				userWork.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISOPEN)) {

				userWork.setIsOpen(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISSENDOUT)) {

				userWork.setIsSendOut(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(JOBORDERID)) {

				userWork.setJobOrderID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				userWork.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(NAME)) {

				userWork.setName(value);

			} else if(field.equalsIgnoreCase(OWNERID)) {

				userWork.setOwnerID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PLACEMENTID)) {

				userWork.setPlacementID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PRICE)) {

				userWork.setPrice(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(PUBLISHED)) {

				userWork.setPublished(value);

			} else if(field.equalsIgnoreCase(QUANTITY)) {

				userWork.setQuantity(Utility.forceParseBigDecimal(value));

			} else if(field.equalsIgnoreCase(SALETERMS)) {

				userWork.setSaleTerms(value);

			} else if(field.equalsIgnoreCase(SALETYPE)) {

				userWork.setSaleType(value);

			} else if(field.equalsIgnoreCase(SORTORDER)) {

				userWork.setSortOrder(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(TIMECARDID)) {

				userWork.setTimecardID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(TYPE)) {

				userWork.setType(value);

			} else if(field.equalsIgnoreCase(USERFOLDERID)) {

				userWork.setUserFolderID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(USERWORKID)) {

				userWork.setUserWorkID(Utility.forceParseInteger(value));

			}
			
		}
		
		return userWork;
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
