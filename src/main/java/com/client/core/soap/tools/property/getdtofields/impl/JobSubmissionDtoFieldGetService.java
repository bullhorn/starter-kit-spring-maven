package com.client.core.soap.tools.property.getdtofields.impl;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.JobSubmissionDto;
import com.client.core.soap.tools.property.getdtofields.DtoFieldGetService;

@Service("jobSubmissionGetService")
public class JobSubmissionDtoFieldGetService extends DtoFieldGetService<JobSubmissionDto> {

	public JobSubmissionDtoFieldGetService() {
		super();
	}
	
	@Override
	public Object retrieveField(String field, JobSubmissionDto jobSubmission, Boolean isDotPrefixed) throws NoSuchMethodException {
		Object value = null;

		if(isDotPrefixed) {
			field = removeDotPrefix(field);
		}
		
		if(field.equalsIgnoreCase(CANDIDATEID)) {
			value = jobSubmission.getCandidateID();
		}
		else if(field.equalsIgnoreCase(DATEADDED)) {
			value = jobSubmission.getDateAdded();
		}
		else if(field.equalsIgnoreCase(ISDELETED)) {
			value = jobSubmission.isIsDeleted();
		}
		else if(field.equalsIgnoreCase(JOBORDERID)) {
			value = jobSubmission.getJobOrderID();
		}
		else if(field.equalsIgnoreCase(JOBSUBMISSIONID)) {
			value = jobSubmission.getJobSubmissionID();
		}
		else if(field.equalsIgnoreCase(MIGRATEGUID)) {
			value = jobSubmission.getMigrateGUID();
		}
		else if(field.equalsIgnoreCase(SENDINGUSERID)) {
			value = jobSubmission.getSendingUserID();
		}
		else if(field.equalsIgnoreCase(SOURCE)) {
			value = jobSubmission.getSource();
		}
		else if(field.equalsIgnoreCase(STATUS)) {
			value = jobSubmission.getStatus();
		}
		else {
			throw new NoSuchMethodException();
		}
		
		return value;
	}
	
	private String CANDIDATEID="candidateID";
    private String DATEADDED="dateAdded";
    private String ISDELETED="isDeleted";
    private String JOBORDERID="jobOrderID";
    private String JOBSUBMISSIONID="jobSubmissionID";
    private String MIGRATEGUID="migrateGUID";
    private String SENDINGUSERID="sendingUserID";
    private String SOURCE="source";
    private String STATUS="status";

}
