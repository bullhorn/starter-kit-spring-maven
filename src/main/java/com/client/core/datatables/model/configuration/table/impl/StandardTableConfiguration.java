package com.client.core.datatables.model.configuration.table.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.client.core.ApplicationSettings;
import com.client.core.datatables.model.configuration.table.TableConfiguration;
import com.client.core.datatables.tools.enumeration.DefaultValues;
import com.client.core.datatables.service.DataTablesService;

/**
 * Contains the configuration for one AbstractDataTablesController
 * 
 * @author magnus.palm
 * 
 * @param <T>
 * @param <ID>
 */
public class StandardTableConfiguration<T, ID> implements TableConfiguration<T, ID> {

    private DataTablesService<T, ID> dataTablesService;
    private String tableName;
    private Logger log;
    private T entity;
    private String viewName;
    private String customUrl;
    private ApplicationSettings appSettings;
    private boolean recordsCanBeAdded;
    private boolean recordsCanBeDeleted;
    private String entityName;
    private Map<String, Map<String, String>> dropDownFiller;

    public StandardTableConfiguration() {
        super();
        this.dropDownFiller = new HashMap<String, Map<String, String>>();
        this.tableName = DefaultValues.DEFAULTDATATABLESNAME.getValue();
    }

    @Override
    public DataTablesService<T, ID> getDataTablesService() {
        return dataTablesService;
    }

    @Override
    public void setDataTablesService(DataTablesService<T, ID> dataTablesService) {
        this.dataTablesService = dataTablesService;
    }
    
	@Override
	public String getTableName() {
		
		return tableName;
	}

	@Override
	public void setTableName(String tableName) {
		this.tableName = tableName;
		
	}

    @Override
    public Logger getLog() {
        return log;
    }

    @Override
    public void setLog(Logger log) {
        this.log = log;
    }

    @Override
    public T getEntity() {
        return entity;
    }

    @Override
    public void setEntity(T entity) {
        this.entity = entity;
    }

    @Override
    public String getViewName() {
        return viewName;
    }

    @Override
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    @Override
    public String getCustomUrl() {
        return customUrl;
    }

    @Override
    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    @Override
    public ApplicationSettings getAppSettings() {
        return appSettings;
    }

    @Override
    public void setAppSettings(ApplicationSettings appSettings) {
        this.appSettings = appSettings;
    }

    @Override
    public boolean getRecordsCanBeAdded() {
        return recordsCanBeAdded;
    }

    @Override
    public void setRecordsCanBeAdded(boolean recordsCanBeAdded) {
        this.recordsCanBeAdded = recordsCanBeAdded;
    }

    @Override
    public boolean getRecordsCanBeDeleted() {
        return recordsCanBeDeleted;
    }

    @Override
    public void setRecordsCanBeDeleted(boolean recordsCanBeDeleted) {
        this.recordsCanBeDeleted = recordsCanBeDeleted;
    }

    @Override
    public String getEntityName() {
        return entityName;
    }

    @Override
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Override
    public Map<String, Map<String, String>> getDropDownFiller() {
        return dropDownFiller;
    }

    @Override
    public void setDropDownFiller(Map<String, Map<String, String>> dropDownFiller) {
        this.dropDownFiller = dropDownFiller;
    }

    @Override
    public Map<String, String> getDropDownValuesFor(String key) {
        return dropDownFiller.get(key);
    }

    @Override
    public void setDropDownValuesFor(String key, Map<String, String> values) {
        dropDownFiller.put(key, values);
    }



}
