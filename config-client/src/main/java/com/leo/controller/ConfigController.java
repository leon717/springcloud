package com.leo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope		//使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中，通过/refresh请求（POST）刷新	
@RestController
public class ConfigController {

    @Value("${test}")
    private String test;
    
	@GetMapping("/config")
	public String hello(){
		return test;
	}
}
