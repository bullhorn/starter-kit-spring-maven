package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.appointment.AppointmentDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("appointmentGetService")
public class AppointmentDtoFieldGetService extends DtoFieldGetService<AppointmentDto> {
	
	public AppointmentDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, AppointmentDto appointment, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(APPOINTMENTID)) {
			value = appointment.getAppointmentID();
		}
		else if (field.equalsIgnoreCase(APPOINTMENTUUID)) {
			value = appointment.getAppointmentUUID();
		}
		else if (field.equalsIgnoreCase(CANDIDATEREFERENCEID)) {
			value = appointment.getCandidateReferenceID();
		}
		else if (field.equalsIgnoreCase(CLIENTCONTACTREFERENCEID)) {
			value = appointment.getClientContactReferenceID();
		}
		else if (field.equalsIgnoreCase(COMMUNICATIONMETHOD)) {
			value = appointment.getCommunicationMethod();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = appointment.getDateAdded();
		}
		else if (field.equalsIgnoreCase(DATEBEGIN)) {
			value = appointment.getDateBegin();
		}
		else if (field.equalsIgnoreCase(DATEEND)) {
			value = appointment.getDateEnd();
		}
		else if (field.equalsIgnoreCase(DATELASTMODIFIED)) {
			value = appointment.getDateLastModified();
		}
		else if (field.equalsIgnoreCase(DESCRIPTION)) {
			value = appointment.getDescription();
		}
		else if (field.equalsIgnoreCase(ISALLDAY)) {
			appointment.isIsAllDay();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			appointment.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(ISPRIVATE)) {
			appointment.isIsPrivate();
		}
		else if (field.equalsIgnoreCase(JOBORDERID)) {
			value = appointment.getJobOrderID();
		}
		else if (field.equalsIgnoreCase(LOCATION)) {
			value = appointment.getLocation();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = appointment.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(NOTIFICATIONMINUTES)) {
			value = appointment.getNotificationMinutes();
		}
		else if (field.equalsIgnoreCase(OWNERID)) {
			value = appointment.getOwnerID();
		}
		else if (field.equalsIgnoreCase(PARENTAPPOINTMENTID)) {
			value = appointment.getParentAppointmentID();
		}
		else if (field.equalsIgnoreCase(PLACEMENTID)) {
			value = appointment.getPlacementID();
		}
		else if (field.equalsIgnoreCase(RECURRENCEDAYBITS)) {
			value = appointment.getRecurrenceDayBits();
		}
		else if (field.equalsIgnoreCase(RECURRENCEFREQUENCY)) {
			value = appointment.getRecurrenceFrequency();
		}
		else if (field.equalsIgnoreCase(RECURRENCEMAX)) {
			value = appointment.getRecurrenceMax();
		}
		else if (field.equalsIgnoreCase(RECURRENCEMONTHBITS)) {
			value = appointment.getRecurrenceMonthBits();
		}
		else if (field.equalsIgnoreCase(RECURRENCESTYLE)) {
			value = appointment.getRecurrenceStyle();
		}
		else if (field.equalsIgnoreCase(RECURRENCETYPE)) {
			value = appointment.getRecurrenceType();
		}
		else if (field.equalsIgnoreCase(SHOWTIMEAS)) {
			value = appointment.getShowTimeAs();
		}
		else if (field.equalsIgnoreCase(SUBJECT)) {
			value = appointment.getShowTimeAs();
		}
		else if (field.equalsIgnoreCase(TIMEZONEID)) {
			value = appointment.getTimeZoneID();
		}
		else if (field.equalsIgnoreCase(TYPE)) {
			value = appointment.getType();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
	}
	
	private String APPOINTMENTID="appointmentID";
	private String APPOINTMENTUUID="appointmentUUID";
	private String CANDIDATEREFERENCEID="candidateReferenceID";
	private String CLIENTCONTACTREFERENCEID="clientContactReferenceID";
	private String COMMUNICATIONMETHOD="communicationMethod";
	private String DATEADDED="dateAdded";
	private String DATEBEGIN="dateBegin";
	private String DATEEND="dateEnd";
	private String DATELASTMODIFIED="dateLastModified";
	private String DESCRIPTION="description";
	private String ISALLDAY="isAllDay";
	private String ISDELETED="isDeleted";
	private String ISPRIVATE="isPrivate";
	private String JOBORDERID="jobOrderID";
	private String LOCATION="location";
	private String MIGRATEGUID="migrateGUID";
	private String NOTIFICATIONMINUTES="notificationMinutes";
	private String OWNERID="ownerID";
	private String PARENTAPPOINTMENTID="parentAppointmentID";
	private String PLACEMENTID="placementID";
	private String RECURRENCEDAYBITS="recurrenceDayBits";
	private String RECURRENCEFREQUENCY="recurrenceFrequency";
	private String RECURRENCEMAX="recurrenceMax";
	private String RECURRENCEMONTHBITS="recurrenceMonthBits";
	private String RECURRENCESTYLE="recurrenceStyle";
	private String RECURRENCETYPE="recurrenceType";
	private String SHOWTIMEAS="showTimeAs";
	private String SUBJECT="showTimeAs";
	private String TIMEZONEID="timeZoneID";
	private String TYPE="type";

}
