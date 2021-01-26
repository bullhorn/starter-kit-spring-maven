package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum NoteRelatedEntity implements BullhornRelatedEntity {
    NOTE("id", "personReference(id,name)", "action", "commentingPerson(id,name)"),
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    PERSON_REFERENCE("id", "name", "personSubtype"),
    COMMENTING_PERSON("id", "name", "personSubtype")
    ;

    private final Set<String> standardFields;

    NoteRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
