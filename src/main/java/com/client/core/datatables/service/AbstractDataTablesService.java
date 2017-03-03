package com.client.core.datatables.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

import com.client.core.AppContext;
import com.client.core.base.util.Util;
import com.client.core.datatables.model.column.Column;
import com.client.core.datatables.model.column.standard.StandardColumn;
import com.client.core.datatables.model.configuration.column.ColumnConfiguration;
import com.client.core.datatables.tools.JQueryDataTableParamModel;
import com.client.core.datatables.tools.enumeration.Editable;
import com.client.core.datatables.tools.enumeration.FieldType;
import com.client.core.datatables.tools.enumeration.IsEntityField;
import com.client.core.datatables.tools.enumeration.Required;
import com.client.core.datatables.tools.enumeration.Searchable;
import com.client.core.datatables.tools.enumeration.ShowOnForm;
import com.client.core.datatables.tools.enumeration.Sortable;
import com.client.core.datatables.tools.enumeration.Visible;

/**
 * Extend this class to get data tables editable functionality for free.
 *
 * Contains generic logic to handle datatables retrieving of data, editing data, entity validation, sorting of rows, filtering of rows.
 *
 * If custom functionality needs to be added, DO NOT edit this class, instead overwrite the relevant methods in your concrete class.
 *
 * @author magnus.palm
 *
 * @param <T>
 *            entity that will be handled by the datatables, represents one entity of any type, such as JPA MongoDB etc.
 * @param <ID>
 *            the unique identifier of entity T
 */
public abstract class AbstractDataTablesService<T, ID> implements DataTablesService<T, ID> {

    private final Logger log = Logger.getLogger(getClass());

    private final Validator validator;

    public AbstractDataTablesService(Validator validator) {
        this.validator = validator;
    }

    public AbstractDataTablesService() {
        this.validator = AppContext.getApplicationContext().getBean("validator", Validator.class);
    }

    @Override
    public abstract ColumnConfiguration convertEntityToColumns(T entity);

    protected abstract T convertColumnsToEntity(ColumnConfiguration rowConfig, T oldEntity);

    @Override
    public abstract T find(ID id) throws EntityNotFoundException;

    @Override
    public abstract void removeUsingID(ID id);

    protected abstract T add(T transientObject);

    protected abstract T update(T transientObject);

    protected abstract List<T> getData(HttpServletRequest request, JQueryDataTableParamModel param);

    protected abstract ID getId(T entity);

    @Override
    public JSONObject processRequestForDataTables(HttpServletRequest request) {
        JQueryDataTableParamModel param = new JQueryDataTableParamModel(request);

        List<T> rows = getData(request, param);

        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject = constructJsonObjectResponseFromTableRows(rows, param);
        } catch (JSONException e) {
            log.error("Error constructing JSONObject", e);
        }

        return jsonObject;
    }

    @Override
    public void additionalColumnConfiguration(ColumnConfiguration columnConfiguration, HttpServletRequest request,
                                              HttpServletResponse response, Model model) {

    }

    @Override
    public ID addAndReturnID(T transientObject) {
        return getId(add(transientObject));
    }

    @Override
    public ID updateAndReturnID(T transientObject) {
        return getId(update(transientObject));
    }

    @Override
    public String editEntity(ID id, Integer columnPosition, Object value, HttpServletRequest request, HttpServletResponse response,
                             Model model) {
        T oldEntity = find(id);

        ColumnConfiguration columnConfiguration = convertEntityToColumns(oldEntity);

        additionalColumnConfiguration(columnConfiguration, request, response, model);

        columnPosition = adjustColumnPositionDueToInvisibleColumns(columnConfiguration, columnPosition);

        columnConfiguration.getColumn(columnPosition).setValue(value);

        T entity = convertColumnsToEntity(columnConfiguration, oldEntity);

        String validationError = validateEntity(entity);

        if (validationError == null || validationError.trim().isEmpty()) {
            update(entity);
        }

        return validationError;
    }

    @Override
    public String handleEntityFormEdit(T entity, ID entityID, HttpServletRequest request, HttpServletResponse response) {
        try {
            String validationErrors = validateEntity(entity);

            if (validationErrors.length() > 0) {
                response.setStatus(HttpStatus.BAD_REQUEST.value());

                return validationErrors;
            } else {
                return updateAndReturnID(entity).toString();
            }
        } catch (Exception e) {
            log.error("Error adding record", e);

            response.setStatus(HttpStatus.BAD_REQUEST.value());

            return "Error adding record";
        }
    }

    @Override
    public String validateEntity(T entity) {
        DataBinder binder = new DataBinder(entity);

        binder.setValidator(validator);

        binder.validate();

        BindingResult results = binder.getBindingResult();

        return prepareValidationErrorMessage(results, entity);
    }

    protected Integer adjustColumnPositionDueToInvisibleColumns(ColumnConfiguration columnConfiguration, Integer columnPosition) {
        TreeMap<Integer, Column> columnConfigMap = columnConfiguration.getColumnConfigMap();

        int newColumnPosition = columnPosition;

        for (Map.Entry<Integer, Column> entry : columnConfigMap.entrySet()) {
            int columnSettingPosition = entry.getKey();

            boolean columnIsVisible = entry.getValue().isVisible();

            if (columnIsVisible == false && columnSettingPosition <= newColumnPosition) {
                newColumnPosition++;
            }
        }

        return newColumnPosition;
    }

    protected String prepareValidationErrorMessage(BindingResult bindingResult, T entity) {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = "<br/>";

        ColumnConfiguration tableConfig = convertEntityToColumns(entity);

        for (Object object : bindingResult.getAllErrors()) {
            if (object instanceof FieldError) {
                FieldError fieldError = (FieldError) object;

                result.append(tableConfig.getLabelForFieldName(fieldError.getField()) + ": " + fieldError.getDefaultMessage() + NEW_LINE);
            }
        }

        return result.toString();
    }

    /**
     * Populates a JSONArray with entity T, each row containing the values from T that should be displayed in the DataTables
     *
     * @param tableRows
     *            A list of T, that will be converted to the JSONArray
     *
     * @return The JSONArray used as aaData in the JSONObject being returned from getDataSortFilterAndConstructJsonObject
     */
    private JSONArray convertTableRowsToJsonArray(List<T> tableRows) {
        JSONArray jsonArray = new JSONArray();

        for (T row : tableRows) {
            JSONArray tableRow = new JSONArray();

            ColumnConfiguration columnConfiguration = convertEntityToColumns(row);

            for (Column column : columnConfiguration.getColumnConfigMap().values()) {
                tableRow.put(column.getDisplayValue());
            }

            jsonArray.put(tableRow);
        }

        return jsonArray;
    }

    protected JSONObject constructJsonObjectResponseFromTableRows(List<T> filterRows, JQueryDataTableParamModel param) throws JSONException {
        JSONArray jsonArray = convertTableRowsToJsonArray(filterRows);

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("sEcho", param.getsEcho());
        jsonObject.put("iTotalRecords", param.getiTotalRecords());
        jsonObject.put("iTotalDisplayRecords", param.getiTotalDisplayRecords());
        jsonObject.put("aaData", jsonArray);

        return jsonObject;
    }

    /**
     * Converts the object passed in back to its original type E by casting. Special handling (such as for joda DateTime) takes place here.
     *
     * @param type
     *            the type Class<E> to convert the object to
     * @param value
     *            the Object to covert
     * @return the converted value as a type of E
     */
    protected <E extends Comparable<?>> E toType(Class<E> type, Object value) {
        if (value == null || (("" + value).isEmpty() && type != String.class)) {
            return null;
        }

        if (type == DateTime.class) {
            return (E) new DateTime(value);
        }
        if (type == BigDecimal.class) {
            return (E) new BigDecimal("" + value);
        }
        if (type == Integer.class) {
            return (E) Integer.valueOf("" + value);
        }

        if (type == Boolean.class) {
            return (E) Util.convertToBoolean(value);
        }

        if (type == String.class) {
            return (E) value.toString();
        }

        return (E) value;
    }

    /**
     * Maps a column in the data tables.
     *
     * @param fieldName
     *            Has to be exact match to field on entity
     * @param fieldLabel
     *            The column label used in the data tables
     * @param value
     *            The actual value as it's own type
     * @param displayValue
     *            The display value. This can be the same as value any text
     * @param fieldType
     *            Specifies what type of field, such as ID, DATE,BUTTON etc. See FieldType enum for full list.
     *
     * @param isEntityField
     *            Defines if the column is part of the JPA entity
     * @param editable
     *            Defines if the column can be edited
     * @param visible
     *            Defines if the column is visable
     * @param sortable
     *            Defines if the column can be sorted
     * @param searchable
     *            Defines if the column will be part of the search
     * @param showOnForm
     *            Defines if the column will show up on the add new entity form
     * @param url
     *            Defines the url of a link. If the FieldType is a select then this url will be the url that provide the data for the
     *            select.
     * @return The StandardColumn
     */

    protected Column column(String fieldName, String fieldLabel, Object value, Object displayValue, FieldType fieldType, IsEntityField isEntityField,
                            Editable editable, Visible visible, Sortable sortable, Searchable searchable, Required required, ShowOnForm showOnForm,
                            String url) {
        return new StandardColumn(fieldName, fieldLabel, value, displayValue, fieldType, isEntityField, editable, visible, sortable, searchable,
                required, showOnForm, url, null, false);
    }

    /**
     * Maps a column in the data tables, with additional width parameter.
     *
     * @param fieldName
     *            Has to be exact match to field on entity
     * @param fieldLabel
     *            The column label used in the data tables
     * @param value
     *            The actual value as it's own type
     * @param displayValue
     *            The display value. This can be the same as value any text
     * @param fieldType
     *            Specifies what type of field, such as ID, DATE,BUTTON etc. See FieldType enum for full list.
     *
     * @param isEntityField
     *            Defines if the column is part of the JPA entity
     * @param editable
     *            Defines if the column can be edited
     * @param visible
     *            Defines if the column is visable
     * @param sortable
     *            Defines if the column can be sorted
     * @param searchable
     *            Defines if the column will be part of the search
     * @param showOnForm
     *            Defines if the column will show up on the add new entity form
     * @param url
     *            Defines the url of a link. If the FieldType is a select then this url will be the url that provide the data for the
     *            select.
     * @param width
     *            Defining the width of the column, this parameter may take any CSS value (3em, 20px etc). DataTables applies 'smart' widths
     *            to columns which have not been given a specific width through this interface ensuring that the table remains readable.
     * @return The StandardColumn
     */
    protected Column column(String fieldName, String fieldLabel, Object value, Object displayValue, FieldType fieldType, IsEntityField isEntityField,
                            Editable editable, Visible visible, Sortable sortable, Searchable searchable, Required required, ShowOnForm showOnForm,
                            String url, String width) {
        return new StandardColumn(fieldName, fieldLabel, value, displayValue, fieldType, isEntityField, editable, visible, sortable, searchable,
                required, showOnForm, url, width, false);
    }

    /**
     * Maps a column in the data tables, with additional width parameter.
     *
     * @param fieldName
     *            Has to be exact match to field on entity
     * @param fieldLabel
     *            The column label used in the data tables
     * @param value
     *            The actual value as it's own type
     * @param displayValue
     *            The display value. This can be the same as value any text
     * @param fieldType
     *            Specifies what type of field, such as ID, DATE,BUTTON etc. See FieldType enum for full list.
     *
     * @param isEntityField
     *            Defines if the column is part of the JPA entity
     * @param editable
     *            Defines if the column can be edited
     * @param visible
     *            Defines if the column is visable
     * @param sortable
     *            Defines if the column can be sorted
     * @param searchable
     *            Defines if the column will be part of the search
     * @param showOnForm
     *            Defines if the column will show up on the add new entity form
     * @param url
     *            Defines the url of a link. If the FieldType is a select then this url will be the url that provide the data for the
     *            select.
     * @param width
     *            Defining the width of the column, this parameter may take any CSS value (3em, 20px etc). DataTables applies 'smart' widths
     *            to columns which have not been given a specific width through this interface ensuring that the table remains readable.
     * @return The StandardColumn
     */
    protected Column column(String fieldName, String fieldLabel, Object value, Object displayValue, FieldType fieldType, IsEntityField isEntityField,
                            Editable editable, Visible visible, Sortable sortable, Searchable searchable, Required required, ShowOnForm showOnForm,
                            String url, String width, Boolean isListInput) {
        return new StandardColumn(fieldName, fieldLabel, value, displayValue, fieldType, isEntityField, editable, visible, sortable, searchable,
                required, showOnForm, url, width, isListInput);
    }

    protected Logger getLog() {
        return log;
    }

    @Override
    public Validator getValidator() {
        return validator;
    }
}
