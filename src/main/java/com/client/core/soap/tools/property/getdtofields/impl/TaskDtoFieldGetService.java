package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.task.TaskDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("taskGetService")
public class TaskDtoFieldGetService extends DtoFieldGetService<TaskDto> {

	public TaskDtoFieldGetService() {
		super();
	}

	@Override
	public Object retrieveField(String field, TaskDto task, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if (field.equalsIgnoreCase(CANDIDATEID)) {
			value = task.getCandidateID();
		}
		else if (field.equalsIgnoreCase(CLIENTCONTACTID)) {
			value = task.getClientContactID();
		}
		else if (field.equalsIgnoreCase(DATEADDED)) {
			value = task.getDateAdded();
		}
		else if (field.equalsIgnoreCase(DATEBEGIN)) {
			value = task.getDateBegin();
		}
		else if (field.equalsIgnoreCase(DATECOMPLETED)) {
			value = task.getDateCompleted();
		}
		else if (field.equalsIgnoreCase(DATEEND)) {
			value = task.getDateEnd();
		}
		else if (field.equalsIgnoreCase(DATELASTMODIFIED)) {
			value = task.getDateLastModified();
		}
		else if (field.equalsIgnoreCase(DESCRIPTION)) {
			value = task.getDescription();
		}
		else if (field.equalsIgnoreCase(ISCOMPLETED)) {
			value = task.isIsCompleted();
		}
		else if (field.equalsIgnoreCase(ISDELETED)) {
			value = task.isIsDeleted();
		}
		else if (field.equalsIgnoreCase(ISPRIVATE)) {
			value = task.isIsPrivate();
		}
		else if (field.equalsIgnoreCase(ISSYSTEMTASK)) {
			value = task.isIsSystemTask();
		}
		else if (field.equalsIgnoreCase(JOBORDERID)) {
			value = task.getJobOrderID();
		}
		else if (field.equalsIgnoreCase(JOBSUBMISSIONID)) {
			value = task.getJobSubmissionID();
		}
		else if (field.equalsIgnoreCase(MIGRATEGUID)) {
			value = task.getMigrateGUID();
		}
		else if (field.equalsIgnoreCase(NOTIFICATIONMINUTES)) {
			value = task.getNotificationMinutes();
		}
		else if (field.equalsIgnoreCase(OWNERID)) {
			value = task.getOwnerID();
		}
		else if (field.equalsIgnoreCase(PARENTTASKID)) {
			value = task.getParentTaskID();
		}
		else if (field.equalsIgnoreCase(PLACEMENTID)) {
			value = task.getPlacementID();
		}
		else if (field.equalsIgnoreCase(RECURRENCEDAYBITS)) {
			value = task.getRecurrenceDayBits();
		}
		else if (field.equalsIgnoreCase(RECURRENCEFREQUENCY)) {
			value = task.getRecurrenceFrequency();
		}
		else if (field.equalsIgnoreCase(RECURRENCEMAX)) {
			value = task.getRecurrenceMax();
		}
		else if (field.equalsIgnoreCase(RECURRENCEMONTHBITS)) {
			value = task.getRecurrenceMonthBits();
		}
		else if (field.equalsIgnoreCase(RECURRENCESTYLE)) {
			value = task.getRecurrenceStyle();
		}
		else if (field.equalsIgnoreCase(RECURRENCETYPE)) {
			value = task.getRecurrenceType();
		}
		else if (field.equalsIgnoreCase(SUBJECT)) {
			value = task.getSubject();
		}
		else if (field.equalsIgnoreCase(TASKID)) {
			value = task.getTaskID();
		}
		else if (field.equalsIgnoreCase(TASKUUID)) {
			value = task.getTaskUUID();
		}
		else if (field.equalsIgnoreCase(TIMEZONEID)) {
			value = task.getTimeZoneID();
		}
		else if (field.equalsIgnoreCase(TYPE)) {
			value = task.getType();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
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
