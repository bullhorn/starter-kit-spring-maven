package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum JobSubmissionRelatedEntity implements BullhornRelatedEntity {
    JOB_SUBMISSION("id", "candidate(id,name)", "jobOrder(id,title)", "status", "sendingUser(id,name)"),
    SENDING_USER("id", "name"),
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    JOB_OWNER("id", "name", "email"),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    JobSubmissionRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
