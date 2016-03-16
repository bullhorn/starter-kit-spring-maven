package com.client.core.scheduledtasks.model.log;

public class Request {
	
	private int requestID;
	private int corporationID;
	private String subscriptionID;
	
	public int getRequestID() {
		return requestID;
	}
    
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public int getCorporationID() {
		return corporationID;
	}

	public void setCorporationID(int corporationID) {
		this.corporationID = corporationID;
	}

	public String getSubscriptionID() {
		return subscriptionID;
	}

	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

}
