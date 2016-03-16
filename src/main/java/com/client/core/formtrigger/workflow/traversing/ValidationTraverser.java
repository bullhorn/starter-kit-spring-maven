package com.client.core.formtrigger.workflow.traversing;

import java.util.Map;

import com.client.core.base.workflow.traversing.Traverser;

/**
 * Created by john.sullivan on 2/11/2015.
 */
public interface ValidationTraverser extends Traverser {

    /**
     * Return the corporationID of the corporation for which an entity is being validated
     *
     * @return the corporationID
     */
    public Integer getCorporationID();

    /**
     * Returns the response that will be sent back to the bullhorn form.
     *
     * @see #addFormResponse(String, String)
     *
     * @return the formResponse
     */
    public Map<String, String> getFormResponse();

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
     * @param key the key of the reponse item
     * @param message the message or value to be returned to the bullhorn form
     */
    public void addFormResponse(String key, String message);

    /**
     * Returns whether or not the form trigger currently being validated is an edit trigger or not.
     *
     * @return true if the form trigger is edit, false if it is add
     */
    public boolean isEdit();

}
