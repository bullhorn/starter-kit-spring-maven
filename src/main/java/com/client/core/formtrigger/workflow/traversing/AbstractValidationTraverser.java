package com.client.core.formtrigger.workflow.traversing;

import java.util.LinkedHashMap;
import java.util.Map;

import com.client.core.formtrigger.model.helper.FormTriggerHelper;

public class AbstractValidationTraverser<T extends FormTriggerHelper<?, ?>> implements ValidationTraverser {

	private final T formTriggerHelper;
	private final Integer corporationID;
	private final Map<String, String> formResponse;
	private final boolean edit;

	public AbstractValidationTraverser(T formTriggerHelper, Integer corporationID, boolean edit) {
		super();
		this.formTriggerHelper = formTriggerHelper;
		this.corporationID = corporationID;
		this.formResponse = new LinkedHashMap<String, String>();
		this.edit = edit;
	}

	public T getFormTriggerHelper() {
		return formTriggerHelper;
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Integer getCorporationID() {
		return corporationID;
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Map<String, String> getFormResponse() {
		return formResponse;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public void addFormResponse(String key, String message) {
        this.formResponse.put(key, message);
    }

    /**
     * {@inheritDoc}
     */
    @Override
	public boolean isEdit() {
		return edit;
	}
	
	@Override
	public String toString() {
		String NEW_LINE = System.getProperty("line.separator");

        return new StringBuilder().append(this.getClass().getName() + " Object {" + NEW_LINE)
                .append(" corporationID: " + corporationID + NEW_LINE)
                .append(" formTriggerHelper: " + formTriggerHelper + NEW_LINE)
                .append(" formResponse: " + formResponse + NEW_LINE)
                .append("}")
                .toString();
	}

}
