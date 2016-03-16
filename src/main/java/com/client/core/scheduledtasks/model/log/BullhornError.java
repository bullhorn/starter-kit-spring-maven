package com.client.core.scheduledtasks.model.log;

import java.sql.Timestamp;

public class BullhornError {
	
	private String error;
	private int corporationID;
	private int errorID;
	private Timestamp dateAdded;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public int getCorporationID() {
		return corporationID;
	}
	public void setCorporationID(int corporationID) {
		this.corporationID = corporationID;
	}
	public void setErrorID(int errorID) {
		this.errorID = errorID;
	}
	public int getErrorID() {
		return errorID;
	}
	public void setDateAdded(Timestamp dateAdded) {
		this.dateAdded = dateAdded;
	}
	public Timestamp getDateAdded() {
		return dateAdded;
	}
	
}
