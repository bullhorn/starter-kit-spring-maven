package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.helper.AbstractTriggerHelper;

/**
 * Created by hiqbal on 12/23/2015.
 */
public abstract class LeadTriggerHelper extends AbstractTriggerHelper<Lead> {

    private CorporateUser owner;
    private ClientCorporation clientCorporation;

    public LeadTriggerHelper(Integer updatingUserID, BullhornData bullhornData) {
        super(updatingUserID, bullhornData);
    }

    @Override
    public Integer getUpdatingUserID() {
        return updatingUserID;
    }

    @Override
    public void setNewEntity(Lead newEntity) {
        this.newEntity = newEntity;
    }

    @Override
    public Lead getOldEntity() {
        if (oldEntity == null) {
            setOldEntity(findLead(getNewEntity().getId()));
        }

        return oldEntity;
    }

    @Override
    public void setOldEntity(Lead oldEntity) {
        this.oldEntity = oldEntity;
    }

    /**
     * Gets the owner of the job
     *
     * @return a CorporateUserDto
     */
    public CorporateUser getOwner() {
        if (owner == null) {
            setOwner(findCorporateUser(getNewEntity().getOwner().getId()));
        }

        return owner;
    }

    public void setOwner(CorporateUser owner) {
        this.owner = owner;
    }

    /**
     * Gets the client corporation connected to the lead
     *
     * @return a ClientCorporationDto
     */
    public ClientCorporation getClientCorpration() {
        if (clientCorporation == null) {
            setClientCorporation(findClientCorporation(getNewEntity().getClientCorporation().getId()));
        }

        return clientCorporation;
    }

    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

}
