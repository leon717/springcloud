package com.leo.client;

import com.leo.client.hystrix.ProducerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "producer", fallback = ProducerHystrix.class)
public interface ProducerClient {

    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
