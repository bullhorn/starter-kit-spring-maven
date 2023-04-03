package com.client.core.scheduledtasks.config;

import com.google.common.collect.Maps;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "scheduledtasks")
public record CustomSubscriptionSettings(Map<String, String> customSubscriptions,
                                         Map<String, String> dateLastModifiedSubscriptions) {
    public CustomSubscriptionSettings {
        if (customSubscriptions == null) {
            customSubscriptions = Maps.newHashMap();
        }
        if (dateLastModifiedSubscriptions == null) {
            dateLastModifiedSubscriptions = Maps.newHashMap();
        }
    }
}
