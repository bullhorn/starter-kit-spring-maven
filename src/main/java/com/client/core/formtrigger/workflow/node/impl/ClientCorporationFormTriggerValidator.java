package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.base.model.relatedentity.ClientCorporationRelatedEntity;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.model.helper.impl.ClientCorporationFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.ClientCorporationFormTriggerTraverser;

import java.util.Map;
import java.util.Set;

public abstract class ClientCorporationFormTriggerValidator
        extends AbstractFormTriggerValidator<ClientCorporation, FormClientCorporationDto, ClientCorporationFormTriggerHelper, ClientCorporationFormTriggerTraverser> {

    public ClientCorporationFormTriggerValidator(Integer order, Map<ClientCorporationRelatedEntity, Set<String>> relatedEntityFields) {
        super(order, relatedEntityFields);
    }

    public ClientCorporationFormTriggerValidator(Map<ClientCorporationRelatedEntity, Set<String>> relatedEntityFields) {
        super(relatedEntityFields);
    }

}
