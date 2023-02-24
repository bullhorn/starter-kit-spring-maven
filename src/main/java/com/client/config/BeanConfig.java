package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.api.StandardBullhornData;
import com.client.ApplicationSettings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for creating Standard Bullhorn Beans.
 */
@Configuration
public class BeanConfig {
    @Bean
    public BullhornRestCredentials bullhornRestCredentials(ApplicationSettings appSettings) {
        BullhornRestCredentials bullhornRestCredentials = new BullhornRestCredentials();
        bullhornRestCredentials.setUsername(appSettings.getUsername());
        bullhornRestCredentials.setPassword(appSettings.getPassword());
        bullhornRestCredentials.setRestClientId(appSettings.getRestClientId());
        bullhornRestCredentials.setRestClientSecret(appSettings.getRestClientSecret());
        bullhornRestCredentials.setRestSessionMinutesToLive(appSettings.getRestSessionMinutesToLive());
        return bullhornRestCredentials;
    }

    @Bean
    public BullhornData bullhornData(BullhornRestCredentials bullhornRestCredentials) {
        return new StandardBullhornData(bullhornRestCredentials);
    }
}
