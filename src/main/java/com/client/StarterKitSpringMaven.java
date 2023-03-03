package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(value = "com.client")
public class StarterKitSpringMaven {

    public static void main(String[] args) {
        SpringApplication.run(StarterKitSpringMaven.class, args);
    }

}
