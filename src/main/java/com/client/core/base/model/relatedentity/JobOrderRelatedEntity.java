package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum JobOrderRelatedEntity implements BullhornRelatedEntity {
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    JOB_OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    JobOrderRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
