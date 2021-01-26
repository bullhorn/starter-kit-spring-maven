package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum CandidateWorkHistoryRelatedEntity implements BullhornRelatedEntity {
    CANDIDATE_WORK_HISTORY(
            "candidate(id,name)", "clientCorporation(id,name)", "companyName", "endDate",
            "jobOrder(id,title)", "placement(id,status)", "startDate", "title"
    ),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CANDIDATE_OWNER("id", "name", "email"),
    CLIENT_CORPORATION("id", "name"),
    JOB_ORDER("id", "title"),
    PLACEMENT(
            "id", "status", "dateBegin", "dateEnd", "payRate", "clientBillRate", "employmentType"
    )
    ;

    private final Set<String> standardFields;

    CandidateWorkHistoryRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }

}
