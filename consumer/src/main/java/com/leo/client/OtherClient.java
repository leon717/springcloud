package com.leo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name= "eureka-client")
public interface OtherClient {

	@PostMapping("/info")
	public String info();
}
