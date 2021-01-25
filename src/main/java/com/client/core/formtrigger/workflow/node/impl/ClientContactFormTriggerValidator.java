package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.client.core.base.model.relatedentity.ClientContactRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormClientContactDto;
import com.client.core.formtrigger.model.helper.impl.ClientContactFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.ClientContactFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientContactFormTriggerValidator
        extends AbstractFormTriggerValidator<ClientContact, FormClientContactDto, ClientContactFormTriggerHelper, ClientContactFormTriggerTraverser> {

    public ClientContactFormTriggerValidator(Integer order, Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientContactFormTriggerValidator(Map<ClientContactRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
