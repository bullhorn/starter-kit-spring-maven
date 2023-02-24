package com.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.util.List;
import java.util.Set;

/**
 * Configuration for the thymeleaf template engine.
 */
@Configuration
public class ThymeleafConfig {
    @Bean
    public ITemplateResolver classLoaderTemplateResolver() {
        ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
        classLoaderTemplateResolver.setPrefix("templates/");
        classLoaderTemplateResolver.setSuffix(".html");
        classLoaderTemplateResolver.setTemplateMode("HTML");
        classLoaderTemplateResolver.setCharacterEncoding("UTF-8");
        classLoaderTemplateResolver.setOrder(1);

        return classLoaderTemplateResolver;
    }

    @Bean
    public ITemplateResolver stringTemplateResolver() {
        StringTemplateResolver stringTemplateResolver = new StringTemplateResolver();
        stringTemplateResolver.setTemplateMode("HTML5");
        stringTemplateResolver.setOrder(2);

        return stringTemplateResolver;
    }

    @Bean
    public TemplateEngine templateEngine(Set<ITemplateResolver> templateResolvers) {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolvers(templateResolvers);
        return templateEngine;
    }
}
