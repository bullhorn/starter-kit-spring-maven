package com.client.core.resttrigger.model.form.impl;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.client.core.resttrigger.model.form.RestFormEntity;

public class CandidateRestFormEntity extends RestFormEntity<Candidate> {

    private String firstName;
    private String lastName;

    public CandidateRestFormEntity() {
        super();
    }

    @Override
    public Candidate create() {
        Candidate candidate = new Candidate();

        candidate.setFirstName(firstName);
        candidate.setLastName(lastName);

        return candidate;
    }

}
