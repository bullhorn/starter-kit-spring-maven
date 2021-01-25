package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.LeadRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class LeadTriggerHelper extends AbstractTriggerHelper<Lead> {

    private CorporateUser owner;
    private ClientCorporation clientCorporation;

    public LeadTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(updatingUserID, Lead.class, LeadRelatedEntity.LEAD, relatedEntityFields);
    }

    public CorporateUser getLeadOwner() {
        if (owner == null) {
            this.owner = findCorporateUser(getNewEntity().getOwner().getId(), LeadRelatedEntity.LEAD_OWNER);
        }

        return owner;
    }

    public ClientCorporation getClientCorporation() {
        if (clientCorporation == null) {
            this.clientCorporation = findClientCorporation(getNewEntity().getClientCorporation().getId(), LeadRelatedEntity.CLIENT_CORPORATION);
        }

        return clientCorporation;
    }

}
