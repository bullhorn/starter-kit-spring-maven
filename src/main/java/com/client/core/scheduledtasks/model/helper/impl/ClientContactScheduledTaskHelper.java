package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.ClientContactRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class ClientContactScheduledTaskHelper extends AbstractScheduledTaskHelper<ClientContact> {

	private ClientCorporation clientCorporation;
	private CorporateUser clientContactOwner;

	public ClientContactScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, ClientContact.class, ClientContactRelatedEntity.CLIENT_CONTACT, relatedEntityFields);
	}

    public ClientContact getClientContact() {
        return getEntity();
    }

	public ClientCorporation getClientCorporation() {
		if (clientCorporation == null) {
			this.clientCorporation = findClientCorporation(getClientContact().getClientCorporation().getId(), ClientContactRelatedEntity.CLIENT_CORPORATION);
		}

		return clientCorporation;
	}

	public CorporateUser getClientContactOwner() {
		if (clientContactOwner == null) {
			this.clientContactOwner = findCorporateUser(getClientContact().getOwner().getId(), ClientContactRelatedEntity.CLIENT_CONTACT_OWNER);
		}

		return clientContactOwner;
	}

}
