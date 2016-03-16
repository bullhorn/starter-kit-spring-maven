package com.client.core.datatables.tools.enumeration;

public enum ShowOnForm  {

	YES(true,"showOnForm"), NO(false,"hideOnForm");

	private final boolean value;
	private final String cssClass;
	
	ShowOnForm(boolean value, String cssClass) {
		this.value = value;
		this.cssClass = cssClass;
	}

	public boolean getBooleanValue() {
		return value;
	}

	public String getCssClass() {
		return cssClass;
	}
	
	
	public static ShowOnForm getShowOnFormUsingBoolean(boolean check) {
	    if(check == false){
	        return ShowOnForm.NO;
	    }
	    return ShowOnForm.YES;
    }

}
