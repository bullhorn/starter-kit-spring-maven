package com.client.custom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by john.sullivan on 6/6/2016.
 */
@Component
public class CustomSettings {

    @Value("${candidate.status.active}")
    private String candidateStatusActive;

    @Value("${placement.status.approved}")
    private String placementStatusApproved;

    public String getCandidateStatusActive() {
        return candidateStatusActive;
    }

    public void setCandidateStatusActive(String candidateStatusActive) {
        this.candidateStatusActive = candidateStatusActive;
    }

    public String getPlacementStatusApproved() {
        return placementStatusApproved;
    }

    public void setPlacementStatusApproved(String placementStatusApproved) {
        this.placementStatusApproved = placementStatusApproved;
    }
}