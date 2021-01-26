package com.client.core.base.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.helper.AbstractTriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.ClientCorporationRelatedEntity;

import java.util.Map;
import java.util.Set;

public abstract class ClientCorporationTriggerHelper extends AbstractTriggerHelper<ClientCorporation> {

	public ClientCorporationTriggerHelper(Integer updatingUserID, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(updatingUserID, ClientCorporation.class, ClientCorporationRelatedEntity.CLIENT_CORPORATION, relatedEntityFields);
	}

}
