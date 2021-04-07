package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.certificationrequirement.JobSubmissionCertificationRequirement;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.JobSubmissionCertificationRequirementRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class JobSubmissionCertificationRequirementScheduledTaskHelper extends AbstractScheduledTaskHelper<JobSubmissionCertificationRequirement> {

    private JobSubmission jobSubmission;
    private CorporateUser jobSubmissionSendingUser;
    private Candidate candidate;
    private CorporateUser candidateOwner;
    private JobOrder jobOrder;
    private CorporateUser jobOwner;
    private ClientContact clientContact;
    private ClientCorporation clientCorporation;
    private CandidateCertification candidateCertification;
    private Certification certification;
    private CorporateUser modifyingUser;
    private CorporateUser owner;

    public JobSubmissionCertificationRequirementScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event, JobSubmissionCertificationRequirement.class, JobSubmissionCertificationRequirementRelatedEntity.JOB_SUBMISSION_CERTIFICATION_REQUIREMENT, relatedEntityFields);
    }

    public JobSubmissionCertificationRequirement getJobSubmissionCertificationRequirement() {
        return getEntity();
    }

    public JobSubmission getJobSubmission() {
        if (jobSubmission == null) {
            this.jobSubmission = findJobSubmission(getJobSubmissionCertificationRequirement().getJobSubmission().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.JOB_SUBMISSION);
        }

        return jobSubmission;
    }

    public CorporateUser getJobSubmissionSendingUser() {
        if (jobSubmissionSendingUser == null) {
            this.jobSubmissionSendingUser = findCorporateUser(getJobSubmission().getSendingUser().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.JOB_SUBMISSION_SENDING_USER);
        }

        return jobSubmissionSendingUser;
    }

    public Candidate getCandidate() {
        if (candidate == null) {
            this.candidate = findCandidate(getJobSubmission().getCandidate().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.CANDIDATE);
        }

        return candidate;
    }

    public CorporateUser getCandidateOwner() {
        if (candidateOwner == null) {
            this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.CANDIDATE_OWNER);
        }

        return candidateOwner;
    }

    public JobOrder getJobOrder() {
        if (jobOrder == null) {
            this.jobOrder = findJobOrder(getJobSubmission().getJobOrder().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.JOB_ORDER);
        }

        return jobOrder;
    }

    public CorporateUser getJobOwner() {
        if (jobOwner == null) {
            this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.JOB_OWNER);
        }

        return jobOwner;
    }

    public ClientContact getClientContact() {
        if (clientContact == null) {
            this.clientContact = findClientContact(getJobOrder().getClientContact().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.CLIENT_CONTACT);
        }

        return clientContact;
    }

    public ClientCorporation getClientCorporation() {
        if (clientCorporation == null) {
            this.clientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.CLIENT_CORPORATION);
        }

        return clientCorporation;
    }

    public CandidateCertification getCandidateCertification() {
        if (candidateCertification == null) {
            this.candidateCertification = findCandidateCertification(getJobSubmissionCertificationRequirement().getCandidateCertification().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.CANDIDATE_CERTIFICATION);
        }

        return candidateCertification;
    }

    public Certification getCertification() {
        if (certification == null) {
            this.certification = findCertification(getJobSubmissionCertificationRequirement().getCertification().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.CERTIFICATION);
        }

        return certification;
    }

    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            this.modifyingUser = findCorporateUser(getJobSubmissionCertificationRequirement().getModifyingUser().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.MODIFYING_USER);
        }

        return modifyingUser;
    }

    public CorporateUser getOwner() {
        if (owner == null) {
            this.owner = findCorporateUser(getJobSubmissionCertificationRequirement().getOwner().getId(),
                    JobSubmissionCertificationRequirementRelatedEntity.OWNER);
        }

        return owner;
    }

}
