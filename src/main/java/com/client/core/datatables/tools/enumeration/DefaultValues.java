package com.client.core.datatables.tools.enumeration;

public enum DefaultValues {

	DEFAULTDATATABLESNAME("customDataTable");

	private final String value;

	private DefaultValues(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
