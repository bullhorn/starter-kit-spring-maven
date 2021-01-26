package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.ClientCorporationRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class ClientCorporationScheduledTaskHelper extends AbstractScheduledTaskHelper<ClientCorporation> {

	public ClientCorporationScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(event, ClientCorporation.class, ClientCorporationRelatedEntity.CLIENT_CORPORATION, relatedEntityFields);
	}

	public ClientCorporation getClientCorporation() {
        return getEntity();
    }

}
