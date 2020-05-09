package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */

public class JobSubmissionCertificationRequirementScheduledTaskHelper extends AbstractScheduledTaskHelper<JobSubmissionCertificationRequirement> {

    private JobSubmission jobSubmission;
    private CandidateCertification candidateCertification;
    private Certification certification;
    private CorporateUser modifyingUser;
    private CorporateUser owner;

    public JobSubmissionCertificationRequirementScheduledTaskHelper(CustomSubscriptionEvent event) {
        super(event, JobSubmissionCertificationRequirement.class);
    }


    public JobSubmissionCertificationRequirement getJobSubmissionCertificationRequirement() {
        return getEntity();
    }


    public JobSubmission getJobSubmission() {
        if (jobSubmission == null) {
            setJobSubmission(findJobSubmission(getJobSubmissionCertificationRequirement().getJobSubmission().getId()));
        }
        return jobSubmission;
    }

    public void setJobSubmission(JobSubmission jobSubmission) {
        this.jobSubmission = jobSubmission;
    }

    public CandidateCertification getCandidateCertification() {
        if (candidateCertification == null) {
            setCandidateCertification(findCandidateCertification(getJobSubmissionCertificationRequirement().getCandidateCertification().getId()));
        }
        return candidateCertification;
    }

    public void setCandidateCertification(CandidateCertification candidateCertification) {
        this.candidateCertification = candidateCertification;
    }

    public Certification getCertification() {
        if (certification == null) {
            setCertification(findCertification(getJobSubmissionCertificationRequirement().getCertification().getId()));
        }
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            setModifyingUser(findCorporateUser(getJobSubmissionCertificationRequirement().getModifyingUser().getId()));
        }
        return modifyingUser;
    }

    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    public CorporateUser getOwner() {
        if (owner == null) {
            setOwner(findCorporateUser(getJobSubmissionCertificationRequirement().getOwner().getId()));
        }
        return owner;
    }

    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "JobSubmissionCertificationRequirementScheduledTaskHelper{" +
                "jobSubmission=" + jobSubmission +
                ", candidateCertification=" + candidateCertification +
                ", certification=" + certification +
                ", modifyingUser=" + modifyingUser +
                ", owner=" + owner +
                '}';
    }
}
