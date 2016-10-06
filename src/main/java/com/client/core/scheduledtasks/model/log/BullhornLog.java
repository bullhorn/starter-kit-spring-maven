package com.client.core.scheduledtasks.model.log;

import com.client.core.scheduledtasks.model.helper.StandardEvent;

import java.sql.Date;

public class BullhornLog {

	private int logID;
	private int corporationID;
	private String status;
	private int errorCount;
	private String error;
	private String eventID;
	private String requestID;
	private String subscriptionID;
	private String entity;
	private int entityID;
	private String eventType;
	private String[] updatedProperties;
	private Date eventTimeStamp;

	public static BullhornLog instantiateLog(StandardEvent event, int corporationID) {
		BullhornLog bhlog = new BullhornLog();
		bhlog.setCorporationID(corporationID);
		bhlog.setEntity(event.getEntityName());
		bhlog.setEntityID(event.getEntityId());
		bhlog.setRequestID(event.getRequestId().toString());
		bhlog.setEventID(event.getEventId());
		bhlog.setSubscriptionID(event.getSubscriptionName());
		bhlog.setEventType(event.getEventType());
		bhlog.setStatus("success");
		bhlog.setError("");
		bhlog.setUpdatedProperties(event.getUpdatedProperties().toArray(new String[0]));
		bhlog.setEventTimeStamp(new Date(event.getEventTimestamp().getMillis()));
		return bhlog;

	}

	public int getLogID() {
		return logID;
	}

	public void setLogID(int logID) {
		this.logID = logID;
	}

	public int getCorporationID() {
		return corporationID;
	}

	public void setCorporationID(int corporationID) {
		this.corporationID = corporationID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getSubscriptionID() {
		return subscriptionID;
	}

	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public int getEntityID() {
		return entityID;
	}

	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String[] getUpdatedProperties() {
		return updatedProperties;
	}

	public void setUpdatedProperties(String[] updatedProperties) {
		this.updatedProperties = updatedProperties;
	}

	public Date getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setEventTimeStamp(Date eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}
}
