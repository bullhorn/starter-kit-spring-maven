package com.client.core.datatables.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

import com.bullhorn.entity.AbstractDto;
import com.client.core.ApplicationSettings;
import com.client.core.base.dao.GenericDao;
import com.client.core.datatables.model.column.Column;
import com.client.core.datatables.model.configuration.column.ColumnConfiguration;
import com.client.core.datatables.tools.JQueryDataTableParamModel;
import com.client.core.datatables.tools.enumeration.Editable;
import com.client.core.datatables.tools.enumeration.Entity;
import com.client.core.datatables.tools.enumeration.FieldType;
import com.client.core.datatables.tools.enumeration.Required;
import com.client.core.datatables.tools.enumeration.Searchable;
import com.client.core.datatables.tools.enumeration.ShowOnForm;
import com.client.core.datatables.tools.enumeration.Sortable;
import com.client.core.datatables.tools.enumeration.Visible;
import com.client.core.datatables.model.column.standard.StandardColumn;
import com.client.core.datatables.tools.RowComparator;
import com.client.core.soap.tools.property.DtoFieldChangeFactory;
import com.client.core.soap.tools.property.setdtofields.DtoFieldSetService;
import com.client.core.base.tools.query.QueryHelper;
import com.client.core.base.util.Util;

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

	private final Logger log = Logger.getLogger(AbstractDataTablesService.class);

	private final GenericDao<T, ID> genericDao;

	private final ApplicationSettings appSettings;

	private final Validator validator;

	private final MessageSource messageSource;

	private final QueryHelper queryHelper;

	@Autowired
	@Qualifier("dtoFieldChangeFactory")
	private DtoFieldChangeFactory dtoFieldChangeFactory;

	public AbstractDataTablesService(GenericDao<T, ID> genericDao, ApplicationSettings appSettings, Validator validator,
			MessageSource messageSource, QueryHelper queryHelper) {
		this.genericDao = genericDao;
		this.appSettings = appSettings;
		this.validator = validator;
		this.messageSource = messageSource;
		this.queryHelper = queryHelper;
	}

	@Override
	public abstract ColumnConfiguration convertEntityToColumns(T entity);

	@Override
	public abstract T convertColumnsToEntity(ColumnConfiguration rowConfig, T oldEntity);

	@Override
	public void additionalColumnConfiguration(ColumnConfiguration columnConfiguration, HttpServletRequest request,
			HttpServletResponse response, Model model) {

	}

	@Override
	public JSONObject processRequestForDataTables(HttpServletRequest request) {
		JQueryDataTableParamModel param = new JQueryDataTableParamModel(request);

		// Get the data. Check in the session first for cached data
		@SuppressWarnings("unchecked")
		List<T> tableRows = (List<T>) request.getSession().getAttribute("tableRows");

		List<T> allTableRows = getData(tableRows, false, request);
		param.setiTotalRecords(allTableRows.size());
		// Filter the data
		List<T> filterRows = filterRows(allTableRows, param);
		// Sort the data
		sortRows(filterRows, param);
		// only handle pagination if accessing data from datatables

		param.setiTotalDisplayRecords(filterRows.size());
		if (param.isDataAccessedFromDataTables()) {
			// Handle pagination
			filterRows = handlePagination(filterRows, param);
		}

		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject = constructJsonObjectResponseFromTableRows(filterRows, param);
		} catch (JSONException e) {
			log.error("Error constructing JSONObject", e);
		}
		return jsonObject;

	}

	@Override
	public List<T> getData(List<T> tableRows, boolean useCache, HttpServletRequest request) {
		return findAll(tableRows, useCache);
	}

	/*
	 * Start of @Transactional methods
	 */

	@Transactional(timeout = 60)
	@Override
	public List<T> findAll(List<T> tableRows, boolean useCache) {
		if (useCache && tableRows != null) {
			return tableRows;
		} else {
			return genericDao.findAll();
		}

	}

	@Transactional(timeout = 60)
	@Override
	public T add(T transientObject) {
		return genericDao.merge(transientObject);
	}

	@Transactional(timeout = 60)
	@Override
	public ID addAndReturnID(T transientObject) {
		return genericDao.mergeAndReturnID(transientObject);
	}

	@Transactional(timeout = 60)
	@Override
	public T update(T transientObject) {
		return genericDao.merge(transientObject);
	}

	@Transactional(timeout = 60)
	@Override
	public ID updateAndReturnID(T transientObject) {
		return genericDao.mergeAndReturnID(transientObject);
	}

	@Transactional(timeout = 60)
	@Override
	public T find(ID id) throws EntityNotFoundException {
		return genericDao.find(id);
	}

	@Transactional(timeout = 60)
	@Override
	public void remove(T persistentObject) throws EntityNotFoundException {
		genericDao.remove(persistentObject);

	}

	@Transactional(timeout = 60)
	@Override
	public void removeUsingID(ID id) throws EntityNotFoundException {
		T persistentObject = genericDao.find(id);
		this.remove(persistentObject);
	}


	@Transactional(timeout = 120, readOnly = true)
	@Override
	public List<T> query(String queryString, Map<String, Object> queryParameters) {
		return genericDao.query(queryString, queryParameters);
	}

	@Transactional(timeout = 60)
	@Override
	public String editEntity(ID id, Integer columnPosition, Object value, HttpServletRequest request, HttpServletResponse response,
			Model model) {
		// Get the entity using the ID
		T oldEntity = genericDao.find(id);
		// convert entity to map
		ColumnConfiguration columnConfiguration = convertEntityToColumns(oldEntity);

		// In case there are custom column config additionalColumnConfiguration is called here and in init
		additionalColumnConfiguration(columnConfiguration, request, response, model);
		// Handle column position when there are invisible columns
		columnPosition = adjustColumnPositionDueToInvisibleColumns(columnConfiguration, columnPosition);
		// update the map with new value
		columnConfiguration.getColumn(columnPosition).setValue(value);

		// Convert the map back to entity T
		T entity = convertColumnsToEntity(columnConfiguration, oldEntity);
		// Validate Entity
		String validationError = validateEntity(entity);

		// if no validation errors, save the entity
		if (validationError == null || validationError.trim().isEmpty()) {
			// Save the entity
			genericDao.merge(entity);
		}
		return validationError;

	}

	@Transactional(timeout = 60)
	@Override
	public String handleEntityFormEdit(T entity, ID entityID, HttpServletRequest request, HttpServletResponse response) {

		try {
			// Handle bullhorn entities using dtochanger tool
			if (entity instanceof AbstractDto) {
				entity = updateExistingEntity(entityID, request, response);
			}

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

	/*
	 * End of @Transactional methods
	 */

	/**
	 * Takes an enitityID, finds that entity, updates it with the parametersmap in the request and passes back the updated entity
	 * 
	 * @param entityID
	 * @param request
	 * @param response
	 * @return
	 */
	private <E extends AbstractDto> T updateExistingEntity(ID entityID, HttpServletRequest request, HttpServletResponse response) {
		E existingEntity = (E) genericDao.find(entityID);
		Map<String, String> valuesFromPostedForm = Util.convertParameterMap(request);
		DtoFieldSetService<E> dtoFieldSetService = (DtoFieldSetService<E>) dtoFieldChangeFactory.setServiceByClass(existingEntity
				.getClass());
		E updatedEntity = dtoFieldSetService.changeDto(existingEntity, valuesFromPostedForm, this.getAppSettings()
				.getApplicationDateFormat(), false);
		return (T) updatedEntity;
	}

	@Override
	public Integer adjustColumnPositionDueToInvisibleColumns(ColumnConfiguration columnConfiguration, Integer columnPosition) {

		TreeMap<Integer, Column> columnConfigMap = columnConfiguration.getColumnConfigMap();
		int newColumnPosition = columnPosition;

		// loop over the columns and for each invisible column that is located before the
		// column to check add one to new column position
		for (Map.Entry<Integer, Column> entry : columnConfigMap.entrySet()) {

			int columnSettingPosition = entry.getKey();
			boolean columnIsVisible = entry.getValue().isVisible();

			if (columnIsVisible == false && columnSettingPosition <= newColumnPosition) {
				newColumnPosition++;
			}

		}
		return newColumnPosition;
	}

	@Override
	public String validateEntity(T entity) {

		DataBinder binder = new DataBinder(entity);
		binder.setValidator(validator);
		// validate the target object
		binder.validate();
		// get BindingResult that includes any validation errors
		BindingResult results = binder.getBindingResult();
		return prepareValidationErrorMessage(results, entity);
	}

	@Override
	public String prepareValidationErrorMessage(BindingResult bindingResult, T entity) {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = "<br/>";

		// Get table config for labels
		ColumnConfiguration tableConfig = convertEntityToColumns(entity);

		// add errors to
		for (Object object : bindingResult.getAllErrors()) {
			if (object instanceof FieldError) {
				FieldError fieldError = (FieldError) object;
				result.append(tableConfig.getLabelForFieldName(fieldError.getField()) + ": " + fieldError.getDefaultMessage() + NEW_LINE);
			}
		}
		return result.toString();
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
	 * @param entity
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

	public Column column(String fieldName, String fieldLabel, Object value, Object displayValue, FieldType fieldType, Entity entity,
			Editable editable, Visible visible, Sortable sortable, Searchable searchable, Required required, ShowOnForm showOnForm,
			String url) {
		return new StandardColumn(fieldName, fieldLabel, value, displayValue, fieldType, entity, editable, visible, sortable, searchable,
				required, showOnForm, url, null);
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
	 * @param entity
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
	public Column column(String fieldName, String fieldLabel, Object value, Object displayValue, FieldType fieldType, Entity entity,
			Editable editable, Visible visible, Sortable sortable, Searchable searchable, Required required, ShowOnForm showOnForm,
			String url, String width) {
		return new StandardColumn(fieldName, fieldLabel, value, displayValue, fieldType, entity, editable, visible, sortable, searchable,
				required, showOnForm, url, width);
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

		// Loop over each row
		for (T row : tableRows) {
			// create one JSONArray for each row
			JSONArray tableRow = new JSONArray();

			// Convert the row to a map containing all fields to be displayed
			ColumnConfiguration columnConfiguration = convertEntityToColumns(row);

			// loop over each field and add to the JSONArray
			for (Column column : columnConfiguration.getColumnConfigMap().values()) {
				tableRow.put(column.getDisplayValue());
			}

			jsonArray.put(tableRow);
		}

		return jsonArray;
	}

	/**
	 * Filters the rows based on parameters in JQueryDataTableParamModel
	 * 
	 * @param allTableRows
	 * @param param
	 * @return
	 */
	protected List<T> filterRows(List<T> allTableRows, JQueryDataTableParamModel param) {
		String quickSearch = param.getsSearch();
		List<T> filterRows = new ArrayList<T>();
		boolean searchTextIsEmpty = searchTextIsEmpty(quickSearch);

        if(StringUtils.isNotBlank(quickSearch)) {
            quickSearch = quickSearch.toLowerCase();
        }

		for (T row : allTableRows) {
			if (searchTextIsEmpty) {
				filterRows.add(row);
				continue;
			}

			// convert the entity/row to a tableConfiguration
			ColumnConfiguration columnConfiguration = convertEntityToColumns(row);

			// loop over each column in the columnconfig map and search with quicksearch param
			// passed from datatables
			for (Column column : columnConfiguration.getColumnConfigMap().values()) {
				if (valueInSearch(column.getDisplayValue(), quickSearch) && column.isSearchable()) {
					filterRows.add(row);
					break;
				}
			}
		}

		return filterRows;
	}

	private boolean searchTextIsEmpty(String quickSearch) {
		if (quickSearch == null || quickSearch.trim().length() == 0) {
			return true;
		}
		return false;
	}

	/*
	 * Filters based on "contains", so if the value contains searchString return true
	 */
	private boolean valueInSearch(Object value, String searchString) {

		if (value == null) {
			return false;
		}

		if (searchString == null || "".equals(searchString)) {
			return true;
		}

		String stringValue = value.toString();
		if (stringValue.toLowerCase().trim().contains(searchString)) {
			return true;
		}
		return false;

	}

	protected void sortRows(List<T> filterRows, final JQueryDataTableParamModel param) {

		Collections.sort(filterRows, new RowComparator<T>(param, this));
	}

	protected List<T> handlePagination(List<T> filterRows, JQueryDataTableParamModel param) {
		int displayFromThisRow = param.getiDisplayStart();
		int numberOfRowsToDisplay = param.getiDisplayLength();

		if (filterRows.size() < displayFromThisRow + numberOfRowsToDisplay) {
			filterRows = filterRows.subList(displayFromThisRow, filterRows.size());
		} else {
			filterRows = filterRows.subList(displayFromThisRow, displayFromThisRow + numberOfRowsToDisplay);
			getLog().debug("filterRows.size = " + filterRows.size());
		}

		return filterRows;
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

	@Override
	public GenericDao<T, ID> getGenericDao() {
		return genericDao;
	}

	@Override
	public ApplicationSettings getAppSettings() {
		return appSettings;
	}

	@Override
	public Validator getValidator() {
		return validator;
	}

	@Override
	public DtoFieldChangeFactory getDtoFieldChangeFactory() {
		return dtoFieldChangeFactory;
	}

	@Override
	public Logger getLog() {
		return log;
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
	public <E extends Comparable<?>> E toType(Class<E> type, Object value) {

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

	@Override
	public String getMessageUsingKey(String key) {

		String errorText = "";
		try {
			errorText = messageSource.getMessage(key, null, Locale.US);
		} catch (NoSuchMessageException e) {
			log.error("No message with key: " + key + " exists.", e);
		}
		return errorText;
	}

	@Override
	public String getQueryUsingKey(String key) {
		return queryHelper.getQueryUsingKey(key);
	}

}
