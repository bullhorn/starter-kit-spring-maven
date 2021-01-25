package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum CandidateReferenceRelatedEntity implements BullhornRelatedEntity {
    CANDIDATE_REFERENCE(
            "candidate(id,name)", "clientCorporation(id,name)", "companyName", "candidateTitle", "jobOrder(id,title)",
            "referenceClientContact(id,name)", "referenceFirstName", "referenceLastName", "referenceEmail", "referenceTitle"
    ),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_OWNER("id", "name", "email"),
    CLIENT_CORPORATION("id", "name"),
    JOB_ORDER("id", "title"),
    REFERENCE_CLIENT_CONTACT("id", "name", "clientCorporation(id,name)")
    ;

    private final Set<String> standardFields;

    CandidateReferenceRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
