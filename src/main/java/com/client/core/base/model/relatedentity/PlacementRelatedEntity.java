package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum PlacementRelatedEntity implements BullhornRelatedEntity {
    PLACEMENT(
            "id", "status", "dateBegin", "dateEnd", "payRate", "clientBillRate", "employmentType", "jobSubmission(id,status)",
            "jobOrder(id,title)", "candidate(id,name)"
    ),
    JOB_SUBMISSION("id", "status", "sendingUser(id,name)"),
    JOB_SUBMISSION_SENDING_USER("id", "name", "email"),
    JOB_ORDER("id", "title", "employmentType", "clientContact(id,name)", "clientCorporation(id,name)", "owner(id,name)"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CLIENT_CORPORATION("id", "name"),
    JOB_OWNER("id", "name", "email"),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_OWNER("id", "name", "email"),
    COMMISSIONS("id", "commissionPercentage", "role", "user(id,name)")
    ;

    private final Set<String> standardFields;

    PlacementRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
