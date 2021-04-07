package com.client.core.base.model.relatedentity.credentialing;

import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.google.common.collect.Sets;

import java.util.Set;

public enum CandidateCertificationRelatedEntity implements BullhornRelatedEntity {
    CANDIDATE_CERTIFICATION(
            "id", "licenseType", "licenseNumber", "location", "name", "status", "candidate(id,name)",
            "certification(id,name)", "modifyingUser(id,name,email)"
    ),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CERTIFICATION("id", "description", "name", "state"),
    CANDIDATE_OWNER("id", "name", "email"),
    MODIFYING_USER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    CandidateCertificationRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
