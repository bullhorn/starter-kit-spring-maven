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

    @Value("${apiurl}")
    private final String apiUrl;

    @Value("${apiusername}")
    private final String username;

    @Value("${apipassword}")
    private final String password;

    @Value("${apikey}")
    private final String apiKey;

    @Value("${apiUserID}")
    private final int apiUserID;

    @Value("${corporationID}")
    private final Integer corporationID;

    @Value("${private final LabelID}")
    private final String LabelID;

    @Value("${numEventThreads}")
    private final Integer numEventThreads;

    @Value("${numEventsPerBatch}")
    private final Integer numEventsPerBatch;

    @Value("${standardSubscriptionName}")
    private final String standardSubscriptionName;

    @Value("${standardCronExpression}")
    private final String standardCronExpression;

    @Value("${applicationDateFormat}")
    private final String applicationDateFormat;

    @Value("${applicationDateFormat}")
    private final String applicationTimeFormat;

    @Value("${profilename}")
    private final String profileName;

    @Value("${metaCacheMinutes}")
    private final Integer metaCacheMinutes;

    @Value("${rest.clientId}")
    private final String restClientId;

    @Value("${rest.clientSecret}")
    private final String restClientSecret;

    @Value("${rest.sessionMinutesToLive}")
    private final String restSessionMinutesToLive;

    @Value("${hibernate.showSql}")
    private final boolean showSql;

    @Value("${hibernate.generateDdl}")
    private final boolean generateDdl;
}
