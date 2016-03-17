package com.client.core.formtrigger.model.helper.impl;

import java.util.List;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormPlacementDto;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * @author magnus.palm
 */
public class PlacementFormTriggerHelper extends AbstractFormTriggerHelper<FormPlacementDto, Placement> {

	private List<PlacementCommission> commissions;
	private CorporateUser jobOwner;
	private Candidate candidate;
	private ClientCorporation clientCorpration;
	private JobOrder job;

	public PlacementFormTriggerHelper(FormPlacementDto formPlacementDto, Integer updatingUserID, BullhornData bullhornData) {
		super(formPlacementDto, updatingUserID, bullhornData);
	}

    public PlacementFormTriggerHelper(Placement placement, Integer updatingUserID, BullhornData bullhornData) {
        super(FormPlacementDto.instantiateFromPlacement(placement), updatingUserID, bullhornData);
        this.newEntity = placement;
    }

	public JobOrder getJob() {
		if (job == null) {
			setJob(findJobOrder(getFormValues().getJobPostingID()));
		}

		return job;
	}

	public void setJob(JobOrder job) {
		this.job = job;
	}

	public List<PlacementCommission> getCommissions() {
		if (commissions == null) {
			setCommissions(getCommissions(getFormValues().getPlacementID()));
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
			setCandidate(findCandidate(getFormValues().getUserID()));
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

}
