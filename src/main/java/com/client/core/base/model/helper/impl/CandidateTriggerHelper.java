package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formCandidateDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public abstract class CandidateTriggerHelper extends AbstractTriggerHelper<Candidate> {

	private CorporateUser candidateOwner;

	public CandidateTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
		super(updatingUserID, bullhornData);
	}

	@Override
	public Integer getUpdatingUserID() {
		return updatingUserID;
	}

	@Override
	public void setNewEntity(Candidate newEntity) {
		this.newEntity = newEntity;
	}

	@Override
	public Candidate getOldEntity() {
		if (oldEntity == null) {
			setOldEntity(findCandidate(getNewEntity().getId()));
		}
		return oldEntity;
	}

	@Override
	public void setOldEntity(Candidate oldEntity) {
		this.oldEntity = oldEntity;

	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			setCandidateOwner(findCorporateUser(getNewEntity().getOwner().getId()));
		}

		return candidateOwner;
	}

	public void setCandidateOwner(CorporateUser candidateOwner) {
		this.candidateOwner = candidateOwner;
	}

}
