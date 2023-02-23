package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.api.StandardBullhornData;
import com.client.ApplicationSettings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

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

    @Bean
    public ClassLoaderTemplateResolver templateResolver() {
        // TODO: Search for new template resolver to have template as a string
        ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
        classLoaderTemplateResolver.setPrefix("templates/");
        classLoaderTemplateResolver.setSuffix(".html");
        classLoaderTemplateResolver.setTemplateMode("HTML");
        classLoaderTemplateResolver.setCharacterEncoding("UTF-8");
        classLoaderTemplateResolver.setOrder(1);

        return classLoaderTemplateResolver;
    }

    @Bean
    public TemplateEngine templateEngine(ClassLoaderTemplateResolver classLoaderTemplateResolver) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(classLoaderTemplateResolver);

        return templateEngine;
    }
}
