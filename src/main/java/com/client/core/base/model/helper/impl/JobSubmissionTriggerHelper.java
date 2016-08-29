package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formJobSubmissionDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class JobSubmissionTriggerHelper extends AbstractTriggerHelper<JobSubmission> {

	private CorporateUser jobOwner;
	private ClientCorporation clientCorpration;
	private JobOrder job;
	private Candidate candidate;

	public JobSubmissionTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public void setNewEntity(JobSubmission newDto) {
		this.newEntity = newDto;
	}

	@Override
	public JobSubmission getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findJobSubmission(getNewEntity().getId()));
		}
		return oldEntity;
	}

	@Override
	public void setOldEntity(JobSubmission oldDto) {
		this.oldEntity = oldDto;
	}

	/**
	 * Returns the job connected to the job submission.
	 * 
	 * @return
	 */
	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getNewEntity().getJobOrder().getId()));
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
			setClientCorporation(findClientCorporation(getJob().getClientCorporation().getId()));
		}

		return clientCorpration;
	}

	public void setClientCorporation(ClientCorporation clientCorpration) {
		this.clientCorpration = clientCorpration;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getNewEntity().getCandidate().getId()));
		}

		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}