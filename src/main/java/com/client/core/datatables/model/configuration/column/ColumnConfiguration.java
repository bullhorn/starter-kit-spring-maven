package com.client.core.datatables.model.configuration.column;

import java.util.TreeMap;

import com.client.core.datatables.model.column.Column;

/**
 * Represents a row as a map, where each entry in the map is a column in that row.
 * 
 * @author magnus.palm
 * 
 */
public interface ColumnConfiguration {

    /**
     * Add column configuration for specified column position
     * 
     * @param columnPosition
     *            the column position to set, column 0 must be the primary key of entity
     * @param column
     */
    public void setColumn(Integer columnPosition, Column column);

    /**
     * Returns the Column for the passed in position
     * 
     * @param columnPosition
     *            the postion of the column in the datatable
     * @return the Column
     */
    public Column getColumn(Integer columnPosition);

    /**
     * Returns the value for the column on the specified position
     * 
     * @param columnPosition
     *            the position of the column in the datatable
     * @return the value for the column
     */
    public Object getColumnValue(Integer columnPosition);

    /**
     * Gets the field label for passed in field name
     * 
     * @param fieldName
     *            name of field to get the label for
     * @return the field label
     */
    public String getLabelForFieldName(String fieldName);

    /**
     * Get the map of all column configurations for this table
     * 
     * @return a TreeMap<Integer,Column> with column position as key and column as value
     */
    public TreeMap<Integer, Column> getColumnConfigMap();

    /**
     * Assembles the javascript/datatables configurations for all the columns: this value will be used on the jsp page to
     * determine a number of setting for the datatables plugins.
     * 
     * @return a string containing the settings needed for the datatables plugin
     */
    public String assembleColumnConfigForDataTables();

    /**
     * Assembles the javascript/datatables configurations for all the columns: this value will be used on the jsp page to
     * determine a number of setting for the datatables editable plugins.
     * 
     * @return a string containing the settings needed for the datatables editable plugin
     */
    public String assembleColumnConfigForDataTablesEditable();

    /**
     * Returns the position of a column based on the field name.
     * 
     * @param fieldName
     *            The fieldName of the column
     * @param visibleOnly
     *            True if only visible column will be taken into consideration. False if all columns will be taken in
     *            consideration
     * @return The position of the column
     */
    public int getColumnPositionByFieldName(String fieldName, boolean visibleOnly);

    /**
     * Returns the position of a column based on the field label.
     * 
     * @param fieldLabel
     *            The Label of the column
     * @param visibleOnly
     *            True if only visible column will be taken into consideration. False if all columns will be taken in
     *            consideration
     * @return The position of the column
     */
    public int getColumnPositionByFieldLabel(String fieldLabel, boolean visibleOnly);

    /**
     * Returns a json representation of all the values for one record, to be used in populating the form when editing a record
     * using the form instead of inline editing.
     * 
     * The json formatted string will contain an array of json objects, one for each column in the column configuration
     * 
     * Example: {"result":[{"id":"nameOfField","value":"valueForSaidField"},{"id":"nameOfField","value":"valueForSaidField"}]}
     * 
     * 
     * @return json formatted string
     */
    public String getJsonValuesForFormEdit();

	public Column getColumnByFieldName(String fieldName);

}
