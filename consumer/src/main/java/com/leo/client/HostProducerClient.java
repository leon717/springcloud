package com.leo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:8082", name = "HostProducerClient")
public interface HostProducerClient {

	@PostMapping(value = "/post", produces = MediaType.APPLICATION_JSON_VALUE)
	Object post(@RequestBody Object object);

}
