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
	private int apiUserID; // TODO: Change to String? Errors if empty int

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

    // BELOW IS NEW
    @Value("${rest.clientId}")
    private String restClientId;

    @Value("${rest.clientSecret}")
    private String restClientSecret;

    @Value("${rest.sessionMinutesToLive}")
    private String restSessionMinutesToLive;

    // Database
    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.user}")
    private String jdbcUser;

    @Value("${jdbc.password}")
    private String jdbcPassword;
}