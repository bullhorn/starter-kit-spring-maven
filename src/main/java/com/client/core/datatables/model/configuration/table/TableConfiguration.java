package com.client.core.datatables.model.configuration.table;

import java.util.Map;
import org.apache.log4j.Logger;
import com.client.core.ApplicationSettings;
import com.client.core.datatables.service.DataTablesService;

/**
 * Contains the configuration for one DataTable
 * 
 * @author magnus.palm
 * 
 * @param <T>
 *            the entity, for example a JpaEntity
 * @param <ID>
 *            the unique identifier of the entity, for the example the primary key of the JpaEntity
 */
public interface TableConfiguration<T, ID> {

	/**
	 * The DataTablesService that is used by the AbstractDataTablesController
	 * 
	 * @return Returns the DataTablesService used for this DataTable
	 */
	public DataTablesService<T, ID> getDataTablesService();

	/**
	 * Sets the DataTablesService used by the AbstractDataTablesController for this DataTable.
	 * 
	 * @param dataTablesService
	 */
	public void setDataTablesService(DataTablesService<T, ID> dataTablesService);

	/**
	 * Returns the id used for the table on the html page
	 * 
	 * @return
	 */
	public String getTableName();

	/**
	 * Sets the id used for the table on the html page, defaults to DefaultValues.DEFAULTDATATABLESNAME. If multiple tables are used on the same
	 * page this needs to be a unique value so that the html id for the table is unique. If multiple tables exist on the same page
	 * the simpleDataTables.jsp will need to be copied and the expression on the JSP page will need to be updated.
	 * 
	 */
	public void setTableName(String tableName);

	/**
	 * 
	 * @return the Logger for the implementation
	 */
	public Logger getLog();

	/**
	 * Sets the Logger for the implementation
	 * 
	 * @param log
	 */
	public void setLog(Logger log);

	/**
	 * Gets an instance of T. This instance should have been set using the default constructor with all fields on the entity T
	 * blank.
	 * 
	 * @return entity T
	 */
	public T getEntity();

	/**
	 * Set this entity to be used in the DataTables
	 * 
	 * @param entity
	 */
	public void setEntity(T entity);

	/**
	 * The view name, most likely a jsp page that will be used for this DataTable.
	 * 
	 * @return the name of the view.
	 */
	public String getViewName();

	/**
	 * 
	 * 
	 * The view name, most likely a jsp page that will be used for this DataTable. Will be used by the
	 * AbstractDataTablesController to determine the view.
	 * 
	 * @param viewName
	 *            the name of the view as a String
	 */
	public void setViewName(String viewName);

	/**
	 * Has to match the @RequestMapping on the controller extending AbstractDataTablesController.
	 * 
	 * @return
	 */
	public String getCustomUrl();

	/**
	 * Has to match the @RequestMapping on the controller extending AbstractDataTablesController. This will be the url where the
	 * DataTable is access: http://localhost:8080/{customUrl}/init.
	 * 
	 * The customUrl is used on the viewName.jsp to set the urls for the datatables and datatables-editable setup. See
	 * WEB-INF/jsp/dataTables/simpleDataTables.jsp
	 * 
	 * @param customUrl
	 */
	public void setCustomUrl(String customUrl);

	/**
	 * The ApplicationSettings used to provide date format among possible other things.
	 * 
	 * @return
	 */
	public ApplicationSettings getAppSettings();

	/**
	 * Sets the ApplicationSettings used to provide date format among possible other things.
	 * 
	 * @param appSettings
	 */
	public void setAppSettings(ApplicationSettings appSettings);

	/**
	 * Can records be added. If true then the "Add" button will be added to view
	 * 
	 * @return
	 */
	public boolean getRecordsCanBeAdded();

	/**
	 * Set to true if add entity functionality is needed.
	 * 
	 * @param recordsCanBeAdded
	 */
	public void setRecordsCanBeAdded(boolean recordsCanBeAdded);

	/**
	 * Can records be deleted. If true then the "Delete" button will be added to view
	 * 
	 * @return
	 */
	public boolean getRecordsCanBeDeleted();

	/**
	 * Set to true if delete entity functionality is needed.
	 * 
	 * @param recordsCanBeDeleted
	 */
	public void setRecordsCanBeDeleted(boolean recordsCanBeDeleted);

	/**
	 * The pretty entity name, that will be used on the view
	 * 
	 * @return
	 */
	public String getEntityName();

	/**
	 * Set the entity name to use on the add form on the view.
	 * 
	 * @param entityName
	 */
	public void setEntityName(String entityName);

	/**
	 * Returns a map of all values used to populate drop down menus on view.
	 * 
	 * @return a map containing the name of the drop down menu field as key and a map containing all the values for a drop down
	 *         menu as the value.
	 */
	public Map<String, Map<String, String>> getDropDownFiller();

	/**
	 * Sets the drop down values map
	 * 
	 * @param dropDownFiller
	 */
	public void setDropDownFiller(Map<String, Map<String, String>> dropDownFiller);

	/**
	 * Methods for handling drop down values, will return one of the maps from the dropDownFiller based on the name.
	 * 
	 * @param key
	 *            the key used in the dropDownFiller map
	 * @return
	 */
	public Map<String, String> getDropDownValuesFor(String key);

	/**
	 * Adds one record to the dropDownFiller map
	 * 
	 * @param key
	 *            of the record to add to the dropDownFiller
	 * @param values
	 *            a map containing "id":"value" to display in a drop down menu on the jsp page
	 */
	public void setDropDownValuesFor(String key, Map<String, String> values);

}
