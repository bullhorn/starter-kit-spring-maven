package com.client.core.datatables.tools.enumeration;

public enum Searchable  {

	YES(true), NO(false);

	private final boolean value;

	Searchable(boolean value) {
		this.value = value;
	}

	public boolean getBooleanValue() {
		return value;
	}

}
