package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.OpportunityRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class OpportunityScheduledTaskHelper extends AbstractScheduledTaskHelper<Opportunity> {

	private ClientCorporation clientCorporation;
	private CorporateUser opportunityOwner;
	private ClientContact clientContact;

	public OpportunityScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, Opportunity.class, OpportunityRelatedEntity.OPPORTUNITY, relatedEntityFields);
	}

	public Opportunity getOpportunity() {
        return getEntity();
    }

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getOpportunity().getClientCorporation().getId(), OpportunityRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getOpportunity().getClientContact().getId(), OpportunityRelatedEntity.CLIENT_CONTACT);
		}
		return clientContact;
	}

	public CorporateUser getOpportunityOwner() {
		if (opportunityOwner == null) {
			this.opportunityOwner = findCorporateUser(getOpportunity().getOwner().getId(), OpportunityRelatedEntity.OPPORTUNITY_OWNER);
		}

		return opportunityOwner;
	}

}
