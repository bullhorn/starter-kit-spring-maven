package com.client.core.formtrigger.controller;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.tools.copy.KryoObjectCopyHelper;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.client.core.base.tools.propertyeditors.CustomObjectEditor;
import com.client.core.base.tools.propertyeditors.MyCustomNumberEditor;
import com.client.core.base.workflow.node.Node;
import com.client.core.formtrigger.model.api.RestTriggerResponse;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;

/**
 * Created by hiqbal on 12/15/2015.
 */

public class AbstractRestTriggerController<T extends BullhornEntity, TR extends AbstractValidationTraverser<?>>{

    private final Node<TR> validationWorkflow;
    protected final BullhornData bullhornData;
    private final EntityChanger entityChanger;

    private static Logger log = Logger.getLogger(AbstractRestTriggerController.class);

    public AbstractRestTriggerController(BullhornData bullhornData, Class<T> type, Node<TR> validationWorkflow, EntityChanger entityChanger) {
        super();
        this.bullhornData = bullhornData;
        this.validationWorkflow = validationWorkflow;
        this.entityChanger = entityChanger;
    }

    public RestTriggerResponse<T> prepareReturnValue(TR validationTraverser){
        T entity = (T) validationTraverser.getFormTriggerHelper().getNewEntity();
        T copyEntity = KryoObjectCopyHelper.copy(entity);

        RestTriggerResponse<T> restTriggerResponse = new RestTriggerResponse<>();

        StringBuilder error = new StringBuilder();

        for (Map.Entry<String, String> entry : validationTraverser.getFormResponse().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // if error
            if (isError(key)) {
                error.append(value + "</br>");
            }
            // if return value
            if (isReturnValue(key)) {
                key = key.substring(12);
                entity = entityChanger.setField(entity, key, value);
            }
        }

        if(StringUtils.isEmpty(error.toString())){
            restTriggerResponse.setResult(true);
            restTriggerResponse.setEntity(entity);
        }
        else{
            restTriggerResponse.setResult(false);
            restTriggerResponse.setEntity(copyEntity);
            restTriggerResponse.setError(error.toString());
        }
        return restTriggerResponse;
    }

    /**
     * Helper method for handling the request
     *
     * @param traverser
     * @return the json parsed validation message
     */
    protected RestTriggerResponse<T> handleRequest(TR traverser) {
        try {
            validationWorkflow.start(traverser);
        } catch (Exception e) {
            log.error("Error validating Entity", e);
            return prepareErrorReturnValue(traverser);
        }
        return prepareReturnValue(traverser);
    }

    protected RestTriggerResponse<T> prepareErrorReturnValue(TR traverser){
        RestTriggerResponse<T> restTriggerResponse = new RestTriggerResponse<>();
        restTriggerResponse.setResult(false);
        restTriggerResponse.setError("Error saving Entity. Please try again.");
        restTriggerResponse.setEntity((T) traverser.getFormTriggerHelper().getNewEntity());

        return restTriggerResponse;
    }

    private boolean isError(String key) {
        key = key.toLowerCase();

        if (key.startsWith("error") || key.startsWith("block") || key.startsWith("validation")) {
            return true;
        }

        return false;
    }

    private boolean isReturnValue(String key) {
        key = key.toLowerCase();
        if (key.startsWith("returnvalue:")) {
            return true;
        }
        return false;
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
