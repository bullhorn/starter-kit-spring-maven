package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormJobSubmissionDto;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobSubmissionDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class JobSubmissionFormTriggerHelper extends AbstractFormTriggerHelper<FormJobSubmissionDto, JobSubmission> {

	private CorporateUser jobOwner;
	private ClientCorporation clientCorpration;
	private JobOrder job;
	private Candidate candidate;

	public JobSubmissionFormTriggerHelper(FormJobSubmissionDto formJobSubmissionDto, Integer updatingUserID, BullhornData bullhornData) {
		super(formJobSubmissionDto, updatingUserID, bullhornData);

	}

	/**
	 * Returns the job connected to the job submission.
	 * 
	 * @return
	 */
	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getFormValues().getJobPostingID()));
		}

		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}

	/**
	 * Returns the owner of the job connected to the job submission
	 * 
	 * @return
	 */
	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			setJobOwner(findCorporateUser(getJob().getOwner().getId()));
		}

		return jobOwner;
	}

	public void setJobOwner(CorporateUser jobOwner) {
		this.jobOwner = jobOwner;
	}

	/**
	 * Returns the client corporation connected to the job connected to the job submission
	 * 
	 * @return
	 */
	public ClientCorporation getClientCorpration() {
		if (clientCorpration == null) {
			setClientCorpration(findClientCorporation(getJob().getClientCorporation().getId()));
		}

		return clientCorpration;
	}

	public void setClientCorpration(ClientCorporation clientCorpration) {
		this.clientCorpration = clientCorpration;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getFormValues().getUserID()));
		}

		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}