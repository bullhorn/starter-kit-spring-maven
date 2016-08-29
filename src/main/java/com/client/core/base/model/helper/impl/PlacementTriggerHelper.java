package com.client.core.base.model.helper.impl;

import java.util.List;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * @author magnus.palm
 * 
 * 
 */
public abstract class PlacementTriggerHelper extends AbstractTriggerHelper<Placement> {

	private List<PlacementCommission> commissions;
	private CorporateUser jobOwner;
	private Candidate candidate;
    private ClientContact clientContact;
	private ClientCorporation clientCorpration;
	private JobOrder job;

	public PlacementTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getNewEntity().getJobOrder().getId()));
		}

		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}

	public List<PlacementCommission> getCommissions() {
		if (commissions == null) {
			setCommissions(getCommissions(getNewEntity().getId()));
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
			setCandidate(findCandidate(getNewEntity().getCandidate().getId()));
		}

		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

    public ClientContact getClientContact() {
        if (clientContact == null) {
            setClientContact(findClientContact(getJob().getClientContact().getId()));
        }

        return clientContact;
    }

    public void setClientContact(ClientContact clientContact) {
        this.clientContact = clientContact;
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
	public void setNewEntity(Placement newDto) {
		this.newEntity = newDto;
	}

	@Override
	public Placement getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findPlacement(getNewEntity().getId()));
		}

		return oldEntity;
	}

	@Override
	public void setOldEntity(Placement oldDto) {
		this.oldEntity = oldDto;
	}

}
