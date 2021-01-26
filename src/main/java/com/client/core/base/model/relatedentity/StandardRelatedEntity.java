package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum StandardRelatedEntity implements BullhornRelatedEntity {
    UPDATING_USER("id", "name", "email", "userType(id,name)"),
    UPDATING_USER_USERTYPE("id", "name"),
    ;

    private final Set<String> defaultFields;

    StandardRelatedEntity(String... defaultFields) {
        this.defaultFields = Sets.newHashSet(defaultFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return defaultFields;
    }

}
