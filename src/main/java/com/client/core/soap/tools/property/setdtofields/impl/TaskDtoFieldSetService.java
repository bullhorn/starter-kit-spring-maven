package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.task.TaskDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("taskSetService")
public class TaskDtoFieldSetService extends DtoFieldSetService<TaskDto> {

	public TaskDtoFieldSetService() {
		super();
	}

	@Override
	public TaskDto changeDto(TaskDto task, Map<String, String> fieldValues, String dateFormat, Boolean isDotPrefixed) {

		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
			if(field.equalsIgnoreCase(CANDIDATEID)) {

				task.setCandidateID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(CLIENTCONTACTID)) {

				task.setClientContactID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(DATEADDED)) {

				task.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEBEGIN)) {

				task.setDateBegin(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATECOMPLETED)) {

				task.setDateCompleted(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATEEND)) {

				task.setDateEnd(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DATELASTMODIFIED)) {

				task.setDateLastModified(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

			} else if(field.equalsIgnoreCase(DESCRIPTION)) {

				task.setDescription(value);

			} else if(field.equalsIgnoreCase(ISCOMPLETED)) {

				task.setIsCompleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISDELETED)) {

				task.setIsDeleted(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISPRIVATE)) {

				task.setIsPrivate(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(ISSYSTEMTASK)) {

				task.setIsSystemTask(Utility.parseBoolean(value));

			} else if(field.equalsIgnoreCase(JOBORDERID)) {

				task.setJobOrderID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(JOBSUBMISSIONID)) {

				task.setJobSubmissionID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				task.setMigrateGUID(value);

			} else if(field.equalsIgnoreCase(NOTIFICATIONMINUTES)) {

				task.setNotificationMinutes(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(OWNERID)) {

				task.setOwnerID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PARENTTASKID)) {

				task.setParentTaskID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(PLACEMENTID)) {

				task.setPlacementID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEDAYBITS)) {

				task.setRecurrenceDayBits(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEFREQUENCY)) {

				task.setRecurrenceFrequency(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEMAX)) {

				task.setRecurrenceMax(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCEMONTHBITS)) {

				task.setRecurrenceMonthBits(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(RECURRENCESTYLE)) {

				task.setRecurrenceStyle(value);

			} else if(field.equalsIgnoreCase(RECURRENCETYPE)) {

				task.setRecurrenceType(value);

			} else if(field.equalsIgnoreCase(SUBJECT)) {

				task.setSubject(value);

			} else if(field.equalsIgnoreCase(TASKID)) {

				task.setTaskID(Utility.forceParseInteger(value));

			} else if(field.equalsIgnoreCase(TASKUUID)) {

				task.setTaskUUID(value);

			} else if(field.equalsIgnoreCase(TIMEZONEID)) {

				task.setTimeZoneID(value);

			} else if(field.equalsIgnoreCase(TYPE)) {

				task.setType(value);
			
			}
			
		}
		
		return task;
	}

	private String CANDIDATEID="candidateID";
	private String CLIENTCONTACTID="clientContactID";
	private String DATEADDED="dateAdded";
	private String DATEBEGIN="dateBegin";
	private String DATECOMPLETED="dateCompleted";
	private String DATEEND="dateEnd";
	private String DATELASTMODIFIED="dateLastModified";
	private String DESCRIPTION="description";
	private String ISCOMPLETED="isCompleted";
	private String ISDELETED="isDeleted";
	private String ISPRIVATE="isPrivate";
	private String ISSYSTEMTASK="isSystemTask";
	private String JOBORDERID="jobOrderID";
	private String JOBSUBMISSIONID="jobSubmissionID";
	private String MIGRATEGUID="migrateGUID";
	private String NOTIFICATIONMINUTES="notificationMinutes";
	private String OWNERID="ownerID";
	private String PARENTTASKID="parentTaskID";
	private String PLACEMENTID="placementID";
	private String RECURRENCEDAYBITS="recurrenceDayBits";
	private String RECURRENCEFREQUENCY="recurrenceFrequency";
	private String RECURRENCEMAX="recurrenceMax";
	private String RECURRENCEMONTHBITS="recurrenceMonthBits";
	private String RECURRENCESTYLE="recurrenceStyle";
	private String RECURRENCETYPE="recurrenceType";
	private String SUBJECT="subject";
	private String TASKID="taskID";
	private String TASKUUID="taskUUID";
	private String TIMEZONEID="timeZoneID";
	private String TYPE="type";

}
