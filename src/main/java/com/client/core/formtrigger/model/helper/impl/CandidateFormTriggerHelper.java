package com.client.core.formtrigger.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.formtrigger.model.form.impl.FormCandidateDto;
import com.client.core.formtrigger.model.helper.AbstractFormTriggerHelper;

/**
 * Holds and keeps data needed for validations to minimize the number of API calls.
 * 
 * BullhornAPI, formCandidateDto and updatingUserID are required and therefore set to final.
 * 
 * @author magnus.palm
 * 
 */
public class CandidateFormTriggerHelper extends AbstractFormTriggerHelper<FormCandidateDto, Candidate> {

	private CorporateUser candidateOwner;

	public CandidateFormTriggerHelper(FormCandidateDto formCandidateDto, Integer updatingUserID, BullhornData bullhornData) {
		super(formCandidateDto, updatingUserID, bullhornData);
	}

    public CandidateFormTriggerHelper(Candidate candidate, Integer updatingUserID, BullhornData bullhornData) {
        super(FormCandidateDto.instantiateFromCandidate(candidate), updatingUserID, bullhornData);
        this.newEntity = candidate;
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
