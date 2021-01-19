package com.client.core.base.model.helper.impl;

import java.util.List;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * 
 * 
 * @author magnus.palm
 * 
 * 
 */
public abstract class PlacementChangeRequestTriggerHelper extends AbstractTriggerHelper<PlacementChangeRequest> {

	private List<PlacementCommission> commissions;
	private Placement placement;
	private CorporateUser jobOwner;
	private Candidate candidate;
	private ClientCorporation clientCorpration;
	private JobOrder job;

	public PlacementChangeRequestTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	public Placement getPlacement() {
		if (placement == null) {
			setPlacement(findPlacement(getNewEntity().getPlacement().getId()));
		}

		return placement;
	}

	public void setPlacement(Placement placement) {
		this.placement = placement;
	}

	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getPlacement().getJobOrder().getId()));
		}

		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}

	public List<PlacementCommission> getCommissions() {
		if (commissions == null) {
			setCommissions(getCommissions(getNewEntity().getPlacement().getId()));
		}

		return commissions;
	}

	public void setCommissions(List<PlacementCommission> commissions) {
		this.commissions = commissions;
	}

	public CorporateUser getJobOwner() {
		if (jobOwner == null) {
			setJobOwner(findCorporateUser(getJob().getOwner().getId()));
		}

		return jobOwner;
	}

	public void setJobOwner(CorporateUser jobOwner) {
		this.jobOwner = jobOwner;
	}

	public Candidate getCandidate() {
		if (candidate == null) {
			setCandidate(findCandidate(getPlacement().getCandidate().getId()));
		}

		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public ClientCorporation getClientCorpration() {
		if (clientCorpration == null) {
			setClientCorpration(findClientCorporation(getJob().getClientCorporation().getId()));
		}

		return clientCorpration;
	}

	public void setClientCorpration(ClientCorporation clientCorpration) {
		this.clientCorpration = clientCorpration;
	}

	@Override
	public void setNewEntity(PlacementChangeRequest newEntity) {
		this.newEntity = newEntity;
	}

	@Override
	public PlacementChangeRequest getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findPlacementChangeRequest(getNewEntity().getId()));
		}

		return oldEntity;
	}

	@Override
	public void setOldEntity(PlacementChangeRequest oldEntity) {
		this.oldEntity = oldEntity;
	}

}
