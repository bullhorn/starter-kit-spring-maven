package com.client.core.datatables.tools.enumeration;

public enum Editable  {

	YES(true), NO(false);

	private final boolean value;

	private Editable(boolean value) {
		this.value = value;
	}

	public boolean getBooleanValue() {
		return value;
	}

}
