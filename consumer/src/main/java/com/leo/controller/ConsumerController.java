package com.leo.controller;

import com.leo.client.HostClient;
import com.leo.client.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ProducerClient producerClient;

    @Autowired
    HostClient hostClient;

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/hello")
    public String hello() {
        return producerClient.hello(appName);
    }

    @GetMapping("/hello2")
    public String hello2() {
        return producerClient.hello2(appName);
    }

    @GetMapping("/host")
    public String host() {
        return hostClient.get();
    }
}
