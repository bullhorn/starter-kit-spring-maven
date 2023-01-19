package com.client;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Contains application wide settings. These are specified in the pom.xml
 */
@Data
@Configuration
public class ApplicationSettings {

    @Value("${apiurl}")
    private String apiUrl;

    @Value("${apiusername}")
    private String username;

    @Value("${apipassword}")
    private String password;

    @Value("${apikey}")
    private String apiKey;

    @Value("${apiUserID}")
    private int apiUserID;

    @Value("${corporationID}")
    private Integer corporationID;

    @Value("${privateLabelID}")
    private String privateLabelID;

    @Value("${numEventThreads}")
    private Integer numEventThreads;

    @Value("${numEventsPerBatch}")
    private Integer numEventsPerBatch;

    @Value("${standardSubscriptionName}")
    private String standardSubscriptionName;

    @Value("${standardCronExpression}")
    private String standardCronExpression;

    @Value("${applicationDateFormat}")
    private String applicationDateFormat;

    @Value("${applicationDateFormat}")
    private String applicationTimeFormat;

    @Value("${profilename}")
    private String profileName;

    @Value("${metaCacheMinutes}")
    private Integer metaCacheMinutes;

    // TODO: BELOW IS NEW. SHOULD REVIEW
    @Value("${rest.clientId}")
    private String restClientId;

    @Value("${rest.clientSecret}")
    private String restClientSecret;

    @Value("${rest.sessionMinutesToLive}")
    private String restSessionMinutesToLive;

    @Value("${hibernate.showSql}")
    private boolean showSql;

    @Value("${hibernate.generateDdl}")
    private boolean generateDdl;
}
