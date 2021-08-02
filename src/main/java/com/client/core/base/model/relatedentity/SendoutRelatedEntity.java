package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum SendoutRelatedEntity implements BullhornRelatedEntity {
    SENDOUT(
            "id", "candidate(id,name)", "jobOrder(id,title)", "user(id,name)", "clientContact(id,name)",
            "clientCorporation(id,name)", "jobSubmission(id,status)"
    ),
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    JOB_ORDER_CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    JOB_ORDER_CLIENT_CORPORATION("id", "name"),
    JOB_OWNER("id", "name", "email"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_OWNER("id", "name", "email"),
    USER("id", "name"),
    JOB_SUBMISSION("id", "candidate(id,name)", "jobOrder(id,title)", "status");

    private final Set<String> standardFields;

    SendoutRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
