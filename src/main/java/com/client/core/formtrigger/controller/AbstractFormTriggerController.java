package com.client.core.formtrigger.controller;

import java.util.Map;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.controller.AbstractTriggerController;
import com.client.core.base.util.TriggerUtil;
import com.client.core.base.workflow.node.Node;
import com.client.core.base.workflow.traversing.AbstractTriggerTraverser;

public class AbstractFormTriggerController<T extends BullhornEntity, TR extends AbstractTriggerTraverser<T, ?>> extends AbstractTriggerController<T, TR> {

    protected final static String SUCCESSFUL_SAVE_JSON_RESPONSE_NO_PARAMS = "({\"result\":\"true\"})";

    protected final Class<T> type;
    protected final Node<TR> validationWorkflow;
    protected DateTime timeSinceLastMetaDataUpdate;

	public AbstractFormTriggerController(Class<T> type, Node<TR> validationWorkflow) {
		super();
		this.type = type;
		this.validationWorkflow = validationWorkflow;
		this.timeSinceLastMetaDataUpdate = DateTime.now();
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
			log.error("Error validating placement", e);

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

}
