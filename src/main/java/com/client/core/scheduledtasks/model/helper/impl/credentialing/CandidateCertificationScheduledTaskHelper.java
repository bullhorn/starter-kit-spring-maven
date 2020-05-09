package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */

public class CandidateCertificationScheduledTaskHelper extends AbstractScheduledTaskHelper<CandidateCertification> {

    private Candidate candidate;
    private Certification certification;
    private CorporateUser modifyingUser;

    public CandidateCertificationScheduledTaskHelper(CustomSubscriptionEvent event) {
        super(event, CandidateCertification.class);
    }


    public CandidateCertification getCandidateCertification() {
        return getEntity();
    }


    public Candidate getCandidate() {
        if (candidate == null) {
            setCandidate(findCandidate(getCandidateCertification().getCandidate().getId()));
        }
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }


    public Certification getCertification() {
        if (certification == null) {
            setCertification(findCertification(getCandidateCertification().getCertification().getId()));
        }
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }


    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            setModifyingUser(findCorporateUser(getCandidateCertification().getModifyingUser().getId()));
        }
        return modifyingUser;
    }

    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    @Override
    public String toString() {
        return new StringBuilder("CandidateCertificationScheduledTaskHelper {")
                .append("\n\t\"candidate\": ")
                .append(candidate)
                .append(",\n\t\"modifyingUser\": ")
                .append(modifyingUser)
                .append('}')
                .toString();
    }
}
