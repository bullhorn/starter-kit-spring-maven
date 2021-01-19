package com.client.core.base.model.fields;

import com.google.common.collect.Sets;

import java.util.Set;

public enum StandardTriggerEntity implements RelatedTriggerEntity {
    UPDATING_USER("id", "firstName", "lastName", "email"),
    UPDATING_USER_USERTYPE("id", "name"),
    ;

    private final Set<String> standardFields;

    StandardTriggerEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getStandardFields() {
        return standardFields;
    }

}
