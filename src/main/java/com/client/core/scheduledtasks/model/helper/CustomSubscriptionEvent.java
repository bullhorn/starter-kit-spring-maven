package com.client.core.scheduledtasks.model.helper;

import com.bullhornsdk.data.model.response.event.Event;
import com.google.common.collect.Sets;
import org.joda.time.DateTime;

import java.util.Map;
import java.util.Set;

/**
 * Created by hiqbal on 10/5/2016.
 */
public class CustomSubscriptionEvent{

    private String eventId;
    private String eventType;
    private Integer entityId;
    private String entityName;
    private String entityEventType;
    private DateTime eventTimestamp;
    private Set<String> updatedProperties;
    private Map<String, String> eventMetadata;
    private String subscriptionName;
    private Integer requestId;
    private boolean isError;
    private Integer updatingUserId;

    public static CustomSubscriptionEvent instantiateFromEvent(Event event, String subscriptionName, Integer requestId, boolean isError){

        CustomSubscriptionEvent customSubscriptionEvent = new CustomSubscriptionEvent();

        customSubscriptionEvent.setEventId(event.getEventId());
        customSubscriptionEvent.setEventType(event.getEventType());
        customSubscriptionEvent.setEntityId(event.getEntityId());
        customSubscriptionEvent.setEntityName(event.getEntityName());
        customSubscriptionEvent.setEntityEventType(event.getEntityEventType());
        customSubscriptionEvent.setEventTimestamp(event.getEventTimestamp());
        customSubscriptionEvent.setEventMetadata(event.getEventMetadata());
        customSubscriptionEvent.setSubscriptionName(subscriptionName);
        customSubscriptionEvent.setRequestId(requestId);
        customSubscriptionEvent.setError(isError);

        if(event.getUpdatedProperties() != null) {
            customSubscriptionEvent.setUpdatedProperties(Sets.newHashSet(event.getUpdatedProperties()));
        }

        if(event.getEventMetadata().containsKey("PERSON_ID")){
            customSubscriptionEvent.setUpdatingUserId(Integer.parseInt(event.getEventMetadata().get("PERSON_ID")));
        }

        return customSubscriptionEvent;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityEventType() {
        return entityEventType;
    }

    public void setEntityEventType(String entityEventType) {
        this.entityEventType = entityEventType;
    }

    public DateTime getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(DateTime eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public Set<String> getUpdatedProperties() {
        return updatedProperties;
    }

    public void setUpdatedProperties(Set<String> updatedProperties) {
        this.updatedProperties = updatedProperties;
    }

    public Map<String, String> getEventMetadata() {
        return eventMetadata;
    }

    public void setEventMetadata(Map<String, String> eventMetadata) {
        this.eventMetadata = eventMetadata;
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
