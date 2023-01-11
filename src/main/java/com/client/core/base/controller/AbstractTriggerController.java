package com.client.core.base.controller;

import java.math.BigDecimal;
import java.util.Locale;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.AppContext;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.tools.propertyeditors.CustomObjectEditor;
import com.client.core.base.tools.propertyeditors.MyCustomNumberEditor;
import com.client.core.base.workflow.traversing.TriggerTraverser;

public abstract class AbstractTriggerController<E extends BullhornEntity, H extends TriggerHelper<E>, T extends TriggerTraverser<E, H>>{

    protected final BullhornData bullhornData;

    protected final Logger log = LogManager.getLogger(getClass());

    public AbstractTriggerController() {
        super();
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder, Locale locale) {
        binder.setIgnoreInvalidFields(true);
        binder.setIgnoreUnknownFields(true);

        binder.registerCustomEditor(Double.class, new MyCustomNumberEditor(Double.class));
        binder.registerCustomEditor(Integer.class, new MyCustomNumberEditor(Integer.class));
        binder.registerCustomEditor(BigDecimal.class, new MyCustomNumberEditor(BigDecimal.class));
        binder.registerCustomEditor(Boolean.class, new CustomBooleanEditor(true));

        binder.registerCustomEditor(String.class, new CustomObjectEditor());
    }

}
