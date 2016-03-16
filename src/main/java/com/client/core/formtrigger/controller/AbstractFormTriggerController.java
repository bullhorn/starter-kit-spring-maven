package com.client.core.formtrigger.controller;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.formtrigger.workflow.traversing.AbstractValidationTraverser;
import com.client.core.base.tools.propertyeditors.CustomObjectEditor;
import com.client.core.base.tools.propertyeditors.MyCustomNumberEditor;
import com.client.core.base.workflow.node.Node;

public class AbstractFormTriggerController<T extends BullhornEntity, TR extends AbstractValidationTraverser<?>> {

    protected final Logger log = Logger.getLogger(getClass());

    private final Class<T> type;
    private final Node<TR> validationWorkflow;
    protected final BullhornData bullhornData;

    private static final String SUCCESSFUL_SAVE_JSON_RESPONSE_NO_PARAMS = "({\"result\":\"true\"})";

	public AbstractFormTriggerController(BullhornData bullhornData, Class<T> type, Node<TR> validationWorkflow) {
		super();
		this.bullhornData = bullhornData;
		this.type = type;
		this.validationWorkflow = validationWorkflow;
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
	public String prepareReturnValue(Map<String, String> validationResult) {
		if (validationResult.isEmpty()) {
			return SUCCESSFUL_SAVE_JSON_RESPONSE_NO_PARAMS;
		}

		StringBuilder error = new StringBuilder();
		StringBuilder returnValues = new StringBuilder();

		for (Map.Entry<String, String> entry : validationResult.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();

			// if error
			if (isError(key)) {
				error.append(value + "</br>");
			}

			// if return value
			if (isReturnValue(key)) {
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

	private boolean isError(String key) {
		key = key.toLowerCase();

		return key.startsWith("error") || key.startsWith("block") || key.startsWith("validation");
	}

	private boolean isReturnValue(String key) {
		key = key.toLowerCase();

		return key.startsWith("returnvalue:");
	}

	/**
	 * Helper method for handling the request
	 * 
	 * @param traverser
	 * @return the json parsed validation message
	 */
	protected String handleRequest(TR traverser) {
		try {
			validationWorkflow.start(traverser);
		} catch (Exception e) {
			log.error("Error validating entity", e);
			return prepareErrorReturnValue("entity");
		}

		return prepareReturnValue(traverser.getFormResponse());
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
