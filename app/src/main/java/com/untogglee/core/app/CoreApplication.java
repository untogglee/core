package com.untogglee.core.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CoreApplication {

    static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

}
