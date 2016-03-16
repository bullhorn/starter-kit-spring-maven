package com.client.core.datatables.tools.enumeration;

public enum Required {

	YES(true), NO(false);

	private final boolean value;

	private Required(boolean value) {
		this.value = value;
	}

	public boolean getBooleanValue() {
		return value;
	}

}