package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum OpportunityRelatedEntity implements BullhornRelatedEntity {
    OPPORTUNITY("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    OPPORTUNITY_OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    OpportunityRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
