package com.client.core.formtrigger.workflow.traversing;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.model.helper.impl.ClientContactFormTriggerHelper;

import java.util.Map;
import java.util.Set;

public class ClientContactFormTriggerTraverser extends AbstractTriggerTraverser<ClientContact, ClientContactFormTriggerHelper> {

	public ClientContactFormTriggerTraverser(FormClientContactDto formClientContactDto, Integer updatingUserID, boolean edit,
											 Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
		super(new ClientContactFormTriggerHelper(formClientContactDto, updatingUserID, relatedEntityFields), edit);
	}

}
