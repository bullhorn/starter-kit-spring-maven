package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum CandidateRelatedEntity implements BullhornRelatedEntity {
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    CandidateRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
