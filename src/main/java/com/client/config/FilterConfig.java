package com.client.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.Collections;

@Configuration
public class FilterConfig {
    @Bean
    public DelegatingFilterProxy delegatingFilterProxy() {
        DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
        delegatingFilterProxy.setTargetBeanName("sessionFilter");
        return delegatingFilterProxy;
    }
    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        return new CharacterEncodingFilter("UTF-8", true);
    }

    @Bean
    public FilterRegistrationBean<DelegatingFilterProxy> delegatingFilterProxyRegistration(DelegatingFilterProxy delegatingFilterProxy) {
        FilterRegistrationBean<DelegatingFilterProxy> registration = new FilterRegistrationBean<>(delegatingFilterProxy);
        registration.setUrlPatterns(Collections.singleton("/*"));
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean<CharacterEncodingFilter> characterEncodingFilterRegistration() {
        FilterRegistrationBean<CharacterEncodingFilter> registration = new FilterRegistrationBean<>(characterEncodingFilter());
        registration.setOrder(3);
        registration.setUrlPatterns(Collections.singleton("/*"));
        return registration;
    }
}
