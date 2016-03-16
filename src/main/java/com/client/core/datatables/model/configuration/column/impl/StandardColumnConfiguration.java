package com.client.core.datatables.model.configuration.column.impl;

import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.client.core.datatables.model.column.Column;
import com.client.core.datatables.model.configuration.column.ColumnConfiguration;

/**
 * Holds configurations for a data table.
 * 
 * columnConfigMap represents a row as a map, where each entry in the map is a column in that row.
 * 
 * @author magnus.palm
 * 
 */
public class StandardColumnConfiguration implements ColumnConfiguration {

    private TreeMap<Integer, Column> columnConfigMap;

    public StandardColumnConfiguration() {
        super();
        columnConfigMap = new TreeMap<Integer, Column>();
    }

    @Override
    public void setColumn(Integer columnPosition, Column column) {
        columnConfigMap.put(columnPosition, column);
    }

    @Override
    public Column getColumn(Integer columnPosition) {
        return columnConfigMap.get(columnPosition);

    }

    @Override
    public Object getColumnValue(Integer columnPosition) {
        return getColumn(columnPosition).getValue();
    }

    @Override
    public String getLabelForFieldName(String fieldName) {
        for (Column column : columnConfigMap.values()) {
            if (fieldName.equals(column.getFieldName())) {
                return column.getFieldLabel();
            }
        }
        return "";

    }

    @Override
    public TreeMap<Integer, Column> getColumnConfigMap() {
        return columnConfigMap;
    }

    @Override
    public String assembleColumnConfigForDataTables() {

        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        for (Column column : this.columnConfigMap.values()) {
            result.append(column.createColumnConfigForDataTables() + NEW_LINE);
        }

        // Remove possible trailing commas
        return result.toString().trim().replaceAll(",$", "");

    }

    @Override
    public String assembleColumnConfigForDataTablesEditable() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        for (Column column : this.columnConfigMap.values()) {
            result.append(column.createColumnConfigForDataTablesEditable() + NEW_LINE);
        }

        // Remove possible trailing commas
        return result.toString().trim().replaceAll(",$", "");
    }

    @Override
    public int getColumnPositionByFieldName(String fieldName, boolean visibleOnly) throws IllegalArgumentException {
        if (fieldName == null || fieldName.length() == 0) {
            throw new IllegalArgumentException(fieldName);
        }

        int position = -1;
        int visibleColumnIndex = -1;

        for (Entry<Integer, Column> entry : columnConfigMap.entrySet()) {
            Column column = entry.getValue();

            if (visibleOnly) {
                if (column.isVisible()) {
                    visibleColumnIndex++;
                } else {
                    continue;
                }
            }

            if (column.getFieldName().equals(fieldName)) {
                if (visibleOnly) {
                    position = visibleColumnIndex;
                } else {
                    position = entry.getKey();
                }
                break;
            }
        }

        return position;
    }

	public Column getColumnByFieldName(String fieldName) {
		if (fieldName == null || fieldName.length() == 0) {
			throw new IllegalArgumentException(fieldName);
		}
        
		for (Entry<Integer, Column> entry : columnConfigMap.entrySet()) {
	        Column column = entry.getValue();
	
	        if (column.getFieldName().equals(fieldName)) {
	           return column;
	        }
        }
        
        return null;
	}

    @Override
    public int getColumnPositionByFieldLabel(String fieldLabel, boolean visibleOnly) throws IllegalArgumentException {
        if (fieldLabel == null || fieldLabel.length() == 0) {
            throw new IllegalArgumentException(fieldLabel);
        }

        int position = -1;
        int visibleColumnIndex = -1;

        for (Entry<Integer, Column> entry : columnConfigMap.entrySet()) {
            Column column = entry.getValue();

            if (visibleOnly) {
                if (column.isVisible()) {
                    visibleColumnIndex++;
                } else {
                    continue;
                }
            }

            if (column.getFieldLabel().equals(fieldLabel)) {
                if (visibleOnly) {
                    position = visibleColumnIndex;
                } else {
                    position = entry.getKey();
                }
                break;
            }
        }

        return position;
    }

    @Override
    public String getJsonValuesForFormEdit() {
        if (columnConfigMap == null) {
            return "";
        }
        
        JSONArray jsonColumns = new JSONArray();
        try {
	        for (Column column : columnConfigMap.values()) {
	            JSONObject jsonColumn = new JSONObject();
	            jsonColumn.put("id", column.getFieldName());
	            jsonColumn.put("value", column.getValueForDisplayOnEditForm());
	            jsonColumns.put(jsonColumn);
	        }
	        JSONObject json = new JSONObject();
	        json.put("result", jsonColumns);
	        return json.toString();
        } catch (JSONException e) {
        	Logger.getLogger(StandardColumnConfiguration.class).error(e.toString());
        	return "";
        }
    }
}
