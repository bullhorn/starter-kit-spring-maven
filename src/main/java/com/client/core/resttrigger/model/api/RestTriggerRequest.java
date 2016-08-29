package com.client.core.resttrigger.model.api;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hiqbal on 12/18/2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestTriggerRequest<T extends BullhornEntity> {

    private T data;
    private RestTriggerMeta meta;

    @JsonProperty("data")
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @JsonProperty("meta")
    public RestTriggerMeta getMeta() {
        return meta;
    }

    public void setMeta(RestTriggerMeta meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestTriggerRequest)) return false;

        RestTriggerRequest<?> that = (RestTriggerRequest<?>) o;

        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        return meta != null ? meta.equals(that.meta) : that.meta == null;

    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (meta != null ? meta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("RestTriggerRequest {")
                .append("\n\t\"data\": ")
                .append(data)
                .append(",\n\t\"meta\": ")
                .append(meta)
                .append('}')
                .toString();
    }
}
