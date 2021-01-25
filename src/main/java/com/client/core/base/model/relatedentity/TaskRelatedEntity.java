package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum TaskRelatedEntity implements BullhornRelatedEntity {
    TASK(
            "dateBegin", "dateEnd", "isCompleted", "subject", "type", "placement(id,status)", "jobOrder(id,title)",
            "jobSubmission(id,status)", "candidate(id,name)", "owner(id,name)", "clientContact(id,name)", "lead(id,name)", "opportunity(id,title)"
    ),
    JOB_SUBMISSION("id", "candidate(id,name)", "jobOrder(id,title)", "status"),
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    PLACEMENT(
            "id", "status", "dateBegin", "dateEnd", "payRate", "clientBillRate", "employmentType", "jobSubmission(id,status)",
            "jobOrder(id,title)", "candidate(id,name)"
    ),
    TASK_OWNER("id", "name", "email"),
    LEAD("id", "name", "email", "phone", "clientCorporation(id,name)", "owner(id,name)"),
    OPPORTUNITY("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)")
    ;

    private final Set<String> standardFields;

    TaskRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
