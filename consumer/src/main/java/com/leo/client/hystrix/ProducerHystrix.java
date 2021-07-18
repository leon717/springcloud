package com.leo.client.hystrix;

import com.leo.client.ProducerClient;
import org.springframework.stereotype.Component;

@Component
public class ProducerHystrix implements ProducerClient {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this message send failed ";
    }

    @Override
    public String hello2(String name) {
        return "hello2 " + name + ", this message send failed ";
    }
}
