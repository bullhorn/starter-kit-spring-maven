package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.LeadRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class LeadScheduledTaskHelper extends AbstractScheduledTaskHelper<Lead> {

	private ClientCorporation clientCorporation;
	private CorporateUser leadOwner;

	public LeadScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, Lead.class, LeadRelatedEntity.LEAD, relatedEntityFields);
	}

    public Lead getLead() {
        return getEntity();
    }

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getLead().getClientCorporation().getId(), LeadRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public CorporateUser getLeadOwner() {
		if (leadOwner == null) {
			this.leadOwner = findCorporateUser(getLead().getOwner().getId(), LeadRelatedEntity.LEAD_OWNER);
		}

		return leadOwner;
	}

}
