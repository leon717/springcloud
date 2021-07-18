package com.leo.config;

import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenFeignConfig {

    @Bean
    public Level feignLoggerLevel() {
        return Level.BASIC;
    }
}
