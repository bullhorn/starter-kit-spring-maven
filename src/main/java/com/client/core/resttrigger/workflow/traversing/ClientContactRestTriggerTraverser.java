package com.client.core.resttrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.ClientContactRestTriggerHelper;

import java.util.Map;
import java.util.Set;

public class ClientContactRestTriggerTraverser extends AbstractTriggerTraverser<ClientContact, ClientContactRestTriggerHelper> {

	public ClientContactRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit,
											 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new ClientContactRestTriggerHelper(entityID, valuesChanged, updatingUserID, relatedEntityFields), edit);
	}

}
