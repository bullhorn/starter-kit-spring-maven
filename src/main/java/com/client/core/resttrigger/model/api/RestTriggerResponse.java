package com.client.core.resttrigger.model.api;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestTriggerResponse {

    private Boolean result;
    private Map<String, Object> entity;
    private String error;

    public RestTriggerResponse(){
        super();
    }

    @JsonProperty("result")
    public Boolean getResult(){
        return result;
    }

    public void setResult(Boolean result){
        this.result = result;
    }

    @JsonProperty("data")
    public Map<String, Object> getEntity(){
        return entity;
    }

    public void setEntity(Map<String, Object> entity){
        this.entity = entity;
    }

    @JsonProperty("error")
    public String getError(){
        return error;
    }

    public void setError(String error){
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestTriggerResponse)) return false;

        RestTriggerResponse that = (RestTriggerResponse) o;

        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (entity != null ? !entity.equals(that.entity) : that.entity != null) return false;
        return !(error != null ? !error.equals(that.error) : that.error != null);

    }

    @Override
    public int hashCode() {
        int result1 = result != null ? result.hashCode() : 0;
        result1 = 31 * result1 + (entity != null ? entity.hashCode() : 0);
        result1 = 31 * result1 + (error != null ? error.hashCode() : 0);
        return result1;
    }

    @Override
    public String toString() {
        return "RestTriggerResponse{" +
                "result=" + result +
                ", entity=" + entity +
                ", error='" + error + '\'' +
                '}';
    }
}
