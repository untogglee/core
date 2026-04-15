package com.untogglee.core.app.config;

import com.untogglee.core.app.config.properties.DocsProperties;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    private static final String SECURITY_SCHEME_NAME = "bearerAuth";

    @Bean
    public OpenAPI customOpenAPI(DocsProperties docsProperties) {
        return new OpenAPI()
                .addServersItem(new Server().url(docsProperties.serverUrl()));
    }

}
