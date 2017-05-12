package com.client.core.formtrigger.workflow.node.impl;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.client.core.formtrigger.model.form.impl.FormClientCorporationDto;
import com.client.core.formtrigger.model.helper.impl.ClientCorporationFormTriggerHelper;
import com.client.core.formtrigger.workflow.traversing.ClientCorporationFormTriggerTraverser;

/**
 * Created by john.sullivan on 9/3/2017.
 */
public abstract class ClientCorporationFormTriggerValidator
        extends AbstractFormTriggerValidator<ClientCorporation, FormClientCorporationDto, ClientCorporationFormTriggerHelper, ClientCorporationFormTriggerTraverser> {

    public ClientCorporationFormTriggerValidator(Integer order) {
        super(order);
    }

    public ClientCorporationFormTriggerValidator() {
    }

}