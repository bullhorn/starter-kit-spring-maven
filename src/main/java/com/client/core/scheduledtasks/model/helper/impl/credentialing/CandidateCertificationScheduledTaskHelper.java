package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.CandidateCertificationRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.CandidateCertificationRequirementRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class CandidateCertificationScheduledTaskHelper extends AbstractScheduledTaskHelper<CandidateCertification> {

    private Candidate candidate;
    private CorporateUser candidateOwner;
    private Certification certification;
    private CorporateUser modifyingUser;

    public CandidateCertificationScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event, CandidateCertification.class, CandidateCertificationRelatedEntity.CANDIDATE_CERTIFICATION, relatedEntityFields);
    }

    public CandidateCertification getCandidateCertification() {
        return getEntity();
    }

    public Candidate getCandidate() {
        if (candidate == null) {
            this.candidate = findCandidate(getCandidateCertification().getCandidate().getId(), CandidateCertificationRelatedEntity.CANDIDATE);
        }

        return candidate;
    }

    public CorporateUser getCandidateOwner() {
        if (candidateOwner == null) {
            this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), CandidateCertificationRelatedEntity.CANDIDATE_OWNER);
        }

        return candidateOwner;
    }

    public Certification getCertification() {
        if (certification == null) {
            this.certification = findCertification(getCandidateCertification().getCertification().getId(), CandidateCertificationRelatedEntity.CERTIFICATION);
        }

        return certification;
    }

    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            this.modifyingUser = findCorporateUser(getCandidateCertification().getModifyingUser().getId(), CandidateCertificationRelatedEntity.MODIFYING_USER);
        }
        return modifyingUser;
    }

}
