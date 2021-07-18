package com.leo.client.hystrix;

import org.springframework.stereotype.Component;

import com.leo.client.ProducerClient;

@Component
public class ProducerHystrix implements ProducerClient {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this message send failed ";
    }

}
