package com.client.core.resttrigger.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.AppContext;
import com.client.core.base.controller.AbstractTriggerController;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.tools.web.JsonConverter;
import com.client.core.base.util.TriggerUtil;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.client.core.resttrigger.model.api.RestTriggerRequest;
import com.client.core.resttrigger.model.api.RestTriggerResponse;
import com.client.core.resttrigger.model.form.RestFormEntity;
import com.google.common.collect.Lists;

/**
 * Created by hiqbal on 12/15/2015.
 */

public class AbstractRestTriggerController<E extends BullhornEntity, R extends RestFormEntity<E>, H extends TriggerHelper<E>, T extends AbstractTriggerTraverser<E, H>> extends AbstractTriggerController<E, H, T> {

    private static Logger log = Logger.getLogger(AbstractRestTriggerController.class);

    private final Class<E> type;
    private final Class<R> formType;
    private final List<TriggerValidator<E, H, T>> triggerValidators;

    protected final BullhornData bullhornData;

    private final JsonConverter jsonConverter;

    public AbstractRestTriggerController(Class<E> type, Class<R> formType, Optional<List<TriggerValidator<E, H, T>>> triggerValidators) {
        super();
        this.type = type;
        this.formType = formType;
        this.triggerValidators = sort(triggerValidators);
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        this.jsonConverter = AppContext.getApplicationContext().getBean(JsonConverter.class);
    }

    protected RestTriggerRequest<E, R> convertToObject(String value) {
        return jsonConverter.convertJsonStringToEntity(value, RestTriggerRequest.class, formType);
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
        try {
            triggerValidators.stream().forEach( (triggerValidator) -> {
                triggerValidator.validate(traverser);
            });
        } catch (Exception e) {
            log.error("Error validating "+type.getSimpleName(), e);

            return prepareErrorReturnValue(entity);
        }

        return prepareReturnValue(traverser, entity);
    }

    protected RestTriggerResponse prepareErrorReturnValue(Map<String, Object> fields){
        RestTriggerResponse restTriggerResponse = new RestTriggerResponse();

        restTriggerResponse.setResult(false);
        restTriggerResponse.setError("Error saving Entity. Please try again.");
        restTriggerResponse.setEntity(fields);

        return restTriggerResponse;
    }

	protected RestTriggerResponse prepareReturnValue(T validationTraverser, Map<String, Object> entity){
		RestTriggerResponse restTriggerResponse = new RestTriggerResponse();

		StringBuilder error = new StringBuilder();

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

		if(StringUtils.isEmpty(error.toString())){
			restTriggerResponse.setResult(true);
		} else{
			restTriggerResponse.setResult(false);
			restTriggerResponse.setError(error.toString());
		}

		restTriggerResponse.setEntity(entity);

		return restTriggerResponse;
	}

	protected <E extends BullhornEntity, H extends TriggerHelper<E>, T extends TriggerTraverser<E, H>> List<TriggerValidator<E, H, T>> sort(Optional<List<TriggerValidator<E, H, T>>> values) {
		return values.orElseGet(Lists::newArrayList).stream().sorted().collect(Collectors.toList());
	}

}
