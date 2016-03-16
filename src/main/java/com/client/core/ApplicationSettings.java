package com.client.core;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Contains application wide settings. These are specified in the pom.xml
 */
public class ApplicationSettings {

	private String apiUrl;

	private String username;

	private String password;

	private String apiKey;

	private int apiUserID;

    private String corporationID;

	private String privateLabelID;

    private String numEventThreads;

	private String standardSubscriptionName;

	private String standardCronExpression;

    private String applicationDateFormat;

    private String profileName;

	public ApplicationSettings() {
		super();
	}

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public int getApiUserID() {
        return apiUserID;
    }

    public void setApiUserID(int apiUserID) {
        this.apiUserID = apiUserID;
    }

    public String getApplicationDateFormat() {
        return applicationDateFormat;
    }

    public void setApplicationDateFormat(String applicationDateFormat) {
        this.applicationDateFormat = applicationDateFormat;
    }

    public String getCorporationID() {
        return corporationID;
    }

    public void setCorporationID(String corporationID) {
        this.corporationID = corporationID;
    }

    public String getNumEventThreads() {
        return numEventThreads;
    }

    public void setNumEventThreads(String numEventThreads) {
        this.numEventThreads = numEventThreads;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivateLabelID() {
        return privateLabelID;
    }

    public void setPrivateLabelID(String privateLabelID) {
        this.privateLabelID = privateLabelID;
    }

    public String getStandardCronExpression() {
        return standardCronExpression;
    }

    public void setStandardCronExpression(String standardCronExpression) {
        this.standardCronExpression = standardCronExpression;
    }

    public String getStandardSubscriptionName() {
        return standardSubscriptionName;
    }

    public void setStandardSubscriptionName(String standardSubscriptionName) {
        this.standardSubscriptionName = standardSubscriptionName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApplicationSettings)) return false;

        ApplicationSettings that = (ApplicationSettings) o;

        if (apiUserID != that.apiUserID) return false;
        if (apiUrl != null ? !apiUrl.equals(that.apiUrl) : that.apiUrl != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (apiKey != null ? !apiKey.equals(that.apiKey) : that.apiKey != null) return false;
        if (corporationID != null ? !corporationID.equals(that.corporationID) : that.corporationID != null)
            return false;
        if (privateLabelID != null ? !privateLabelID.equals(that.privateLabelID) : that.privateLabelID != null)
            return false;
        if (numEventThreads != null ? !numEventThreads.equals(that.numEventThreads) : that.numEventThreads != null)
            return false;
        if (standardSubscriptionName != null ? !standardSubscriptionName.equals(that.standardSubscriptionName) : that.standardSubscriptionName != null)
            return false;
        if (standardCronExpression != null ? !standardCronExpression.equals(that.standardCronExpression) : that.standardCronExpression != null)
            return false;
        if (applicationDateFormat != null ? !applicationDateFormat.equals(that.applicationDateFormat) : that.applicationDateFormat != null)
            return false;
        return !(profileName != null ? !profileName.equals(that.profileName) : that.profileName != null);

    }

    @Override
    public int hashCode() {
        int result = apiUrl != null ? apiUrl.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (apiKey != null ? apiKey.hashCode() : 0);
        result = 31 * result + apiUserID;
        result = 31 * result + (corporationID != null ? corporationID.hashCode() : 0);
        result = 31 * result + (privateLabelID != null ? privateLabelID.hashCode() : 0);
        result = 31 * result + (numEventThreads != null ? numEventThreads.hashCode() : 0);
        result = 31 * result + (standardSubscriptionName != null ? standardSubscriptionName.hashCode() : 0);
        result = 31 * result + (standardCronExpression != null ? standardCronExpression.hashCode() : 0);
        result = 31 * result + (applicationDateFormat != null ? applicationDateFormat.hashCode() : 0);
        result = 31 * result + (profileName != null ? profileName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("apiKey", apiKey)
                .append("apiUrl", apiUrl)
                .append("username", username)
                .append("password", password)
                .append("apiUserID", apiUserID)
                .append("corporationID", corporationID)
                .append("privateLabelID", privateLabelID)
                .append("numEventThreads", numEventThreads)
                .append("standardSubscriptionName", standardSubscriptionName)
                .append("standardCronExpression", standardCronExpression)
                .append("applicationDateFormat", applicationDateFormat)
                .append("profileName", profileName)
                .toString();
    }
}