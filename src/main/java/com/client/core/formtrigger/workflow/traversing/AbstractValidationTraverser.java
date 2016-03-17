package com.client.core.formtrigger.workflow.traversing;

import java.util.LinkedHashMap;
import java.util.Map;

import com.client.core.formtrigger.model.helper.FormTriggerHelper;

public class AbstractValidationTraverser<T extends FormTriggerHelper<?, ?>> implements ValidationTraverser {

	private final T formTriggerHelper;
	private final Map<String, String> formResponse;
	private final boolean edit;
    private final boolean restTrigger;

    public AbstractValidationTraverser(T formTriggerHelper, boolean edit, boolean restTrigger) {
        super();
        this.formTriggerHelper = formTriggerHelper;
        this.formResponse = new LinkedHashMap<>();
        this.edit = edit;
        this.restTrigger = restTrigger;
    }

    public AbstractValidationTraverser(T formTriggerHelper, boolean edit) {
        super();
        this.formTriggerHelper = formTriggerHelper;
        this.formResponse = new LinkedHashMap<String, String>();
        this.edit = edit;
        this.restTrigger = false;
    }

	public T getFormTriggerHelper() {
		return formTriggerHelper;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean getRestTrigger() {
        return restTrigger;
    }
	
	@Override
	public String toString() {
		String NEW_LINE = System.getProperty("line.separator");

        return new StringBuilder().append(this.getClass().getName() + " Object {" + NEW_LINE)
                .append(" formTriggerHelper: " + formTriggerHelper + NEW_LINE)
                .append(" formResponse: " + formResponse + NEW_LINE)
                .append("}")
                .toString();
	}

}
