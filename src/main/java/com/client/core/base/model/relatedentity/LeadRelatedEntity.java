package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum LeadRelatedEntity implements BullhornRelatedEntity {
    LEAD("id", "name", "email", "phone", "clientCorporation(id,name)", "owner(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    LEAD_OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    LeadRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
