package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum AppointmentRelatedEntity implements BullhornRelatedEntity {
    APPOINTMENT(
            "id", "type", "candidateReference(id,name)", "clientContactReference(id,name)", "jobOrder(id,title)",
            "lead(id,name)", "opportunity(id,title)", "placement(id,status,employmentType,candidate(id,name),jobOrder(id,title))"
    ),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    OPPORTUNITY("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    PLACEMENT(
            "id", "status", "dateBegin", "dateEnd", "payRate", "clientBillRate", "employmentType", "jobSubmission(id,status)",
            "jobOrder(id,title)", "candidate(id,name)"
    ),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    APPOINTMENT_OWNER("id", "name", "email"),
    LEAD("id", "name", "email", "phone", "clientCorporation(id,name)"),
    ;

    private final Set<String> standardFields;

    AppointmentRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
