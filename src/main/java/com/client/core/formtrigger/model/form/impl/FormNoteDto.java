package com.client.core.formtrigger.model.form.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.bullhorn.entity.note.NoteDto;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.client.core.formtrigger.model.form.AbstractFormDto;

public class FormNoteDto extends AbstractFormDto<Note> {

	public FormNoteDto() {
		super(Logger.getLogger(FormNoteDto.class));
	}

	private String action;
	private String closeOnFinish;
	private String comments;
	private String dateAdded;
	private String dateAddedHour;
	private String distributionListID;
	private String jobPostingID;
	private String jobPostingID_display;
	private String notify;
	private String notify_display;
	private String placementID;
	private String referenceUserID;
	private String schedule;
	private Integer userCommentID;
	private Integer userID;
	private Integer commentingUserID;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCloseOnFinish() {
		return closeOnFinish;
	}

	public void setCloseOnFinish(String closeOnFinish) {
		this.closeOnFinish = closeOnFinish;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDateAddedHour() {
		return dateAddedHour;
	}

	public void setDateAddedHour(String dateAddedHour) {
		this.dateAddedHour = dateAddedHour;
	}

	public String getDistributionListID() {
		return distributionListID;
	}

	public void setDistributionListID(String distributionListID) {
		this.distributionListID = distributionListID;
	}

	public String getJobPostingID() {
		return jobPostingID;
	}

	public void setJobPostingID(String jobPostingID) {
		this.jobPostingID = jobPostingID;
	}

	public String getJobPostingID_display() {
		return jobPostingID_display;
	}

	public void setJobPostingID_display(String jobPostingID_display) {
		this.jobPostingID_display = jobPostingID_display;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public String getNotify_display() {
		return notify_display;
	}

	public void setNotify_display(String notify_display) {
		this.notify_display = notify_display;
	}

	public String getPlacementID() {
		return placementID;
	}

	public void setPlacementID(String placementID) {
		this.placementID = placementID;
	}

	public String getReferenceUserID() {
		return referenceUserID;
	}

	public void setReferenceUserID(String referenceUserID) {
		this.referenceUserID = referenceUserID;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Integer getUserCommentID() {
		return userCommentID;
	}

	public void setUserCommentID(Integer userCommentID) {
		this.userCommentID = userCommentID;
	}

	/**
	 * Added to bridge the inconsistency in bullhorn form between add and edit note. Add note uses scheduleID and edit note uses
	 * userCommentID to refer to the id.
	 * 
	 * This setter method will be used by Spring to map the scheduleID request param to the userCommentID field
	 * 
	 * @param scheduleID
	 */
	public void setScheduleID(Integer scheduleID) {
		this.userCommentID = scheduleID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getCommentingUserID() {
		return commentingUserID;
	}

	public void setCommentingUserID(Integer commentingUserID) {
		this.commentingUserID = commentingUserID;
	}

	@Override
	public Note instantiateEntity() {
		Note note = new Note();

		note.setAction(action);
		note.setCommentingPerson(new LinkedPerson(commentingUserID));
		note.setComments(comments);
		note.setDateAdded(stringToDateTime(dateAdded));

		Integer jobId = getJobId();
		if (!StringUtils.isBlank(jobPostingID)) {
			note.setJobOrder(new JobOrder(jobId));
		}
		note.setId(userCommentID);
		note.setPersonReference(new LinkedPerson(userID));

		return note;
	}

	private Integer getJobId() {
		try {
			return Integer.parseInt(jobPostingID.split(",")[0]);
		} catch (Exception e) {
			log.error("Error parsing job id");
			return 0;
		}
	}

	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public NoteDto instantiateBullhornDto() {
		NoteDto note = new NoteDto();

		note.setAction(action);
		note.setCommentingPersonID(commentingUserID);
		note.setComments(comments);
		note.setDateAdded(stringToXMLGregorianCalendar(dateAdded));

		if (!StringUtils.isBlank(jobPostingID)) {
			note.setJobOrderID(getJobId());
		}

		note.setNoteID(userCommentID);
		note.setPersonReferenceID(userID);

		return note;
	}

}
