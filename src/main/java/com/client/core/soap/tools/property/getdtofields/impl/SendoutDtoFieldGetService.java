package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.candidate.SendoutDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("sendoutGetService")
public class SendoutDtoFieldGetService extends DtoFieldGetService<SendoutDto> {
	
	public SendoutDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, SendoutDto sendout, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(CANDIDATEID)) {
			value = sendout.getCandidateID();
		}
		else if (field.equalsIgnoreCase(CLIENTCONTACTID)) {
			value = sendout.getClientContactID();
		}
		else if (field.equalsIgnoreCase(CLIENTCORPORATIONID)) {
			value = sendout.getClientCorporationID();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = sendout.getDateAdded();
		}
		else if (field.equalsIgnoreCase(EMAIL)) {
			value = sendout.getEmail();
		}
		else if (field.equalsIgnoreCase(ISREAD)) {
			value = sendout.isIsRead();
		}
		else if (field.equalsIgnoreCase(JOBORDERID)) {
			value = sendout.getJobOrderID();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = sendout.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(SENDOUTID)) {
			value = sendout.getSendoutID();
		}
		else if (field.equalsIgnoreCase(USERID)) {
			value = sendout.getUserID();
		}
		else if (field.equalsIgnoreCase(USERMESSAGEID)) {
			value = sendout.getUserMessageID();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
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
