package com.client.core.formtrigger.model.form.impl;

import org.apache.log4j.Logger;

import com.bullhorn.entity.job.JobSubmissionDto;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.formtrigger.model.form.AbstractFormDto;

public class FormJobSubmissionDto extends AbstractFormDto<JobSubmission> {

	public FormJobSubmissionDto() {
		super(Logger.getLogger(FormJobSubmissionDto.class));
	}

	private String closeOnFinish;
	private String comments;
	private String distributionListID;
	private String distributionListID_display;
	private Integer jobPostingID;
	private Integer jobResponseID;
	private String notify;
	private String notify_display;
	private String schedule;
	private Integer sendingUserID;
	private String sendingUserID_display;
	private String source;
	private String status;
	private Integer userID;
	private String payRate;
	private String billRate;
	private String salary;

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

	public String getDistributionListID() {
		return distributionListID;
	}

	public void setDistributionListID(String distributionListID) {
		this.distributionListID = distributionListID;
	}

	public String getDistributionListID_display() {
		return distributionListID_display;
	}

	public void setDistributionListID_display(String distributionListID_display) {
		this.distributionListID_display = distributionListID_display;
	}

	public Integer getJobPostingID() {
		return jobPostingID;
	}

	public void setJobPostingID(Integer jobPostingID) {
		this.jobPostingID = jobPostingID;
	}

	public Integer getJobResponseID() {
		return jobResponseID;
	}

	public void setJobResponseID(Integer jobResponseID) {
		this.jobResponseID = jobResponseID;
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

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Integer getSendingUserID() {
		return sendingUserID;
	}

	public void setSendingUserID(Integer sendingUserID) {
		this.sendingUserID = sendingUserID;
	}

	public String getSendingUserID_display() {
		return sendingUserID_display;
	}

	public void setSendingUserID_display(String sendingUserID_display) {
		this.sendingUserID_display = sendingUserID_display;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	// the extra getters and setters for payRate, billRate and salary are needed since the parameter names sent from add and edit screen
	// are different.
	public String getSubmissionPayRate() {
		return payRate;
	}

	public void setSubmissionPayRate(String payRate) {
		this.payRate = payRate;
	}

	public String getSubmissionBillRate() {
		return billRate;
	}

	public void setSubmissionBillRate(String billRate) {
		this.billRate = billRate;
	}

	public String getSubmissionSalary() {
		return salary;
	}

	public void setSubmissionSalary(String salary) {
		this.salary = salary;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}

	public String getBillRate() {
		return billRate;
	}

	public void setBillRate(String billRate) {
		this.billRate = billRate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public JobSubmission instantiateEntity() {
		JobSubmission jobSubmission = new JobSubmission();

		jobSubmission.setCandidate(new Candidate(userID));
		jobSubmission.setJobOrder(new JobOrder(jobPostingID));
		jobSubmission.setId(jobResponseID);
		jobSubmission.setSendingUser(new CorporateUser(sendingUserID));
		jobSubmission.setSource(source);
		jobSubmission.setStatus(status);

		return jobSubmission;
	}

	/**
	 * Converts the form values to a SOAP dto.
	 * 
	 * @deprecated use {@link #instantiateEntity()} instead for BullhornEntity
	 * @return a SOAP dto
	 */
	@Deprecated
	public JobSubmissionDto instantiateBullhornDto() {
		JobSubmissionDto jobSubmission = new JobSubmissionDto();

		jobSubmission.setCandidateID(userID);
		jobSubmission.setJobOrderID(jobPostingID);
		jobSubmission.setJobSubmissionID(jobResponseID);
		jobSubmission.setSendingUserID(sendingUserID);
		jobSubmission.setSource(source);
		jobSubmission.setStatus(status);

		return jobSubmission;
	}

}
