package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.ClientCorporationRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class ClientCorporationRestTriggerTraverser extends AbstractTriggerTraverser<ClientCorporation, ClientCorporationRestTriggerHelper> {

	public ClientCorporationRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
												 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new ClientCorporationRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
