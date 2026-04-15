package com.untogglee.core.app.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "common.docs")
public record DocsProperties(
        String serverUrl
) {
}
