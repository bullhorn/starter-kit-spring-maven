package com.client;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Contains application wide settings.
 */
@Data
@Configuration
public class ApplicationSettings {

    private final String apiUrl;

    private final String username;

    private final String password;

    private final String apiKey;

    private final int apiUserID;

    private final Integer corporationID;

    private final String privateLabelID;

    private final Integer numEventThreads;

    private final Integer numEventsPerBatch;

    private final String standardSubscriptionName;

    private final String standardCronExpression;

    private final String applicationDateFormat;

    private final String applicationTimeFormat;

    private final String profileName;

    private final Integer metaCacheMinutes;

    private final String restClientId;

    private final String restClientSecret;

    private final String restSessionMinutesToLive;

    private final boolean showSql;

    private final boolean generateDdl;

    public ApplicationSettings(@Value("${apiurl}") String apiUrl,
                               @Value("${apiusername}")String username,
                               @Value("${apipassword}") String password,
                               @Value("${apikey}") String apiKey,
                               @Value("${apiUserID}") int apiUserID,
                               @Value("${corporationID}") Integer corporationID,
                               @Value("${privateLabelID}") String privateLabelID,
                               @Value("${numEventThreads}") Integer numEventThreads,
                               @Value("${numEventsPerBatch}") Integer numEventsPerBatch,
                               @Value("${standardSubscriptionName}") String standardSubscriptionName,
                               @Value("${standardCronExpression}") String standardCronExpression,
                               @Value("${applicationDateFormat}") String applicationDateFormat,
                               @Value("${applicationDateFormat}") String applicationTimeFormat,
                               @Value("${profilename}") String profileName,
                               @Value("${metaCacheMinutes}") Integer metaCacheMinutes,
                               @Value("${rest.clientId}") String restClientId,
                               @Value("${rest.clientSecret}") String restClientSecret,
                               @Value("${rest.sessionMinutesToLive}") String restSessionMinutesToLive,
                               @Value("${hibernate.showSql}") boolean showSql,
                               @Value("${hibernate.generateDdl}") boolean generateDdl) {
        this.apiUrl = apiUrl;
        this.username = username;
        this.password = password;
        this.apiKey = apiKey;
        this.apiUserID = apiUserID;
        this.corporationID = corporationID;
        this.privateLabelID = privateLabelID;
        this.numEventThreads = numEventThreads;
        this.numEventsPerBatch = numEventsPerBatch;
        this.standardSubscriptionName = standardSubscriptionName;
        this.standardCronExpression = standardCronExpression;
        this.applicationDateFormat = applicationDateFormat;
        this.applicationTimeFormat = applicationTimeFormat;
        this.profileName = profileName;
        this.metaCacheMinutes = metaCacheMinutes;
        this.restClientId = restClientId;
        this.restClientSecret = restClientSecret;
        this.restSessionMinutesToLive = restSessionMinutesToLive;
        this.showSql = showSql;
        this.generateDdl = generateDdl;
    }
}
