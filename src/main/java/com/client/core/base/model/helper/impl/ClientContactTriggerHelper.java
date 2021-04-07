package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.ClientContactRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class ClientContactTriggerHelper extends AbstractTriggerHelper<ClientContact> {

	private ClientCorporation clientCorporation;
	private CorporateUser clientContactOwner;

	public ClientContactTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, ClientContact.class, ClientContactRelatedEntity.CLIENT_CONTACT, relatedEntityFields);
	}

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getNewEntity().getClientCorporation().getId(), ClientContactRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public CorporateUser getClientContactOwner() {
		if (clientContactOwner == null) {
			this.clientContactOwner = findCorporateUser(getNewEntity().getOwner().getId(), ClientContactRelatedEntity.CLIENT_CONTACT_OWNER);
		}

		return clientContactOwner;
	}

}
