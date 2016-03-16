package com.client.core.soap.tools.property.setdtofields.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bullhorn.entity.job.JobSubmissionDto;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.util.Utility;

@Service("jobSubmissionSetService")
public class JobSubmissionDtoFieldSetService extends DtoFieldSetService<JobSubmissionDto> {

	public JobSubmissionDtoFieldSetService() {
		super();
	}
	
	@Override
	public JobSubmissionDto changeDto(JobSubmissionDto jobSubmission, Map<String, String> fieldValues,
			String dateFormat, Boolean isDotPrefixed) {
		for(String initialField : fieldValues.keySet()) {
			String value = fieldValues.get(initialField);

			String field = initialField;
			if(isDotPrefixed) {
				field = removeDotPrefix(initialField);
			}
			
			if(field.equalsIgnoreCase(CANDIDATEID)) {

				jobSubmission.setCandidateID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(DATEADDED)) {

				jobSubmission.setDateAdded(Utility.forceParseStringToXMLGregorianCalendar(value, dateFormat));

		    } else if(field.equalsIgnoreCase(ISDELETED)) {

				jobSubmission.setIsDeleted(Utility.parseBoolean(value));

		    } else if(field.equalsIgnoreCase(JOBORDERID)) {

				jobSubmission.setJobOrderID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(JOBSUBMISSIONID)) {

				jobSubmission.setJobSubmissionID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(MIGRATEGUID)) {

				jobSubmission.setMigrateGUID(value);

		    } else if(field.equalsIgnoreCase(SENDINGUSERID)) {

				jobSubmission.setSendingUserID(Utility.forceParseInteger(value));

		    } else if(field.equalsIgnoreCase(SOURCE)) {

				jobSubmission.setSource(value);

			} else if(field.equalsIgnoreCase(STATUS)) {

				jobSubmission.setStatus(value);
				
			}
		}
		
		return jobSubmission;
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
