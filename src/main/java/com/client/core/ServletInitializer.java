package com.client.core;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletInitializer implements WebApplicationInitializer {

    private static final String[] CONTEXT_CONFIG_LOCATIONS = new String[] { "classpath:applicationContext.xml",
            "classpath*:*-workflow.xml", "classpath*:*-config.xml", "classpath*:*-applicationContext.xml",
            "classpath*:*-scheduledtasks.xml", "classpath*:*-test.xml" };

    private final List<String> servlets;

    public ServletInitializer() throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(this.getClass().getClassLoader());

        this.servlets = Stream.of(resolver.getResources("classpath:*-servlet.xml")).map(Resource::getFilename)
                .map(REPLACE_FILENAME).collect(Collectors.toList());
    }

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        XmlWebApplicationContext context = new XmlWebApplicationContext();

        context.setConfigLocations(CONTEXT_CONFIG_LOCATIONS);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        dispatcherServlet.setPublishContext(true);

        this.servlets.stream().forEach( servlet -> {
            addServlet(container, servlet);
        });
    }

    private final void addServlet(ServletContext container, String name) {
        XmlWebApplicationContext context = new XmlWebApplicationContext();

        String servletFile = new StringBuilder("classpath:").append(name).append("-servlet.xml").toString();

        context.setConfigLocation(servletFile);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        ServletRegistration.Dynamic servlet = container.addServlet(name, dispatcherServlet);

        String mapping = new StringBuilder("/").append(name).append("/*").toString();

        servlet.addMapping(mapping);
        servlet.setLoadOnStartup(1);
    }

    private static final Function<String, String>  REPLACE_FILENAME = (fileName) -> {
        return fileName.replace("-servlet.xml", "");
    };

}
