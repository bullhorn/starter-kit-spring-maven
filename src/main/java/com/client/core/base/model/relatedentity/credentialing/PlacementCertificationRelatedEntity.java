package com.client.core.base.model.relatedentity.credentialing;

import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.google.common.collect.Sets;

import java.util.Set;

public enum PlacementCertificationRelatedEntity implements BullhornRelatedEntity {
    PLACEMENT_CERTIFICATION_REQUIREMENT(
            "candidateCertificationName", "candidateCertificationStatus", "placement(id,status)", "candidateCertification(id,name)",
            "certification(id,name)", "modifyingUser(id,name,email)", "owner(id,name,email)"
    ),
    PLACEMENT(
            "id", "status", "dateBegin", "dateEnd", "payRate", "clientBillRate", "employmentType", "jobSubmission(id,status)",
            "jobOrder(id,title)", "candidate(id,name)"
    ),
    JOB_SUBMISSION("id", "status", "sendingUser(id,name)"),
    JOB_SUBMISSION_SENDING_USER("id", "name", "email"),
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

    PlacementCertificationRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
