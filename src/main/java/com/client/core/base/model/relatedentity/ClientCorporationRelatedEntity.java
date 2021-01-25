package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ClientCorporationRelatedEntity implements BullhornRelatedEntity {
    CLIENT_CORPORATION("id", "name")
    ;

    private final Set<String> standardFields;

    ClientCorporationRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
