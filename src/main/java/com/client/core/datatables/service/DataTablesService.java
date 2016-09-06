package com.client.core.datatables.service;

import java.io.IOException;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;

import com.client.core.datatables.model.configuration.column.ColumnConfiguration;

/**
 * 
 * @author magnus.palm
 * 
 * @param <T>
 *            The entity that backs each row in datatables
 * @param <ID>
 *            The unique identifier of the entity T
 * 
 */
public interface DataTablesService<T, ID> {

    /**
     * 
     * Takes a T entity and converts it to a ColumnConfiguration; a ColumnConfiguration contains a number of Columns. All columns
     * do not have to be represented by values in the entity, for example a column with a button for custom logic.
     * 
     * Example implementation: See com.client.core.service.datatables.example.ExampleDataTablesService
     * 
     * @param entity
     * 
     * @return the ColumnConfiguration that the entity was mapped to
     * 
     */
    ColumnConfiguration convertEntityToColumns(T entity);

    /**
     * Entry point for getting, filtering, sorting, handle pagination and constructing JSONObject; the JSONObject is then written
     * to the response.
     * 
     * @param request
     * @throws IOException
     */
    JSONObject processRequestForDataTables(HttpServletRequest request);

    /**
     * Updates an object of type T
     * 
     * @param transientObject
     *            The object to be added/updated
     * @return the ID of the object just added/updated
     */
    ID updateAndReturnID(T transientObject);

    /**
     * Adds an object of type T
     * 
     * @param transientObject
     *            The object to be added/updated
     * @return the ID of the object just added/updated
     */
    ID addAndReturnID(T transientObject);

    /**
     * Get a T record using it's id
     * 
     * @param id
     *            The unique identifier of the entity T (in most cases the primary key of the entity)
     * @return the entity of type T
     * @throws EntityNotFoundException
     *             when no entity with (primary key) ID exists
     */
    T find(ID id) throws EntityNotFoundException;

    /**
     * Updates an existing entity of type T, using its primary key, the column position in the datatables of the field being
     * updated and the updated value. Also validates the entity and returns potential validation errors.
     * 
     * @param id
     *            the unique identifier of the entity T
     * @param columnPosition
     *            the column position in the datatables that matches the field being updated
     * @param value
     *            the new value of the field * @param request
     * @param response
     * @param model
     * @return potential validation errors
     */

    String editEntity(ID id, Integer columnPosition, Object value, HttpServletRequest request,
            HttpServletResponse response, Model model);

    /**
     * This method handles the edit of an entity using the form instead of inline editing. Implementations will need to make sure
     * that only the form values are updated on the saved entity. This is done by fetching the persisted entity and updating the
     * fields on the form. This is useful for bullhorn entities exposed in the datatables where all fields on the entity will not
     * be present on the form.
     * 
     * @param entity
     *            used when all fields on the entity are present on the form
     * @param entityID
     *            the id of the entity to update
     * @param request
     *            the request containing all parameters
     * @param response
     * @return The id of updated entity if success, if validations failed then validation messages, if error then error message.
     */
    String handleEntityFormEdit(T entity, ID entityID, HttpServletRequest request, HttpServletResponse response);

    /**
     * Deletes an entity using its primary key
     * 
     * @param id
     *            unique identifier
     * 
     * @throws EntityNotFoundException
     *             if no enity exists with the specified unique identifier
     */
    void removeUsingID(ID id) throws EntityNotFoundException;

    /**
     * Validates an entity
     * 
     * @param entity
     *            the entity to validate
     * 
     * @return A string containing each validation error separated by <br/>
     *         for displaying on the jsp
     */
    String validateEntity(T entity);

    /**
     * Method to handle custom column configurations, such as adding field maps or hiding columns based on user type etc. Modify
     * the passed in ColumnConfiguration in order to change the column configuration.
     * 
     * This method will only be called once on table load.
     * 
     * @param columnConfiguration
     *            The ColumnConfiguration from this.convertEntityToColumns
     * @param request
     *            the HttpServletRequest
     * @param response
     *            the HttpServletResponse
     * @param model
     *            the Model
     */
    void additionalColumnConfiguration(ColumnConfiguration columnConfiguration, HttpServletRequest request, HttpServletResponse response, Model model);

    Validator getValidator();

}
