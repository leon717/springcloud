package com.leo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hostClient", url = "https://www.baidu.com")
public interface HostClient {

    @GetMapping(value = "/")
    String get();

}
