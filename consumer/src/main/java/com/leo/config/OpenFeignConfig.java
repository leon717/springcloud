package com.leo.config;

import feign.Logger.Level;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenFeignConfig {

    @Bean
    public RequestInterceptor feignInterceptor() {
        return template -> template.header("traceId", "traceId");
    }

    @Bean
    public Level feignLoggerLevel() {
        return Level.BASIC;
    }
}
