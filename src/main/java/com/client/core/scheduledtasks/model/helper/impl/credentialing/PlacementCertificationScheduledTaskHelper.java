package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.credentialing.PlacementCertificationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class PlacementCertificationScheduledTaskHelper extends AbstractScheduledTaskHelper<PlacementCertification> {

    private Placement placement;
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

    public PlacementCertificationScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event, PlacementCertification.class, PlacementCertificationRelatedEntity.PLACEMENT_CERTIFICATION_REQUIREMENT, relatedEntityFields);
    }


    public PlacementCertification getPlacementCertification() {
        return getEntity();
    }

    public Placement getPlacement() {
        if (placement == null) {
            this.placement = findPlacement(getPlacementCertification().getPlacement().getId(), PlacementCertificationRelatedEntity.PLACEMENT);
        }
        
        return placement;
    }

    public JobSubmission getJobSubmission() {
        if (jobSubmission == null) {
            this.jobSubmission = findJobSubmission(getPlacement().getJobSubmission().getId(),
                    PlacementCertificationRelatedEntity.JOB_SUBMISSION);
        }

        return jobSubmission;
    }

    public CorporateUser getJobSubmissionSendingUser() {
        if (jobSubmissionSendingUser == null) {
            this.jobSubmissionSendingUser = findCorporateUser(getJobSubmission().getSendingUser().getId(),
                    PlacementCertificationRelatedEntity.JOB_SUBMISSION_SENDING_USER);
        }

        return jobSubmissionSendingUser;
    }

    public Candidate getCandidate() {
        if (candidate == null) {
            this.candidate = findCandidate(getPlacement().getCandidate().getId(),
                    PlacementCertificationRelatedEntity.CANDIDATE);
        }

        return candidate;
    }

    public CorporateUser getCandidateOwner() {
        if (candidateOwner == null) {
            this.candidateOwner = findCorporateUser(getCandidate().getOwner().getId(),
                    PlacementCertificationRelatedEntity.CANDIDATE_OWNER);
        }

        return candidateOwner;
    }

    public JobOrder getJobOrder() {
        if (jobOrder == null) {
            this.jobOrder = findJobOrder(getPlacement().getJobOrder().getId(),
                    PlacementCertificationRelatedEntity.JOB_ORDER);
        }

        return jobOrder;
    }

    public CorporateUser getJobOwner() {
        if (jobOwner == null) {
            this.jobOwner = findCorporateUser(getJobOrder().getOwner().getId(),
                    PlacementCertificationRelatedEntity.JOB_OWNER);
        }

        return jobOwner;
    }

    public ClientContact getClientContact() {
        if (clientContact == null) {
            this.clientContact = findClientContact(getJobOrder().getClientContact().getId(),
                    PlacementCertificationRelatedEntity.CLIENT_CONTACT);
        }

        return clientContact;
    }

    public ClientCorporation getClientCorporation() {
        if (clientCorporation == null) {
            this.clientCorporation = findClientCorporation(getJobOrder().getClientCorporation().getId(),
                    PlacementCertificationRelatedEntity.CLIENT_CORPORATION);
        }

        return clientCorporation;
    }

    public CandidateCertification getCandidateCertification() {
        if (candidateCertification == null) {
            this.candidateCertification = findCandidateCertification(getPlacementCertification().getCandidateCertification().getId(),
                    PlacementCertificationRelatedEntity.CANDIDATE_CERTIFICATION);
        }

        return candidateCertification;
    }

    public Certification getCertification() {
        if (certification == null) {
            this.certification = findCertification(getPlacementCertification().getCertification().getId(),
                    PlacementCertificationRelatedEntity.CERTIFICATION);
        }

        return certification;
    }

    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            this.modifyingUser = findCorporateUser(getPlacementCertification().getModifyingUser().getId(),
                    PlacementCertificationRelatedEntity.MODIFYING_USER);
        }

        return modifyingUser;
    }

    public CorporateUser getOwner() {
        if (owner == null) {
            this.owner = findCorporateUser(getPlacementCertification().getOwner().getId(),
                    PlacementCertificationRelatedEntity.OWNER);
        }

        return owner;
    }

}
