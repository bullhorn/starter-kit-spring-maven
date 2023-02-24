package com.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.StringTemplateResolver;

/**
 * Configuration for the thymeleaf template engine.
 */
@Configuration
public class ThymeleafConfig {
    @Bean
    public ClassLoaderTemplateResolver classLoaderTemplateResolver() {
        ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
        classLoaderTemplateResolver.setPrefix("templates/");
        classLoaderTemplateResolver.setSuffix(".html");
        classLoaderTemplateResolver.setTemplateMode("HTML");
        classLoaderTemplateResolver.setCharacterEncoding("UTF-8");
        classLoaderTemplateResolver.setOrder(1);

        return classLoaderTemplateResolver;
    }

    @Bean
    public StringTemplateResolver stringTemplateResolver() {
        StringTemplateResolver stringTemplateResolver = new StringTemplateResolver();
        stringTemplateResolver.setTemplateMode("HTML5");
        stringTemplateResolver.setOrder(2);

        return stringTemplateResolver;
    }

    @Bean
    public TemplateEngine templateEngine(ClassLoaderTemplateResolver classLoaderTemplateResolver, StringTemplateResolver stringTemplateResolver) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.addTemplateResolver(classLoaderTemplateResolver);
        templateEngine.addTemplateResolver(stringTemplateResolver);

        return templateEngine;
    }
}
