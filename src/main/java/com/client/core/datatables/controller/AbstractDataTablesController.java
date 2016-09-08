package com.client.core.datatables.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.client.core.ApplicationSettings;
import com.client.core.base.tools.enums.YesNo;
import com.client.core.base.tools.propertyeditors.CustomDateTimeEditor;
import com.client.core.base.tools.propertyeditors.CustomObjectEditor;
import com.client.core.base.tools.propertyeditors.CustomXMLGregorianCalendarEditor;
import com.client.core.base.util.Util;
import com.client.core.datatables.model.configuration.column.ColumnConfiguration;
import com.client.core.datatables.model.configuration.table.TableConfiguration;
import com.client.core.datatables.service.DataTablesService;

/**
 * Generic controller for all datatables handling. This class should be extended by your specific type T.
 * 
 * DO NOT edit this class, rather extend and override the methods you need to customize.
 * 
 * @author magnus.palm
 * 
 * @param <T>
 *            entity that will be handled by the datatables, represent one JPA entity.
 * @param <ID>
 *            the unique identifier of entity T
 */
public abstract class AbstractDataTablesController<T, ID> implements DataTablesController<T, ID> {

    private TableConfiguration<T, ID> tableConfig;
    private DataTablesService<T, ID> dataTablesService;
    private String tableName;
    private Logger log;
    private T entity;
    private String viewName;
    private String customUrl;
    private ApplicationSettings appSettings;
    private Class<T> type;
    private Map<String, Map<String, String>> dropDownFiller;
	public final static String JSON = "application/json;charset=UTF-8";

    /**
     * Takes a StandardTableConfiguration and uses is to configure the controller.
     *
     * @param tableConfig
     */
    @Override
    public void configureTable(TableConfiguration<T, ID> tableConfig) {
        this.tableConfig = tableConfig;
        this.dataTablesService = tableConfig.getDataTablesService();
        this.tableName = tableConfig.getTableName();
        this.log = tableConfig.getLog();
        this.entity = tableConfig.getEntity();
        this.viewName = tableConfig.getViewName();
        this.customUrl = tableConfig.getCustomUrl();
        this.appSettings = tableConfig.getAppSettings();
        @SuppressWarnings("unchecked")
        Class<T> cls = (Class<T>) entity.getClass();
        this.type = cls;
        this.dropDownFiller = tableConfig.getDropDownFiller();
        addStandardDropDownFillers();
    }

    private void addStandardDropDownFillers() {
        setDropDownValuesFor("yesNo", YesNo.map());
    }

    /**
     * Methods for handling drop down values
     * 
     * @param key
     * @return
     */
    public Map<String, String> getDropDownValuesFor(String key) {
        return dropDownFiller.get(key);
    }

    public TableConfiguration<T, ID> getTableConfig() {
        return tableConfig;
    }

    public Map<String, Map<String, String>> getDropDownFiller() {
        return dropDownFiller;
    }

    public void setDropDownFiller(Map<String, Map<String, String>> dropDownFiller) {
        this.dropDownFiller = dropDownFiller;
    }

    /**
     * Adds one record to the dropDownFiller map
     * 
     * @param key
     *            of the record to add to the dropDownFiller
     * @param values
     *            a map containing "id":"value" to display in a drop down menu on the jsp page
     */
    public void setDropDownValuesFor(String key, Map<String, String> values) {
        dropDownFiller.put(key, values);
    }

    /**
     * Gets a value from the dropDownFiller map using the key passed in, the return will be used to populate the drop down menu
     * when editing a value in the data tables that is of drop down type.
     * 
     * @param values
     * @return
     */
    protected String getJsonFormattedDropDownValues(Map<String, String> values) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (builder.length() > 1) {
                builder.append(",");
            }
            builder.append("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");

        }
        builder.append("}");
        return builder.toString();
    }
    
    protected String getJsonFormattedDropDownValues(String key) {
        Map<String, String> values = getDropDownValuesFor(key);
        
        return getJsonFormattedDropDownValues(values);
    }

    /**
     * Adds a new instance of T to the model to be used when adding a new entity T
     * 
     * @param model
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Override
    @ModelAttribute
    public void populateFormWithNewEntity(HttpServletRequest request, Model model) throws InstantiationException,
            IllegalAccessException {
        T newEntity = type.newInstance();
        model.addAttribute("newEntity", newEntity);
    }

    /**
     * Initializes the data table, this is the starting point when the page is hit.
     * 
     * Note that the standard implementation of the datatables framwork only works with one table per page. If multiple tables
     * need to be displayed on the same page the init method will need to be overriden in order to add unique module attributes.
     * In addition the simpleDataTables.jsp will need to be copied for each table and the property place holders updated to match
     * the new model attributes.
     * 
     * @param model
     * 
     * @return the view
     */
    @Override
    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(HttpServletRequest request, HttpServletResponse response, Model model) {
        ColumnConfiguration columnConfiguration = dataTablesService.convertEntityToColumns(entity);
        String applicationDateFormat = appSettings.getApplicationDateFormat();

        dataTablesService.additionalColumnConfiguration(columnConfiguration, request, response, model);

        model.addAttribute("columnsMap", columnConfiguration.getColumnConfigMap());
        model.addAttribute("applicationDateFormat", Util.convertToBootstrapDateFormat(applicationDateFormat));
        model.addAttribute("columnConfigDataTables", columnConfiguration.assembleColumnConfigForDataTables());
        model.addAttribute("columnConfigDataTablesEditable", columnConfiguration.assembleColumnConfigForDataTablesEditable());
        model.addAttribute("allowAdd", tableConfig.getRecordsCanBeAdded());
        model.addAttribute("allowDelete", tableConfig.getRecordsCanBeDeleted());
        model.addAttribute("entityName", tableConfig.getEntityName() == null ? type.getSimpleName() : tableConfig.getEntityName());
        model.addAttribute("customUrl", customUrl);
        model.addAttribute("dropDownFiller", dropDownFiller);
        model.addAttribute("tableName", tableName);
        return viewName;
    }

    /**
     * Helper method to populate the transaction dashboard. Called by the datatables in the dashboardMain.jsp
     * 
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    @RequestMapping(value = "/data", method = RequestMethod.POST, produces = JSON)
    @ResponseBody
    public String dashboardData(HttpServletRequest request, HttpServletResponse response) {
        return dataTablesService.processRequestForDataTables(request).toString();
    }

    /**
     * Handles editing of records using the primary key, column position and new value for that column.
     * 
     * @param id
     *            the primary key of the record
     * @param columnPosition
     *            the column position in the table
     * @param value
     *            the new value
     * @return the new value if successful edit, otherwise an error message
     */
    @Override
    @RequestMapping(value = "/edit", method = RequestMethod.POST, produces = JSON)
    @ResponseBody
    public String editRecord(@RequestParam("id") ID id, @RequestParam("columnPosition") Integer columnPosition,
            @RequestParam("value") String value, HttpServletRequest request,
            HttpServletResponse response, Model model) {

        try {
            validate(id, columnPosition, value);
        } catch (ValidationException e) {
            return e.getMessage();
        }

        try {
            String validationErrors = dataTablesService.editEntity(id, columnPosition, value, request, response, model);
            if (validationErrors.length() > 0) {
                return validationErrors;
            }
            return formatValueForDisplay(id, value);
        } catch (EntityNotFoundException e) {
            log.error("Error updating record. Entity does not exist with id = " + id, e);
            return "Error updating record. Entity does not exist with id = " + id;
        } catch (Exception e) {
            log.error("Error updating record: id = " + id + " value = " + value, e);
            return "Error updating record";
        }

    }

    /**
     * Validates an entity and if validation passes adds that record.
     * 
     * @param entityID
     *            The entity to add and validate
     * 
     * @param response
     * 
     * @return the primary key of the new record if successful insert, otherwise validation or error messages.
     */
    @Override
    @RequestMapping(value = "/prepareformedit", method = RequestMethod.GET, produces = JSON)
    @ResponseBody
    public String prepareFormForEditEntity(@RequestParam("entityID") ID entityID, HttpServletRequest request,
            HttpServletResponse response, Model model) {

        try {
            T entityToEdit = dataTablesService.find(entityID);
            ColumnConfiguration columnConfiguration = dataTablesService.convertEntityToColumns(entityToEdit);
            String jsonValues = columnConfiguration.getJsonValuesForFormEdit();
            return jsonValues;
        } catch (Exception e) {
            log.error("Error preparing form for edit record.", e);
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            return "Error getting entity to edit";
        }

    }

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
    @Override
    @RequestMapping(value = "/postformedit", method = RequestMethod.POST, produces = JSON)
    @ResponseBody
    public String editEntityUsingForm(@ModelAttribute T entity, @RequestParam("entityID") ID entityID,
            HttpServletRequest request, HttpServletResponse response) {
        // pass validation etc down to the service layer
        return dataTablesService.handleEntityFormEdit(entity, entityID, request, response);

    }

    /**
     * Method for adding any validations for specific or special fields. Any child class that needs to add special validations can
     * override this method and add it's own implementation.
     */
    protected void validate(ID id, Integer columnPosition, String value) throws ValidationException {
        return;
    }

    /**
     * Method for subclasses to implement if needed, to format the returned value.
     * 
     * @param id
     *            the id of the entity that was edited
     * @param value
     *            the new value
     * @return the formatted value.
     */
    protected String formatValueForDisplay(ID id, String value) {
        return value;
    }

    /**
     * Deletes the record with unique identifier (such as primary key) id
     * 
     * @param id
     *            the unique identifier of the record
     * 
     * @return a blank String if success, otherwise an error message.
     */
    @Override
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = JSON)
    @ResponseBody
    public String deleteRecord(@RequestParam("id") ID id) {

        try {
            dataTablesService.removeUsingID(id);
            return "";
        } catch (EntityNotFoundException e) {
            log.error("Error deleting record. Entity does not exist with id = " + id, e);
            return "Error deleting record. Entity does not exist with id = " + id;
        }

        catch (Exception e) {
            log.error("Error deleting record: id = " + id, e);
            return "Error deleting record";
        }

    }

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
    @Override
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = JSON)
    @ResponseBody
    public String addRecord(@ModelAttribute("newEntity") T entity, HttpServletRequest request,
            HttpServletResponse response) {

        String validationErrors = dataTablesService.validateEntity(entity);

        if (validationErrors.length() > 0) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            return validationErrors;
        } else {
            try {
                return dataTablesService.addAndReturnID(entity).toString();
               
            } catch (Exception e) {
                log.error("Error adding record", e);
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                return "Error adding record";
            }
        }
    }
    
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
    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = JSON)
    @ResponseBody
    public String updateRecord(@ModelAttribute("newEntity") T entity, HttpServletRequest request,
            HttpServletResponse response) {

        String validationErrors = dataTablesService.validateEntity(entity);

        if (validationErrors.length() > 0) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            return validationErrors;
        } else {
            try {
                
            	return dataTablesService.updateAndReturnID(entity).toString();
            } catch (Exception e) {
                log.error("Error adding record", e);
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                return "Error adding record";
            }
        }
    }

    /**
     * Annotation that identifies methods which initialize the {@link org.springframework.web.bind.WebDataBinder} which will be
     * used for populating command and form object arguments of annotated handler methods.
     * 
     * Registers custom editors
     * 
     * Handles the date format from the form, using the application date format from application settings.
     * 
     * @param binder
     * @param locale
     */
    @InitBinder
    public void initBinder(WebDataBinder binder, Locale locale) {

        binder.setIgnoreInvalidFields(true);
        binder.setIgnoreUnknownFields(true);
   
        String applicationDateFormatString = appSettings.getApplicationDateFormat();
        SimpleDateFormat dateFormat = new SimpleDateFormat(applicationDateFormatString);
        dateFormat.setLenient(false);

        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
        binder.registerCustomEditor(Integer.class, new CustomNumberEditor(Integer.class, true));
        binder.registerCustomEditor(Boolean.class, new CustomBooleanEditor(true));
        binder.registerCustomEditor(XMLGregorianCalendar.class, new CustomXMLGregorianCalendarEditor(dateFormat, true));
        binder.registerCustomEditor(DateTime.class, new CustomDateTimeEditor(applicationDateFormatString, true));
        binder.registerCustomEditor(String.class, new CustomObjectEditor());

    }

    /**
     * Register a validator for validation of entity using @Valid in the controller method
     * 
     * @param binder
     * @param locale
     */
    @InitBinder("newEntity")
    public void initEntityValidatorBinder(WebDataBinder binder, Locale locale) {
        // add validator to support custom validations for @Valid annotation on controllers
        binder.addValidators(this.dataTablesService.getValidator());
    }

    @Override
    public DataTablesService<T, ID> getDataTablesService() {
        return dataTablesService;
    }

    @Override
    public Logger getLog() {
        return log;
    }

    @Override
    public T getEntity() {
        return entity;
    }

    @Override
    public String getViewName() {
        return viewName;
    }

    @Override
    public String getCustomUrl() {
        return customUrl;
    }

    @Override
    public ApplicationSettings getAppSettings() {
        return appSettings;
    }

    @Override
    public Class<T> getType() {
        return type;
    }

}
