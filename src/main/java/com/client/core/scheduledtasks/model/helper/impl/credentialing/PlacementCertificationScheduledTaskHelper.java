package com.client.core.scheduledtasks.model.helper.impl.credentialing;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

/**
 * Created by m.kesmetzis on 06/05/2020.
 */

public class PlacementCertificationScheduledTaskHelper extends AbstractScheduledTaskHelper<PlacementCertification> {

    private Placement placement;
    private CandidateCertification candidateCertification;
    private Certification certification;
    private CorporateUser modifyingUser;
    private CorporateUser owner;

    public PlacementCertificationScheduledTaskHelper(CustomSubscriptionEvent event) {
        super(event, PlacementCertification.class);
    }


    public PlacementCertification getPlacementCertification() {
        return getEntity();
    }

    public Placement getPlacement() {
        if (placement == null) {
            setPlacement(findPlacement(getPlacementCertification().getPlacement().getId()));
        }
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public CandidateCertification getCandidateCertification() {
        if (candidateCertification == null) {
            setCandidateCertification(findCandidateCertification(getPlacementCertification().getCandidateCertification().getId()));
        }
        return candidateCertification;
    }

    public void setCandidateCertification(CandidateCertification candidateCertification) {
        this.candidateCertification = candidateCertification;
    }

    public Certification getCertification() {
        if (certification == null) {
            setCertification(findCertification(getPlacementCertification().getCertification().getId()));
        }
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    public CorporateUser getModifyingUser() {
        if (modifyingUser == null) {
            setModifyingUser(findCorporateUser(getPlacementCertification().getModifyingUser().getId()));
        }
        return modifyingUser;
    }

    public void setModifyingUser(CorporateUser modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    public CorporateUser getOwner() {
        if (owner == null) {
            setOwner(findCorporateUser(getPlacementCertification().getOwner().getId()));
        }
        return owner;
    }

    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "PlacementCertificationScheduledTaskHelper{" +
                "placement=" + placement +
                ", candidateCertification=" + candidateCertification +
                ", certification=" + certification +
                ", modifyingUser=" + modifyingUser +
                ", owner=" + owner +
                '}';
    }
}
