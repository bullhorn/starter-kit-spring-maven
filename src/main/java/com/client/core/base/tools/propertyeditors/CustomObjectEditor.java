package com.client.core.base.tools.propertyeditors;

import java.beans.PropertyEditorSupport;

/**
 * Custom property editor for Object.
 * 
 * @author magnus.palm
 * 
 */
public class CustomObjectEditor extends PropertyEditorSupport {

    public CustomObjectEditor() {
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text);

    }

    /**
     * Format the DateTime as String, using the specified DateFormat.
     */
    @Override
    public String getAsText() {
        Object value = getValue();
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
