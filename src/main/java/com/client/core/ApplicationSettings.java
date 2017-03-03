package com.client.core;

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

    private Integer numEventsPerBatch;

	private String standardSubscriptionName;

	private String standardCronExpression;

    private String applicationDateFormat;

    private String applicationTimeFormat;

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

    public String getApplicationTimeFormat() {
        return applicationTimeFormat;
    }

    public void setApplicationTimeFormat(String applicationTimeFormat) {
        this.applicationTimeFormat = applicationTimeFormat;
    }

    public Integer getCorporationID() {
        return corporationID;
    }

    public void setCorporationID(Integer corporationID) {
        this.corporationID = corporationID;
    }

    public Integer getNumEventThreads() {
        return numEventThreads;
    }

    public void setNumEventThreads(Integer numEventThreads) {
        this.numEventThreads = numEventThreads;
    }

    public Integer getNumEventsPerBatch() {
        return numEventsPerBatch;
    }

    public void setNumEventsPerBatch(Integer numEventsPerBatch) {
        this.numEventsPerBatch = numEventsPerBatch;
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
        if (numEventsPerBatch != null ? !numEventsPerBatch.equals(that.numEventsPerBatch) : that.numEventsPerBatch != null)
            return false;
        if (standardSubscriptionName != null ? !standardSubscriptionName.equals(that.standardSubscriptionName) : that.standardSubscriptionName != null)
            return false;
        if (standardCronExpression != null ? !standardCronExpression.equals(that.standardCronExpression) : that.standardCronExpression != null)
            return false;
        if (applicationDateFormat != null ? !applicationDateFormat.equals(that.applicationDateFormat) : that.applicationDateFormat != null)
            return false;
        if (applicationTimeFormat != null ? !applicationTimeFormat.equals(that.applicationTimeFormat) : that.applicationTimeFormat != null)
            return false;
        return profileName != null ? profileName.equals(that.profileName) : that.profileName == null;
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
        result = 31 * result + (numEventsPerBatch != null ? numEventsPerBatch.hashCode() : 0);
        result = 31 * result + (standardSubscriptionName != null ? standardSubscriptionName.hashCode() : 0);
        result = 31 * result + (standardCronExpression != null ? standardCronExpression.hashCode() : 0);
        result = 31 * result + (applicationDateFormat != null ? applicationDateFormat.hashCode() : 0);
        result = 31 * result + (applicationTimeFormat != null ? applicationTimeFormat.hashCode() : 0);
        result = 31 * result + (profileName != null ? profileName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("ApplicationSettings {")
                .append("\n\t\"apiUrl\": ")
                .append("'")
                .append(apiUrl).append('\'')
                .append(",\n\t\"username\": ")
                .append("'")
                .append(username).append('\'')
                .append(",\n\t\"password\": ")
                .append("'")
                .append(password).append('\'')
                .append(",\n\t\"apiKey\": ")
                .append("'")
                .append(apiKey).append('\'')
                .append(",\n\t\"apiUserID\": ")
                .append(apiUserID)
                .append(",\n\t\"corporationID\": ")
                .append(corporationID)
                .append(",\n\t\"privateLabelID\": ")
                .append("'")
                .append(privateLabelID).append('\'')
                .append(",\n\t\"numEventThreads\": ")
                .append(numEventThreads)
                .append(",\n\t\"numEventsPerBatch\": ")
                .append(numEventsPerBatch)
                .append(",\n\t\"standardSubscriptionName\": ")
                .append("'")
                .append(standardSubscriptionName).append('\'')
                .append(",\n\t\"standardCronExpression\": ")
                .append("'")
                .append(standardCronExpression).append('\'')
                .append(",\n\t\"applicationDateFormat\": ")
                .append("'")
                .append(applicationDateFormat).append('\'')
                .append(",\n\t\"applicationTimeFormat\": ")
                .append("'")
                .append(applicationTimeFormat).append('\'')
                .append(",\n\t\"profileName\": ")
                .append("'")
                .append(profileName).append('\'')
                .append('}')
                .toString();
    }
}