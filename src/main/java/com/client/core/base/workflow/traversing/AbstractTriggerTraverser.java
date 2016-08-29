package com.client.core.base.workflow.traversing;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.client.core.base.model.helper.TriggerHelper;
import com.client.core.base.util.TriggerUtil;

public class AbstractTriggerTraverser<E extends BullhornEntity, T extends TriggerHelper<E>> implements Traverser {

	private final T formTriggerHelper;
	private final Map<String, Object> formResponse;
	private final boolean edit;

    public AbstractTriggerTraverser(T formTriggerHelper, boolean edit) {
        super();
        this.formTriggerHelper = formTriggerHelper;
        this.formResponse = new LinkedHashMap<>();
        this.edit = edit;
    }

	/**
	 * Contains the response that will be sent back to the bullhorn form, key:value pairs
	 * can be either validation error messages or response values for the form.
	 * 
	 * Any key starting with either "error","block" or "validation" will be treated as a validation blocking 
	 * error. The value will be displayed to user on the bullhorn form.
	 * 
	 * Any key starting with "returnvalue:" will be treated as a return value to populate the form, the text 
	 * following the "returnvalue:" in the key is the field to update. The value in the map is the value
	 * to populate the field with. Example "returnvalue:status":"Closed", this will return "Closed" to 
	 * the status field.
	 * 
	 * @param key
	 * @param message
	 */
	public void addFormResponse(String key, String message) {
		this.formResponse.put(key, message);
	}

	public T getTriggerHelper() {
		return formTriggerHelper;
	}

	public Map<String, Object> getFormResponse() {
		return formResponse;
	}

	public boolean isEdit() {
		return edit;
	}

	public boolean hasErrors() {
		return getFormResponse().entrySet().parallelStream().anyMatch( entry -> {
			return TriggerUtil.isError(entry.getKey());
		});
	}

    @Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append(this.getClass().getName() + " Object {" + NEW_LINE);

		result.append(" formTriggerHelper: " + formTriggerHelper + NEW_LINE);
		result.append(" formResponse: " + formResponse + NEW_LINE);

		result.append("}");
		return result.toString();
	}

}
