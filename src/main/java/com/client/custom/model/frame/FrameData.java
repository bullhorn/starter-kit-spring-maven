package com.client.custom.model.frame;

import java.util.Map;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by john.sullivan on 25/5/2017.
 */
@JsonPropertyOrder(value = { "corporateUserID", "corporateUserName", "corporateUserPrimaryDepartment", "entityType", "nameIdMap" })
public class FrameData {

    private Integer corporateUserID;
    private String corporateUserName;
    private String corporateUserPrimaryDepartment;

    private String entityType;

    private Map<Integer, String> nameIdMap;

    public FrameData() {
    }

    public FrameData(CorporateUser corporateUser, String entityType, Map<Integer, String> nameIdMap) {
        this.corporateUserID = corporateUser.getId();
        this.corporateUserName = corporateUser.getName();
        this.corporateUserPrimaryDepartment = corporateUser.getPrimaryDepartment().getName();
        this.entityType = entityType;
        this.nameIdMap = nameIdMap;
    }

    @JsonProperty("corporateUserID")
    public Integer getCorporateUserID() {
        return corporateUserID;
    }

    @JsonProperty("corporateUserID")
    public void setCorporateUserID(Integer corporateUserID) {
        this.corporateUserID = corporateUserID;
    }

    @JsonProperty("corporateUserName")
    public String getCorporateUserName() {
        return corporateUserName;
    }

    @JsonProperty("corporateUserName")
    public void setCorporateUserName(String corporateUserName) {
        this.corporateUserName = corporateUserName;
    }

    @JsonProperty("corporateUserPrimaryDepartment")
    public String getCorporateUserPrimaryDepartment() {
        return corporateUserPrimaryDepartment;
    }

    @JsonProperty("corporateUserPrimaryDepartment")
    public void setCorporateUserPrimaryDepartment(String corporateUserPrimaryDepartment) {
        this.corporateUserPrimaryDepartment = corporateUserPrimaryDepartment;
    }

    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("nameIdMap")
    public Map<Integer, String> getNameIdMap() {
        return nameIdMap;
    }

    @JsonProperty("nameIdMap")
    public void setNameIdMap(Map<Integer, String> nameIdMap) {
        this.nameIdMap = nameIdMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FrameData)) return false;

        FrameData frameData = (FrameData) o;

        if (corporateUserID != null ? !corporateUserID.equals(frameData.corporateUserID) : frameData.corporateUserID != null)
            return false;
        if (corporateUserName != null ? !corporateUserName.equals(frameData.corporateUserName) : frameData.corporateUserName != null)
            return false;
        if (corporateUserPrimaryDepartment != null ? !corporateUserPrimaryDepartment.equals(frameData.corporateUserPrimaryDepartment) : frameData.corporateUserPrimaryDepartment != null)
            return false;
        if (entityType != null ? !entityType.equals(frameData.entityType) : frameData.entityType != null) return false;
        return nameIdMap != null ? nameIdMap.equals(frameData.nameIdMap) : frameData.nameIdMap == null;
    }

    @Override
    public int hashCode() {
        int result = corporateUserID != null ? corporateUserID.hashCode() : 0;
        result = 31 * result + (corporateUserName != null ? corporateUserName.hashCode() : 0);
        result = 31 * result + (corporateUserPrimaryDepartment != null ? corporateUserPrimaryDepartment.hashCode() : 0);
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + (nameIdMap != null ? nameIdMap.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("FrameData {")
                .append("\n\t\"corporateUserID\": ")
                .append(corporateUserID)
                .append(",\n\t\"corporateUserName\": ")
                .append("'")
                .append(corporateUserName).append('\'')
                .append(",\n\t\"corporateUserPrimaryDepartment\": ")
                .append("'")
                .append(corporateUserPrimaryDepartment).append('\'')
                .append(",\n\t\"entityType\": ")
                .append("'")
                .append(entityType).append('\'')
                .append(",\n\t\"nameIdMap\": ")
                .append(nameIdMap)
                .append('}')
                .toString();
    }
}
