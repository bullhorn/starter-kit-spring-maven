package com.client.core.resttrigger.workflow.traversing;

import java.util.Map;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.resttrigger.model.helper.impl.ClientCorporationRestTriggerHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class ClientCorporationRestTriggerTraverser extends AbstractTriggerTraverser<ClientCorporation, ClientCorporationRestTriggerHelper> {

	public ClientCorporationRestTriggerTraverser(Integer entityID, Map<String, Object> valuesChanged, Integer updatingUserID, boolean edit, BullhornData bullhornData) {
		super(new ClientCorporationRestTriggerHelper(entityID, valuesChanged, updatingUserID, bullhornData), edit);
	}

}
