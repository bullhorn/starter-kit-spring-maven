package com.client.core.base.model.relatedentity.credentialing;

import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.google.common.collect.Sets;

import java.util.Set;

public enum JobSubmissionCertificationRequirementRelatedEntity implements BullhornRelatedEntity {
    JOB_SUBMISSION_CERTIFICATION_REQUIREMENT(
            "userCertificationName", "userCertificationStatus", "jobSubmission(id,name)", "candidateCertification(id,name)",
            "certification(id,name)", "modifyingUser(id,name,email)", "owner(id,name,email)"
    ),
    JOB_SUBMISSION("id", "candidate(id,name)", "jobOrder(id,title)", "status", "sendingUser(id,name)"),
    JOB_SUBMISSION_SENDING_USER("id", "name"),
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    JOB_OWNER("id", "name", "email"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_CERTIFICATION(
            "id", "licenseType", "licenseNumber", "location", "name", "status"
    ),
    CANDIDATE_OWNER("id", "name", "email"),
    CERTIFICATION("id", "description", "name", "state"),
    MODIFYING_USER("id", "name", "email"),
    OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    JobSubmissionCertificationRequirementRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
