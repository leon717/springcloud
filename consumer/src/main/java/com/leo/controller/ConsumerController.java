package com.leo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leo.client.OtherClient;
import com.leo.client.ProducerClient;

@RestController
public class ConsumerController {

    @Autowired
    ProducerClient producer;
    
    @Autowired
    OtherClient otherClient;
    
    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return producer.hello(name);
    }
    
    @GetMapping("/other")
    public String other() {
		return otherClient.info();
    }
}
