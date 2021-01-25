package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.model.helper.impl.ClientCorporationFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class ClientCorporationFormTriggerTraverser extends AbstractTriggerTraverser<ClientCorporation, ClientCorporationFormTriggerHelper> {

	public ClientCorporationFormTriggerTraverser(FormClientCorporationDto formClientCorporationDto, Integer updatingUserID, boolean edit,
												 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new ClientCorporationFormTriggerHelper(formClientCorporationDto, updatingUserID, relatedEntityFields), edit);
	}
}
