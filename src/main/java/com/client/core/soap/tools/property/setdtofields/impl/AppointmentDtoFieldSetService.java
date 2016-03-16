package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.appointment.AppointmentDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("appointmentSetService")
public class AppointmentDtoFieldSetService extends DtoFieldSetService<AppointmentDto> {

	public AppointmentDtoFieldSetService() {
		super();
	}

	@Override
	public AppointmentDto changeDto(AppointmentDto appointment, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {

		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}

			if(field.equalsIgnoreCase(APPOINTMENTID)) {

				appointment.setAppointmentID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(APPOINTMENTUUID)) {

				appointment.setAppointmentUUID(value);

			} else if(field.equalsIgnoreCase(CANDIDATEREFERENCEID)) {

				appointment.setCandidateReferenceID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CLIENTCONTACTREFERENCEID)) {

				appointment.setClientContactReferenceID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(COMMUNICATIONMETHOD)) {

				appointment.setCommunicationMethod(value);

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				appointment.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEBEGIN)) {

				appointment.setDateBegin(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEEND)) {

				appointment.setDateEnd(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATELASTMODIFIED)) {

				appointment.setDateLastModified(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DESCRIPTION)) {

				appointment.setDescription(value);

			} else if(field.equalsIgnoreCase(ISALLDAY)) {

				appointment.setIsAllDay(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				appointment.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISPRIVATE)) {

				appointment.setIsPrivate(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(JOBORDERID)) {

				appointment.setJobOrderID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(LOCATION)) {

				appointment.setLocation(value);

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				appointment.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(NOTIFICATIONMINUTES)) {

				appointment.setNotificationMinutes(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(OWNERID)) {

				appointment.setOwnerID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PARENTAPPOINTMENTID)) {

				appointment.setParentAppointmentID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PLACEMENTID)) {

				appointment.setPlacementID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEDAYBITS)) {

				appointment.setRecurrenceDayBits(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEFREQUENCY)) {

				appointment.setRecurrenceFrequency(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEMAX)) {

				appointment.setRecurrenceMax(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEMONTHBITS)) {

				appointment.setRecurrenceMonthBits(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCESTYLE)) {

				appointment.setRecurrenceStyle(value);

			} else if(field.equalsIgnoreCase(RECURRENCETYPE)) {

				appointment.setRecurrenceType(value);

			} else if(field.equalsIgnoreCase(SHOWTIMEAS)) {

				appointment.setShowTimeAs(value);

			} else if(field.equalsIgnoreCase(SUBJECT)) {

				appointment.setShowTimeAs(value);

			} else if(field.equalsIgnoreCase(TIMEZONEID)) {

				appointment.setTimeZoneID(value);

			} else if(field.equalsIgnoreCase(TYPE)) {

				appointment.setType(value);

			}

		}

		return appointment;
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
