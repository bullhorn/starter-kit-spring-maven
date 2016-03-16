package com.client.core.datatables.tools.enumeration;

/**
 * Defines if the column is a field of the backing jpa entity
 * 
 * @author magnus.palm
 * 
 */
public enum Entity {

	YES(true, "Entity"), NO(false, "Non-Entity");

	private final boolean value;
	private final String cssClass;

	Entity(boolean value, String cssClass) {
		this.value = value;
		this.cssClass = cssClass;
	}

	public boolean getBooleanValue() {
		return value;
	}

	public String getCssClass() {
		return cssClass;
	}

}
