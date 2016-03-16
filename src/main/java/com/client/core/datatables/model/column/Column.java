package com.client.core.datatables.model.column;

import com.client.core.datatables.tools.enumeration.Entity;
import com.client.core.datatables.tools.enumeration.FieldType;
import com.client.core.datatables.tools.enumeration.ShowOnForm;

/**
 * One instance of Column represents one column position on one specific row in the data table. For each row there will be created
 * a number of DataTablesFields that correspond to the number of column in the table.
 * 
 * fieldName has to be the exact name of the field on the Entity fieldLabel is the label that will be used for the column in the
 * data table value is the actual value (in String, Date, Integer etc). displayValue this is the value that will be displayed in
 * the data table
 * 
 * @author magnus.palm
 * 
 */
public interface Column {

    public String createColumnConfigForDataTables();

    public String createColumnConfigForDataTablesEditable();

    /**
     * Returns the unique name of the field on the jpa entity
     * 
     * @return
     */
    public String getFieldName();

    public void setFieldName(String fieldName);

    /**
     * Returns the field label to use for display purposes
     * 
     * @return
     */
    public String getFieldLabel();

    public void setFieldLabel(String fieldLabel);

    /**
     * Returns the actual value for this column
     * 
     * @return
     */
    public Object getValue();

    public void setValue(Object value);

    /**
     * Returns the display value for this column, the display value could be the same as the value or it could be a different
     * value
     * 
     * @return
     */
    public String getDisplayValue();

    public void setDisplayValue(String displayValue);
    
    /**
     * Returns the string representation of the value in a format that could be displayed on the edit form, such as taking date
     * format into account for Date and XmlGregorianCalendar
     * 
     * @return
     */
    public String getValueForDisplayOnEditForm();

    /**
     * Returns the type of field.
     * 
     * @see FieldType for the different type of fields avaiable
     * @return
     */
    public FieldType getFieldType();

    public void setFieldType(FieldType fieldType);

    /**
     * Specifies if the column can be edited
     * 
     * @return
     */
    public boolean isEditable();

    public void setEditable(boolean editable);

    /**
     * Specifies if the column can be sorted
     * 
     * @return
     */
    public boolean isSortable();

    public void setSortable(boolean sortable);

    /**
     * Specifies if the column is visible
     * 
     * @return
     */
    public boolean isVisible();

    public void setVisible(boolean visable);

    /**
     * Specifies if the column is searchable
     * 
     * @return
     */
    public boolean isSearchable();

    public void setSearchable(boolean searchable);

    /**
     * Specifies if the column/value should be visible on the add new entity form
     * 
     * @return
     */
    public ShowOnForm getShowOnForm();

    public void setShowOnForm(ShowOnForm showOnForm);

    /**
     * Specifies if the column/values is required
     * 
     * @return
     */
    public boolean getRequired();

    public void setRequired(boolean required);

    /**
     * Specifies if the column/value is part of the form backing entity
     * 
     * @return
     */
    public Entity getEntity();

    public void setEntity(Entity entity);

    /**
     * turn this value into a link using the url, also used to populate select values
     * 
     * @return
     */
    public String getUrl();

    public void setUrl(String url);

}