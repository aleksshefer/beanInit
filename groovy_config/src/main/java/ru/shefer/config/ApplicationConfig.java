package ru.shefer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath*:applicationConfig.groovy")
public class ApplicationConfig {
}
