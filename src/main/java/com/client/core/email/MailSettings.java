package com.client.core.email;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Object used to represent settings used for emailing.  Values should be provided via a properties file and injected
 * using a Spring {@link org.springframework.beans.factory.config.PropertyPlaceholderConfigurer}, either in
 * applicationContext.xml or using {@link org.springframework.beans.factory.annotation.Value} annotations
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "mail")
public class MailSettings {
    private String host;
    private String port;
    private String username;
    private String password;
    private String sender;
    private String senderName;
    private Boolean disabled;
    private List<String> routeToWhenDisabled;

    @Override
    public String toString() {
        return new StringBuilder("MailSettings {")
                .append("\n\t\"host\": ")
                .append("'")
                .append(host).append('\'')
                .append(",\n\t\"port\": ")
                .append("'")
                .append(port).append('\'')
                .append(",\n\t\"apiusername\": ")
                .append("'")
                .append(username).append('\'')
                .append(",\n\t\"apipassword\": ")
                .append("'")
                .append(password).append('\'')
                .append(",\n\t\"sender\": ")
                .append("'")
                .append(sender).append('\'')
                .append(",\n\t\"senderName\": ")
                .append("'")
                .append(senderName).append('\'')
                .append(",\n\t\"disabled\": ")
                .append(disabled)
                .append(",\n\t\"routeToWhenDisabled\": ")
                .append("'")
                .append(routeToWhenDisabled).append('\'')
                .append('}')
                .toString();
    }
}
