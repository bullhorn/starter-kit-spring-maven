package com.client.core.scheduledtasks.dao;

import java.util.List;

import com.client.core.scheduledtasks.model.log.BullhornError;
import com.client.core.scheduledtasks.model.log.BullhornLog;
import com.client.core.scheduledtasks.model.log.Request;

public interface BullhornLogDAO {

	public Object insertLog(BullhornLog log);
	public void updateLog(BullhornLog log);
	public List<BullhornLog> selectWhere(String queryWhere);
	public Object insertRequest(Request request);
	public List<Request> getMaxRequestID(int corporationID, String subscriptionID);
	public Object insertError(BullhornError error);

}
