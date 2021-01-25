package com.client.core.resttrigger.model.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestTriggerMeta {
    private Integer userId;
    private Integer entityId;

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("entityId")
    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestTriggerMeta)) return false;

        RestTriggerMeta that = (RestTriggerMeta) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        return !(entityId != null ? !entityId.equals(that.entityId) : that.entityId != null);

    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (entityId != null ? entityId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RestTriggerMeta{" +
                "userId=" + userId +
                ", entityId=" + entityId +
                '}';
    }
}
