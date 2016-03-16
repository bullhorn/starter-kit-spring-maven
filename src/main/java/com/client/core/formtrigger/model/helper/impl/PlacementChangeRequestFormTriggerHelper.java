package com.client.core.formtrigger.model.helper.impl;

import java.util.List;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;
import com.client.core.formtrigger.model.form.impl.FormPlacementChangeRequestDto;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 *
 * @author magnus.palm
 */
public class PlacementChangeRequestFormTriggerHelper extends AbstractFormTriggerHelper<FormPlacementChangeRequestDto, PlacementChangeRequest> {

	private List<PlacementCommission> commissions;
	private Placement placement;
	private CorporateUser jobOwner;
	private Candidate candidate;
	private ClientCorporation clientCorpration;
	private JobOrder job;

	public PlacementChangeRequestFormTriggerHelper(FormPlacementChangeRequestDto formPlacementChangeRequestDto, Integer updatingUserID,
			BullhornData bullhornData) {
		super(formPlacementChangeRequestDto, updatingUserID, bullhornData);
	}

	public Placement getPlacement() {
		if (placement == null) {
			setPlacement(findPlacement(getFormValues().getPlacementID()));
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

}
