package com.client.core.datatables.tools.enumeration;

public enum Visible  {

	YES(true), NO(false);

	private final boolean value;

	Visible(boolean value) {
		this.value = value;
	}

	public boolean getBooleanValue() {
		return value;
	}

}
