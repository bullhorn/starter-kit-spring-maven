package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.SendoutDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("sendoutSetService")
public class SendoutDtoFieldSetService extends DtoFieldSetService<SendoutDto> {
	
	public SendoutDtoFieldSetService() {
		super();
	}
	
	@Override
	public SendoutDto changeDto(SendoutDto sendout, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {

		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
			if(field.equalsIgnoreCase(CANDIDATEID)) {
	
				sendout.setCandidateID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(CLIENTCONTACTID)) {
	
				sendout.setClientContactID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
	
				sendout.setClientCorporationID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(DATEADDED)) {
	
				sendout.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));
	
			} else if(field.equalsIgnoreCase(EMAIL)) {
	
				sendout.setEmail(value);
	
			} else if(field.equalsIgnoreCase(ISREAD)) {
	
				sendout.setIsRead(Utility.parseBoolean(value));
	
			} else if(field.equalsIgnoreCase(JOBORDERID)) {
	
				sendout.setJobOrderID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {
	
				sendout.setMigrateGUID(value);
	
			} else if(field.equalsIgnoreCase(SENDOUTID)) {
	
				sendout.setSendoutID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(USERID)) {
	
				sendout.setUserID(Utility.forceParseInteger(value));
	
			} else if(field.equalsIgnoreCase(USERMESSAGEID)) {
	
				sendout.setUserMessageID(Utility.forceParseInteger(value));
	
			}
		
		}
		
		return sendout;
	}
	
	private String CANDIDATEID="candidateID";
	private String CLIENTCONTACTID="clientContactID";
	private String CLIENTCORPORATIONID="clientCorporationID";
	private String DATEADDED="dateAdded";
	private String EMAIL="email";
	private String ISREAD="isRead";
	private String JOBORDERID="jobOrderID";
	private String MIGRATEGUID="migrateGUID";
	private String SENDOUTID="sendoutID";
	private String USERID="userID";
	private String USERMESSAGEID="userMessageID";

}
