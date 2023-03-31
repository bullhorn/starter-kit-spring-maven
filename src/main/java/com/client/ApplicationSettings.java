package com.client;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Contains application wide settings.
 */
@ConfigurationProperties
public record ApplicationSettings(
        String apiUrl,
        String apiusername,
        String apipassword,
        String apiKey,
        int apiUserID,
        Integer corporationID,
        String privateLabelID,
        Integer numEventThreads,
        Integer numEventsPerBatch,
        String standardSubscriptionName,
        String standardCronExpression,
        String applicationDateFormat,
        String applicationTimeFormat,
        String profileName,
        Integer metaCacheMinutes,
        Rest rest,
        Hibernate hibernate
) {
    public record Rest(
            String clientId,
            String clientSecret,
            String sessionMinutesToLive
    ) {}

    public record Hibernate(
        boolean showSql,
        boolean generateDdl
    ) {}
}
