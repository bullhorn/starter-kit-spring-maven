package com.client.core.email;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Object used to represent settings used for emailing.  Values should be provided via a properties file and injected
 * using a Spring {@link org.springframework.beans.factory.config.PropertyPlaceholderConfigurer}, either in
 * applicationContext.xml or using {@link org.springframework.beans.factory.annotation.Value} annotations
 */
@ConfigurationProperties(prefix = "mail")
public record MailSettings(
        String host,
        String port,
        String username,
        String password,
        String sender,
        String senderName,
        Boolean disabled,
        List<String> routeToWhenDisabled) {}
