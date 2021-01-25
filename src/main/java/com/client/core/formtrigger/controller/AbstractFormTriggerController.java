package com.client.core.formtrigger.controller;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.controller.AbstractTriggerController;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.util.TriggerUtil;
import com.client.core.base.util.Utility;
import com.client.core.base.workflow.node.TriggerValidator;
import com.client.core.base.workflow.traversing.TriggerTraverser;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AbstractFormTriggerController<E extends BullhornEntity, H extends TriggerHelper<E>, T extends TriggerTraverser<E, H>> extends AbstractTriggerController<E, H, T> {

	private final static String SUCCESSFUL_SAVE_JSON_RESPONSE_NO_PARAMS = "({\"result\":\"true\"})";

	private final Class<E> type;
	private final List<TriggerValidator<E, H, T>> triggerValidators;
	private final Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields;

	public AbstractFormTriggerController(Class<E> type, Optional<List<TriggerValidator<E, H, T>>> triggerValidators,
                                         BullhornRelatedEntity[] relatedEntities) {
		super();
		this.type = type;
		this.triggerValidators = sort(triggerValidators);
		this.relatedEntityFields = Utility.getRequestedFields(relatedEntities, this.triggerValidators);
	}

	/**
	 * Helper method for handling the request
	 *
	 * @param traverser
	 * @return the json parsed validation message
	 */
	protected String handleRequest(T traverser) {
		try {
			triggerValidators.stream().forEach( (triggerValidator) -> {
				triggerValidator.validate(traverser);
			});
		} catch (RuntimeException e) {
			log.error("Error validating "+type.getSimpleName(), e);

			return prepareErrorReturnValue(type.getSimpleName());
		}

		return prepareReturnValue(traverser.getFormResponse());
	}

	/**
	 * Takes a map of validations and creates the json response for the bullhorn form.
	 *
	 * If a key in the map starts with error,block or validation it's an error and will be treated as a form save blocker. The value in the
	 * map will be used for validation message.
	 *
	 * If a key in the map starts with returnvalue then that record will be treated as a return value to be passed back to the form. The key
	 * will need to have the format returnvalue:nameOfField, where nameOfField will be used in the json return value to specify what field
	 * to update. The value for the record will be the value that will populate the nameOfField.
	 *
	 * @param validationResult
	 *
	 * @return a json response for the bullhorn form
	 */
	public String prepareReturnValue(Map<String, Object> validationResult) {
		if (validationResult.isEmpty()) {
			return SUCCESSFUL_SAVE_JSON_RESPONSE_NO_PARAMS;
		}

		StringBuilder error = new StringBuilder();
		StringBuilder returnValues = new StringBuilder();

		for (Map.Entry<String, Object> entry : validationResult.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();

			// if error
			if (TriggerUtil.isError(key)) {
				error.append(value + "</br>");
			}

			// if return value
			if (TriggerUtil.isReturnValue(key)) {
				if (returnValues.length() == 0) {
					returnValues.append(key.replace("returnvalue:", "") + ":\"" + value + "\"");
				} else {
					returnValues.append("," + key.replace("returnvalue:", "") + ":\"" + value + "\"");
				}
			}
		}

		if (error.length() > 0) {
			return "({result:false,error:\"" + error + "\"})";
		} else if (returnValues.length() > 0) {
			return "({result:true,returnValues:{" + returnValues + "}})";
		}

		return SUCCESSFUL_SAVE_JSON_RESPONSE_NO_PARAMS;

	}

	public String prepareErrorReturnValue(String entityPrettyName) {
		return "({result:false,error:\"Error Saving " + entityPrettyName + ", please try again\"})";
	}

	protected Class<E> getType() {
		return type;
	}

	protected List<TriggerValidator<E, H, T>> getTriggerValidators() {
		return triggerValidators;
	}

	protected <E2 extends BullhornEntity, H2 extends TriggerHelper<E2>, T2 extends TriggerTraverser<E2, H2>> List<TriggerValidator<E2, H2, T2>> sort(Optional<List<TriggerValidator<E2, H2, T2>>> values) {
		return values.orElseGet(Lists::newArrayList).stream().sorted().collect(Collectors.toList());
	}

	protected Map<? extends BullhornRelatedEntity, Set<String>> getRelatedEntityFields() {
		return relatedEntityFields;
	}

}
