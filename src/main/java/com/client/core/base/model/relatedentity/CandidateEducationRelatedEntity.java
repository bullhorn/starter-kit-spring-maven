package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum CandidateEducationRelatedEntity implements BullhornRelatedEntity {
    CANDIDATE_EDUCATION(
            "id", "candidate(id,name)", "degree", "major", "gpa", "startDate", "endDate", "school"
    ),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    CandidateEducationRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
