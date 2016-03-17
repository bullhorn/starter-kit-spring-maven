package com.client.core.formtrigger.model.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by john.sullivan on 10/2/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestTriggerMeta {
    private Integer userId;

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestTriggerMeta)) return false;

        RestTriggerMeta that = (RestTriggerMeta) o;

        return userId != null ? userId.equals(that.userId) : that.userId == null;

    }

    @Override
    public int hashCode() {
        return userId != null ? userId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return new StringBuilder("RestTriggerMeta {")
                .append("\n\t\"userId\": ")
                .append(userId)
                .append('}')
                .toString();
    }
}
