package com.client.core.datatables.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

import com.client.core.ApplicationSettings;
import com.client.core.base.dao.GenericDao;
import com.client.core.datatables.model.configuration.column.ColumnConfiguration;
import com.client.core.soap.tools.property.DtoFieldChangeFactory;

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
    public ColumnConfiguration convertEntityToColumns(T entity);

    /**
     * Takes a ColumnConfiguration and updates the passed in entity with the new values. Columns in convertEntityToColumns and
     * convertColumnsToEntity have to correspond.
     * 
     * @param rowConfig
     * @param oldEntity
     *            the entity that will be updated
     * @return the T entity
     */
    public T convertColumnsToEntity(ColumnConfiguration rowConfig, T oldEntity);

    /**
     * Entry point for getting, filtering, sorting, handle pagination and constructing JSONObject; the JSONObject is then written
     * to the response.
     * 
     * @param request
     * @param response
     * @throws IOException
     */
    public JSONObject processRequestForDataTables(HttpServletRequest request);

    /**
     * Retrieves the data. Gets a List<T> of all entities in table
     * 
     * @param tableRows
     *            will be null if List is not in session
     * @param useCache
     *            If true data will be cached
     * @param request
     *            the HttpServletRequest containing all the information from the request. This can be used when overriding this
     *            method to retrieve query params etc.
     * @return the List<T>
     */
    public List<T> getData(List<T> tableRows, boolean useCache, HttpServletRequest request);

    /**
     * Retrieves all the data in the table. Gets a List<T> of all entities in table
     * 
     * @param tableRows
     *            will be null if List is not in session
     * @param useCache
     *            If true data will be cached
     * @return the List<T>
     */
    public List<T> findAll(List<T> tableRows, boolean useCache);

    /**
     * Updates an object of type T
     * 
     * @param transientObject
     *            The object to be added/updated
     * @return the object just added/updated
     */
    public T update(T transientObject);

    /**
     * Updates an object of type T
     * 
     * @param transientObject
     *            The object to be added/updated
     * @return the ID of the object just added/updated
     */
    public ID updateAndReturnID(T transientObject);

    /**
     * Adds an object of type T
     * 
     * @param transientObject
     *            The object to be added/updated
     * @return the object just added/updated
     */
    public T add(T transientObject);

    /**
     * Adds an object of type T
     * 
     * @param transientObject
     *            The object to be added/updated
     * @return the ID of the object just added/updated
     */
    public ID addAndReturnID(T transientObject);

    /**
     * Get a T record using it's id
     * 
     * @param id
     *            The unique identifier of the entity T (in most cases the primary key of the entity)
     * @return the entity of type T
     * @throws EntityNotFoundException
     *             when no entity with (primary key) ID exists
     */
    public T find(ID id) throws EntityNotFoundException;


    /**
     * Method for custom query.
     * 
     * @param queryString
     *            the query String with named parameters: Select a FROM TableName a WHERE a.field = :namedParam
     * @param queryParameters
     *            the named parameters corresponding to the :namedParam in the queryString. The key of the map need correspond to
     *            namedParam while the value is the actual value used in the query.
     * @return a List<T> of possible value, and empty List if no values found
     */
    public List<T> query(String queryString, Map<String, Object> queryParameters);

    /**
     * Deletes entity T from table.
     * 
     * @param T
     *            Entity to delete
     * @throws IllegalArgumentException
     *             if the instance is not an entity or is a detached entity
     * 
     */
    public void remove(T persistentObject) throws EntityNotFoundException;

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

    public String editEntity(ID id, Integer columnPosition, Object value, HttpServletRequest request,
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
    public String handleEntityFormEdit(T entity, ID entityID, HttpServletRequest request, HttpServletResponse response);

    /**
     * Deletes an entity using its primary key
     * 
     * @param id
     *            unique identifier
     * 
     * @throws EntityNotFoundException
     *             if no enity exists with the specified unique identifier
     */
    public void removeUsingID(ID id) throws EntityNotFoundException;

    /**
     * Validates an entity
     * 
     * @param entity
     *            the entity to validate
     * 
     * @return A string containing each validation error separated by <br/>
     *         for displaying on the jsp
     */
    public String validateEntity(T entity);

    /**
     * Prepares a validation error message using Spring's BindingResult from an entity validation.
     * 
     * @param bindingResult
     *            the validation result from an entity
     * @param entity
     *            the entity that was just validated, used to find the labels of particular fields to create prettier error
     *            messages.
     * @return A string containing each validation error separated by <br/>
     *         for displaying on the jsp
     */
    public String prepareValidationErrorMessage(BindingResult bindingResult, T entity);

    /**
     * Adjusts the column position to account for hidden column missmatch between datatables columns and datatables-editable
     * columns.
     * 
     * @param columnConfiguration
     * @param columnPosition
     *            the current column to check
     * @return the new columns position
     */
    public Integer adjustColumnPositionDueToInvisibleColumns(ColumnConfiguration columnConfiguration, Integer columnPosition);

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
    public void additionalColumnConfiguration(ColumnConfiguration columnConfiguration, HttpServletRequest request,
            HttpServletResponse response, Model model);

    public GenericDao<T, ID> getGenericDao();

    public ApplicationSettings getAppSettings();

    public Validator getValidator();

    public DtoFieldChangeFactory getDtoFieldChangeFactory();

    public Logger getLog();

    /**
     * Gets a message from a resource bundle.
     * 
     * @param key
     *            The key of the message
     * @return The message
     */
    public String getMessageUsingKey(String key);

    /**
     * Get a query from the passed in QueryHelper
     * 
     * @param key
     * @return
     */
    public String getQueryUsingKey(String key);

}
