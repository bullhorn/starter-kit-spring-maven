package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.CandidateCertificationRequirementRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class CandidateCertificationRequirementScheduledTaskHelper extends AbstractScheduledTaskHelper<CandidateCertificationRequirement> {

    private Candidate candidate;
    private CorporateUser candidateOwner;
    private CandidateCertification candidateCertification;
    private Certification certification;
    private CorporateUser modifyingUser;
    private CorporateUser owner;

    public CandidateCertificationRequirementScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event, CandidateCertificationRequirement.class, CandidateCertificationRequirementRelatedEntity.CANDIDATE_CERTIFICATION_REQUIREMENT, relatedEntityFields);
    }

    public CandidateCertificationRequirement getCandidateCertificationRequirement() {
        return getEntity();
    }

    public Candidate getCandidate() {
        if (candidate == null) {
            this.candidate = findCandidate(getCandidateCertificationRequirement().getCandidate().getId(), CandidateCertificationRequirementRelatedEntity.CANDIDATE);
        }

        return candidate;
    }

    public CorporateUser getCandidateOwner() {
        if (candidateOwner == null) {
            this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(), CandidateCertificationRequirementRelatedEntity.CANDIDATE_OWNER);
        }

        return candidateOwner;
    }

    public CandidateCertification getCandidateCertification() {
        if (candidateCertification == null) {
            this.candidateCertification = findCandidateCertification(getCandidateCertificationRequirement().getCandidateCertification().getId(), CandidateCertificationRequirementRelatedEntity.CANDIDATE_CERTIFICATION);
        }

        return candidateCertification;
    }

    public Certification getCertification() {
        if (certification == null) {
            this.certification = findCertification(getCandidateCertificationRequirement().getCertification().getId(), CandidateCertificationRequirementRelatedEntity.CERTIFICATION);
        }

        return certification;
    }

    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            this.modifyingUser = findCorporateUser(getCandidateCertificationRequirement().getModifyingUser().getId(), CandidateCertificationRequirementRelatedEntity.MODIFYING_USER);
        }

        return modifyingUser;
    }

    public CorporateUser getOwner() {
        if (owner == null) {
            this.owner = findCorporateUser(getCandidateCertificationRequirement().getOwner().getId(), CandidateCertificationRequirementRelatedEntity.OWNER);
        }

        return owner;
    }

}
