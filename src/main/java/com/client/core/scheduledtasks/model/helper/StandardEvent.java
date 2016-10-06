package com.client.core.scheduledtasks.model.helper;

import com.bullhornsdk.data.model.response.event.Event;

/**
 * Created by hiqbal on 10/5/2016.
 */
public class StandardEvent extends com.bullhornsdk.data.model.response.event.standard.StandardEvent implements Event {

    private String subscriptionName;
    private Integer requestId;
    private boolean isError;
    private Integer updatingUserId;

    public static StandardEvent instantiateFromEvent(Event event, String subscriptionName, Integer requestId, boolean isError){

        StandardEvent standardEvent = new StandardEvent();

        standardEvent.setEventId(event.getEventId());
        standardEvent.setEventType(event.getEventType());
        standardEvent.setEntityId(event.getEntityId());
        standardEvent.setEntityName(event.getEntityName());
        standardEvent.setEntityEventType(event.getEntityEventType());
        standardEvent.setEventTimestamp(event.getEventTimestamp());
        standardEvent.setUpdatedProperties(event.getUpdatedProperties());
        standardEvent.setEventMetadata(event.getEventMetadata());

        standardEvent.setSubscriptionName(subscriptionName);
        standardEvent.setRequestId(requestId);
        standardEvent.setError(isError);

        if(event.getEventMetadata().containsKey("PERSON_ID")){
            standardEvent.setUpdatingUserId(Integer.parseInt(event.getEventMetadata().get("PERSON_ID")));
        }

        return standardEvent;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public Integer getUpdatingUserId() {
        return updatingUserId;
    }

    public void setUpdatingUserId(Integer updatingUserId) {
        this.updatingUserId = updatingUserId;
    }
}
