package com.client.core.base.model.helper.impl;


import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.OpportunityRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class OpportunityTriggerHelper extends AbstractTriggerHelper<Opportunity> {

	private CorporateUser opportunityOwner;
	private ClientCorporation clientCorporation;
	private ClientContact clientContact;

	public OpportunityTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, Opportunity.class, OpportunityRelatedEntity.OPPORTUNITY, relatedEntityFields);
	}

	public CorporateUser getOpportunityOwner() {
		if (opportunityOwner == null) {
			this.opportunityOwner = findCorporateUser(getNewEntity().getOwner().getId(), OpportunityRelatedEntity.OPPORTUNITY_OWNER);
		}

		return opportunityOwner;
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getNewEntity().getClientCorporation().getId(), OpportunityRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public ClientContact getClientContact() {
		if (clientContact == null) {
			this.clientContact = findClientContact(getNewEntity().getClientContact().getId(), OpportunityRelatedEntity.CLIENT_CONTACT);
		}

		return clientContact;
	}

}
