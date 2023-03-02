package com.client.core.base.controller;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.tools.propertyeditors.CustomObjectEditor;
import com.client.core.base.tools.propertyeditors.MyCustomNumberEditor;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.math.BigDecimal;

public abstract class AbstractTriggerController<E extends BullhornEntity, H extends TriggerHelper<E>, T extends TriggerTraverser<E, H>> {

    @Autowired
    public AbstractTriggerController() {
        super();
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setIgnoreInvalidFields(true);
        binder.setIgnoreUnknownFields(true);

        binder.registerCustomEditor(Double.class, new MyCustomNumberEditor(Double.class));
        binder.registerCustomEditor(Integer.class, new MyCustomNumberEditor(Integer.class));
        binder.registerCustomEditor(BigDecimal.class, new MyCustomNumberEditor(BigDecimal.class));
        binder.registerCustomEditor(Boolean.class, new CustomBooleanEditor(true));

        binder.registerCustomEditor(String.class, new CustomObjectEditor());
    }

}
