package com.client.core.resttrigger.controller;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.AppContext;
import com.client.core.base.controller.AbstractTriggerController;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.tools.web.JsonConverter;
import com.client.core.base.util.TriggerUtil;
import com.client.core.base.util.Utility;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AbstractRestTriggerController<E extends BullhornEntity, H extends TriggerHelper<E>, T extends AbstractTriggerTraverser<E, H>> extends AbstractTriggerController<E, H, T> {

    private static Logger log = LogManager.getLogger(AbstractRestTriggerController.class);

    private final Class<E> type;
    private final List<TriggerValidator<E, H, T>> triggerValidators;

    protected final BullhornData bullhornData;

    private final JsonConverter jsonConverter;

    private final Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields;

    public AbstractRestTriggerController(Class<E> type, Optional<List<TriggerValidator<E, H, T>>> triggerValidators,
                                         BullhornRelatedEntity[] relatedEntities) {
        super();
        this.type = type;
        this.triggerValidators = sort(triggerValidators);
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        this.jsonConverter = AppContext.getApplicationContext().getBean(JsonConverter.class);
        this.relatedEntityFields = Utility.getRequestedFields(relatedEntities, this.triggerValidators);
    }

    protected RestTriggerRequest<E> convertToObject(String value) {
        return jsonConverter.convertJsonStringToEntity(value, RestTriggerRequest.class, type);
    }

    protected Map<String, Object> convertToMap(String value) {
        return jsonConverter.convertJsonStringToMap(value);
    }

    /**
     * Helper method for handling the request
     *
     * @param traverser
     * @return the json parsed validation message
     */
    protected RestTriggerResponse handleRequest(T traverser, Map<String, Object> entity) {
        return handleRequests(Lists.newArrayList(traverser), entity);
    }

    protected RestTriggerResponse handleRequests(List<T> traversers, Map<String, Object> entity) {
        try {
            traversers.forEach(traverser -> {
                triggerValidators.forEach((triggerValidator) -> {
                    if (!traverser.hasErrors()) {
                        triggerValidator.validate(traverser);
                    }
                });
            });
        } catch (Exception e) {
            log.error("Error validating " + type.getSimpleName(), e);

            return prepareErrorReturnValue(entity);
        }

        return prepareReturnValue(traversers, entity);
    }

    protected RestTriggerResponse prepareErrorReturnValue(Map<String, Object> fields) {
        RestTriggerResponse restTriggerResponse = new RestTriggerResponse();

        restTriggerResponse.setResult(false);
        restTriggerResponse.setError("Error saving Entity. Please try again.");
        restTriggerResponse.setEntity(fields);

        return restTriggerResponse;
    }

    protected RestTriggerResponse prepareReturnValue(List<T> validationTraversers, Map<String, Object> entity) {
        RestTriggerResponse restTriggerResponse = new RestTriggerResponse();

        StringBuilder error = new StringBuilder();

        validationTraversers.forEach(validationTraverser -> {
            for (Map.Entry<String, Object> entry : validationTraverser.getFormResponse().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                // if error
                if (TriggerUtil.isError(key)) {
                    error.append(value + "</br>");
                }
                // if return value
                if (TriggerUtil.isReturnValue(key)) {
                    key = key.substring(12);

                    entity.put(key, value);
                }
            }
        });

        if (StringUtils.isEmpty(error.toString())) {
            restTriggerResponse.setResult(true);
        } else {
            restTriggerResponse.setResult(false);
            restTriggerResponse.setError(error.toString());
        }

        restTriggerResponse.setEntity(entity);

        return restTriggerResponse;
    }

    protected <E2 extends BullhornEntity, H2 extends TriggerHelper<E2>, T2 extends TriggerTraverser<E2, H2>> List<TriggerValidator<E2, H2, T2>> sort(Optional<List<TriggerValidator<E2, H2, T2>>> values) {
        return values.orElseGet(Lists::newArrayList).stream().sorted().collect(Collectors.toList());
    }

    protected Map<? extends BullhornRelatedEntity, Set<String>> getRelatedEntityFields() {
        return relatedEntityFields;
    }

}
