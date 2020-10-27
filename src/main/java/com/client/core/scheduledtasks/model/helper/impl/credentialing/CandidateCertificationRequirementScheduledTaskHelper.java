package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.CandidateCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */

public class CandidateCertificationRequirementScheduledTaskHelper extends AbstractScheduledTaskHelper<CandidateCertificationRequirement> {

    private Candidate candidate;
    private CandidateCertification candidateCertification;
    private Certification certification;
    private CorporateUser modifyingUser;
    private CorporateUser owner;

    public CandidateCertificationRequirementScheduledTaskHelper(CustomSubscriptionEvent event) {
        super(event, CandidateCertificationRequirement.class);
    }


    public CandidateCertificationRequirement getCandidateCertificationRequirement() {
        return getEntity();
    }


    public Candidate getCandidate() {
        if (candidate == null) {
            setCandidate(findCandidate(getCandidateCertificationRequirement().getCandidate().getId()));
        }
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public CandidateCertification getCandidateCertification() {
        if (candidateCertification == null) {
            setCandidateCertification(findCandidateCertification(getCandidateCertificationRequirement().getCandidateCertification().getId()));
        }
        return candidateCertification;
    }

    public void setCandidateCertification(CandidateCertification candidateCertification) {
        this.candidateCertification = candidateCertification;
    }


    public Certification getCertification() {
        if (certification == null) {
            setCertification(findCertification(getCandidateCertificationRequirement().getCertification().getId()));
        }
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }


    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            setModifyingUser(findCorporateUser(getCandidateCertificationRequirement().getModifyingUser().getId()));
        }
        return modifyingUser;
    }

    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    public CorporateUser getOwner() {
        if (owner == null) {
            setOwner(findCorporateUser(getCandidateCertificationRequirement().getOwner().getId()));
        }
        return owner;
    }

    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "CandidateCertificationRequirementScheduledTaskHelper{" +
                "candidate=" + candidate +
                ", candidateCertification=" + candidateCertification +
                ", certification=" + certification +
                ", modifyingUser=" + modifyingUser +
                ", owner=" + owner +
                '}';
    }
}
