package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CandidateEducationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;


public class CandidateEducationScheduledTaskHelper extends AbstractScheduledTaskHelper<CandidateEducation> {

	private Candidate candidate;
	private CorporateUser candidateOwner;

	public CandidateEducationScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, CandidateEducation.class, CandidateEducationRelatedEntity.CANDIDATE_EDUCATION, relatedEntityFields);
	}

	public CandidateEducation getCandidateEducation() {
        return getEntity();
    }

	public Candidate getCandidate() {
		if (candidate == null) {
			this.candidate = findCandidate(getCandidateEducation().getCandidate().getId(), CandidateEducationRelatedEntity.CANDIDATE);
		}
		return candidate;
	}

	public CorporateUser getCandidateOwner() {
		if (candidateOwner == null) {
			this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), CandidateEducationRelatedEntity.CANDIDATE_OWNER);
		}
		return candidateOwner;
	}

}
