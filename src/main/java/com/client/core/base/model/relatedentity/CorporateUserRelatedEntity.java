package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum CorporateUserRelatedEntity implements BullhornRelatedEntity {
    CORPORATE_USER("id", "name", "email", "userType(id,name)", "privateLabel(id,name)"),
    USERTYPE("id", "name"),
    PRIVATE_LABEL("id", "name")
    ;

    private final Set<String> standardFields;

    CorporateUserRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
