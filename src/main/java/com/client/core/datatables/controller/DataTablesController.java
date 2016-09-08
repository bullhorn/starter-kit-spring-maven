package com.client.core.datatables.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.client.core.ApplicationSettings;
import com.client.core.datatables.model.configuration.table.TableConfiguration;
import com.client.core.datatables.service.DataTablesService;

/**
 * Interface for all datatables request handling
 * 
 * @author magnus.palm
 * 
 * @param <T>
 *            entity that will be handled by the datatables, represent one JPA entity.
 * @param <ID>
 *            the unique identifier of entity T
 */
public interface DataTablesController<T, ID> {

    /**
     * Takes a StandardTableConfiguration and uses is to configure the controller.
     * 
     * @param tableConfig
     */
    void configureTable(TableConfiguration<T, ID> tableConfig);

    /**
     * Adds a new instance of T to the model to be used when adding a new entity T
     * 
     * @param model
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    void populateFormWithNewEntity(HttpServletRequest request, Model model) throws InstantiationException,
            IllegalAccessException;

    /**
     * Initializes the data table, this is the starting point when the page is hit.
     * 
     * 
     * @param model
     * 
     * @return the view
     */
    String init(HttpServletRequest request, HttpServletResponse response, Model model);

    /**
     * Helper method to populate the transaction dashboard. Called by the datatables in the dashboardMain.jsp
     * 
     * @param request
     * @param response
     * @throws IOException
     */
    String dashboardData(HttpServletRequest request, HttpServletResponse response);

    /**
     * Handles editing of records using the primary key, column position and new value for that column.
     * 
     * @param id
     *            the primary key of the record
     * @param columnPosition
     *            the column position in the table
     * @param value
     *            the new value
     * 
     * @param request
     * @param response
     * @param model
     * @return the new value if successful edit, otherwise an error message
     */
    String editRecord(ID id, Integer columnPosition, String value, HttpServletRequest request,
            HttpServletResponse response, Model model);

    /**
     * Validates an entity and if validation passes adds that record.
     * 
     * @param entity
     *            The entity to add and validate
     * 
     * @param response
     * 
     * @return the primary key of the new record if successful insert, otherwise validation or error messages.
     */
    String prepareFormForEditEntity(ID entityID, HttpServletRequest request, HttpServletResponse response, Model model);

    /**
     * Requests from the edit form will hit this method.
     * 
     * Validates an entity and if validation passes adds that record.
     * 
     * @param entity
     *            The entity to add and validate
     * 
     * @param response
     * 
     * @return the primary key of the new record if successful insert, otherwise validation or error messages.
     */
    String editEntityUsingForm(T entity, ID entityID, HttpServletRequest request, HttpServletResponse response);

    /**
     * Deletes the record with unique identifier (such as primary key) id
     * 
     * @param id
     *            the unique identifier of the record
     * 
     * @return a blank String if success, otherwise an error message.
     */
    String deleteRecord(ID id);

    /**
     * Validates an entity and if validation passes adds that record.
     * 
     * @param entity
     *            The entity to add and validate
     * 
     * @param response
     * 
     * @return the primary key of the new record if successful insert, otherwise validation or error messages.
     */

    String addRecord(T entity, HttpServletRequest request, HttpServletResponse response);

    /**
     * Validates an entity and if validation passes updates that record.
     * 
     * @param entity
     *            The entity to add and validate
     * 
     * @param response
     * 
     * @return the primary key of the new record if successful insert, otherwise validation or error messages.
     */

    String updateRecord(T entity, HttpServletRequest request, HttpServletResponse response);

    DataTablesService<T, ID> getDataTablesService();

    Logger getLog();

    T getEntity();

    String getViewName();

    String getCustomUrl();

    ApplicationSettings getAppSettings();

    Class<T> getType();

}
