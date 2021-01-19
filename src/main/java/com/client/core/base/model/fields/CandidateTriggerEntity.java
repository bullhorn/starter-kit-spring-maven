package com.client.core.base.model.fields;

import com.google.common.collect.Sets;

import java.util.Set;

public enum CandidateTriggerEntity implements RelatedTriggerEntity {
    CANDIDATE("id", "firstName", "lastName", "email", "phone"),
    CANDIDATE_OWNER("id", "firstName", "lastName", "email")
    ;

    private final Set<String> standardFields;

    CandidateTriggerEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getStandardFields() {
        return standardFields;
    }

}
