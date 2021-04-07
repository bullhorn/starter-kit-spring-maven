package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ClientContactRelatedEntity implements BullhornRelatedEntity {
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)", "owner(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    CLIENT_CONTACT_OWNER("id", "name", "email")
    ;

    private final Set<String> standardFields;

    ClientContactRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
