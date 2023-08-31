package com.client.config;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.BullhornRestCredentials;
import com.bullhornsdk.data.api.StandardBullhornData;
import com.client.ApplicationSettings;

import com.client.core.base.tools.context.CustomReloadableResourceBundleMessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.util.Locale;

/**
 * Configuration for creating Standard Bullhorn Beans.
 */
@Configuration
public class GeneralConfig {
    @Bean
    public BullhornRestCredentials bullhornRestCredentials(ApplicationSettings appSettings) {
        BullhornRestCredentials bullhornRestCredentials = new BullhornRestCredentials();
        bullhornRestCredentials.setUsername(appSettings.apiusername());
        bullhornRestCredentials.setPassword(appSettings.apipassword());
        bullhornRestCredentials.setRestClientId(appSettings.rest().clientId());
        bullhornRestCredentials.setRestClientSecret(appSettings.rest().clientSecret());
        bullhornRestCredentials.setRestSessionMinutesToLive(appSettings.rest().sessionMinutesToLive());
        return bullhornRestCredentials;
    }

    @Bean
    public BullhornData bullhornData(BullhornRestCredentials bullhornRestCredentials) {
        return new StandardBullhornData(bullhornRestCredentials);
    }

    @Bean
    public HandlerInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setDefaultLocale(Locale.US);
        return cookieLocaleResolver;
    }

    @Bean
    public CommonsMultipartResolver commonsMultipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(1048576L);
        commonsMultipartResolver.setMaxInMemorySize(2097152);
        return commonsMultipartResolver;
    }

    @Bean
    public CustomReloadableResourceBundleMessageSource messageSource() {
        CustomReloadableResourceBundleMessageSource messageSource = new CustomReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath*:messages*");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setCacheSeconds(-1);
        return messageSource;
    }
}
