package com.leo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Autowired
    DiscoveryClient discoveryClient;
    
	@GetMapping("/info")
	public String info(){
		return "Services: " + discoveryClient.getServices();
	}
}
