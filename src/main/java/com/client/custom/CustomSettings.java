package com.client.custom;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

/**
 * Created by john.sullivan on 6/6/2016.
 */
@Component
public class CustomSettings {

    private String candidateStatusActive;

    private String placementStatusApproved;

    private List<String> placementStatusesCompleted;

    public String getCandidateStatusActive() {
        return candidateStatusActive;
    }

    @Value("${candidate.status.active}")
    public void setCandidateStatusActive(String candidateStatusActive) {
        this.candidateStatusActive = candidateStatusActive;
    }

    public String getPlacementStatusApproved() {
        return placementStatusApproved;
    }

    @Value("${placement.status.approved}")
    public void setPlacementStatusApproved(String placementStatusApproved) {
        this.placementStatusApproved = placementStatusApproved;
    }

    public List<String> getPlacementStatusesCompleted() {
        return placementStatusesCompleted;
    }

    @Value("${placement.statuses.completed}")
    public void setPlacementStatusesCompleted(String[] placementStatusesCompleted) {
        this.placementStatusesCompleted = Lists.newArrayList(placementStatusesCompleted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomSettings)) return false;

        CustomSettings that = (CustomSettings) o;

        if (candidateStatusActive != null ? !candidateStatusActive.equals(that.candidateStatusActive) : that.candidateStatusActive != null)
            return false;
        if (placementStatusApproved != null ? !placementStatusApproved.equals(that.placementStatusApproved) : that.placementStatusApproved != null)
            return false;
        return placementStatusesCompleted != null ? placementStatusesCompleted.equals(that.placementStatusesCompleted) : that.placementStatusesCompleted == null;
    }

    @Override
    public int hashCode() {
        int result = candidateStatusActive != null ? candidateStatusActive.hashCode() : 0;
        result = 31 * result + (placementStatusApproved != null ? placementStatusApproved.hashCode() : 0);
        result = 31 * result + (placementStatusesCompleted != null ? placementStatusesCompleted.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("CustomSettings {")
                .append("\n\t\"candidateStatusActive\": ")
                .append("'")
                .append(candidateStatusActive).append('\'')
                .append(",\n\t\"placementStatusApproved\": ")
                .append("'")
                .append(placementStatusApproved).append('\'')
                .append(",\n\t\"placementStatusesCompleted\": ")
                .append(placementStatusesCompleted)
                .append('}')
                .toString();
    }
}