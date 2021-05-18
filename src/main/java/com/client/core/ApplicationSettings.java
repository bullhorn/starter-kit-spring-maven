package com.client.core;

import java.util.Objects;

/**
 * Contains application wide settings. These are specified in the pom.xml
 */
public class ApplicationSettings {

    private String apiUrl;

    private String username;

    private String password;

    private String apiKey;

    private int apiUserID;

    private Integer corporationID;

    private String privateLabelID;

    private Integer numEventThreads;

    private Integer numEventListThreads;

    private Integer numEventsPerBatch;

    private String standardSubscriptionName;

    private String standardCronExpression;

    private String applicationDateFormat;

    private String applicationTimeFormat;

    private String profileName;

    private Integer metaCacheMinutes;

    public ApplicationSettings() {
        super();
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getApiUserID() {
        return apiUserID;
    }

    public void setApiUserID(int apiUserID) {
        this.apiUserID = apiUserID;
    }

    public Integer getCorporationID() {
        return corporationID;
    }

    public void setCorporationID(Integer corporationID) {
        this.corporationID = corporationID;
    }

    public String getPrivateLabelID() {
        return privateLabelID;
    }

    public void setPrivateLabelID(String privateLabelID) {
        this.privateLabelID = privateLabelID;
    }

    public Integer getNumEventThreads() {
        return numEventThreads;
    }

    public void setNumEventThreads(Integer numEventThreads) {
        this.numEventThreads = numEventThreads;
    }

    public Integer getNumEventListThreads() {
        return numEventListThreads;
    }

    public void setNumEventListThreads(Integer numEventListThreads) {
        this.numEventListThreads = numEventListThreads;
    }

    public Integer getNumEventsPerBatch() {
        return numEventsPerBatch;
    }

    public void setNumEventsPerBatch(Integer numEventsPerBatch) {
        this.numEventsPerBatch = numEventsPerBatch;
    }

    public String getStandardSubscriptionName() {
        return standardSubscriptionName;
    }

    public void setStandardSubscriptionName(String standardSubscriptionName) {
        this.standardSubscriptionName = standardSubscriptionName;
    }

    public String getStandardCronExpression() {
        return standardCronExpression;
    }

    public void setStandardCronExpression(String standardCronExpression) {
        this.standardCronExpression = standardCronExpression;
    }

    public String getApplicationDateFormat() {
        return applicationDateFormat;
    }

    public void setApplicationDateFormat(String applicationDateFormat) {
        this.applicationDateFormat = applicationDateFormat;
    }

    public String getApplicationTimeFormat() {
        return applicationTimeFormat;
    }

    public void setApplicationTimeFormat(String applicationTimeFormat) {
        this.applicationTimeFormat = applicationTimeFormat;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Integer getMetaCacheMinutes() {
        return metaCacheMinutes;
    }

    public void setMetaCacheMinutes(Integer metaCacheMinutes) {
        this.metaCacheMinutes = metaCacheMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationSettings that = (ApplicationSettings) o;
        return apiUserID == that.apiUserID &&
                Objects.equals(apiUrl, that.apiUrl) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(apiKey, that.apiKey) &&
                Objects.equals(corporationID, that.corporationID) &&
                Objects.equals(privateLabelID, that.privateLabelID) &&
                Objects.equals(numEventThreads, that.numEventThreads) &&
                Objects.equals(numEventListThreads, that.numEventListThreads) &&
                Objects.equals(numEventsPerBatch, that.numEventsPerBatch) &&
                Objects.equals(standardSubscriptionName, that.standardSubscriptionName) &&
                Objects.equals(standardCronExpression, that.standardCronExpression) &&
                Objects.equals(applicationDateFormat, that.applicationDateFormat) &&
                Objects.equals(applicationTimeFormat, that.applicationTimeFormat) &&
                Objects.equals(profileName, that.profileName) &&
                Objects.equals(metaCacheMinutes, that.metaCacheMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiUrl, username, password, apiKey, apiUserID, corporationID, privateLabelID, numEventThreads, numEventListThreads, numEventsPerBatch, standardSubscriptionName, standardCronExpression, applicationDateFormat, applicationTimeFormat, profileName, metaCacheMinutes);
    }

    @Override
    public String toString() {
        return "ApplicationSettings{" +
                "apiUrl='" + apiUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", apiUserID=" + apiUserID +
                ", corporationID=" + corporationID +
                ", privateLabelID='" + privateLabelID + '\'' +
                ", numEventThreads=" + numEventThreads +
                ", numEventListThreads=" + numEventListThreads +
                ", numEventsPerBatch=" + numEventsPerBatch +
                ", standardSubscriptionName='" + standardSubscriptionName + '\'' +
                ", standardCronExpression='" + standardCronExpression + '\'' +
                ", applicationDateFormat='" + applicationDateFormat + '\'' +
                ", applicationTimeFormat='" + applicationTimeFormat + '\'' +
                ", profileName='" + profileName + '\'' +
                ", metaCacheMinutes=" + metaCacheMinutes +
                '}';
    }
}
