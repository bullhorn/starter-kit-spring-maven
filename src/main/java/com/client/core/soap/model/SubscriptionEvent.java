package com.client.core.soap.model;

import java.sql.Date;
import java.util.Arrays;

public class SubscriptionEvent {

	private String eventType;
	private String eventID;
	private String requestID;
	private String entityType;
	private int entityID;
	private String[] updatedProperties;
	private Date eventTimeStamp;
	private String subscriptionName;
	private boolean isError;
	private int updatingUserID;
	private String transactionID;
	
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
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

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public int getEntityID() {
		return entityID;
	}

	public void setEntityID(int entityID) {
		this.entityID = entityID;
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

	public void setEventTimeStamp(Long eventTimeStamp) {
		this.eventTimeStamp = new Date(eventTimeStamp);
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	public int getUpdatingUserID() {
		return updatingUserID;
	}

	public void setUpdatingUserID(int updatingUserID) {
		this.updatingUserID = updatingUserID;
	}
	
	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n eventType: ");
		builder.append(eventType);
		builder.append("\n eventID: ");
		builder.append(eventID);
		builder.append("\n requestID: ");
		builder.append(requestID);
		builder.append("\n entityType: ");
		builder.append(entityType);
		builder.append("\n entityID: ");
		builder.append(entityID);
		builder.append("\n updatedProperties: ");
		builder.append(Arrays.toString(updatedProperties));
		builder.append("\n eventTimeStamp: ");
		builder.append(eventTimeStamp);
		builder.append("\n subscriptionName: ");
		builder.append(subscriptionName);
		builder.append("\n isError: ");
		builder.append(isError);
		builder.append("\n updatingUserID: ");
		builder.append(updatingUserID);
		builder.append("\n transactionID: ");
		builder.append(transactionID);
		builder.append("\n}");
		return builder.toString();
	}

}
