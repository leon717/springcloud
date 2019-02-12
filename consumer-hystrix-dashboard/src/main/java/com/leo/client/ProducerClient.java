package com.leo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leo.client.hystrix.ProducerHystrix;

@FeignClient(name= "producer", fallback = ProducerHystrix.class)
public interface ProducerClient {
	
    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
