package com.leo.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("hello")
	public String hello(String name){
		return "hello "+name+"!";
	}
	
	@PostMapping("post")
	public Object post(@RequestBody Map<String, Object> paramMap) {
		return paramMap;
	}
	
	//only for zuul retry test
	@GetMapping("zuul")
	public String index(String name) {
	    logger.info("request two name is "+name);
	    try{
	        Thread.sleep(1000000);
	    }catch ( Exception e){
	        logger.error(" hello two error ",e);
	    }
	    return "hello "+name+"，this is two messge";
	}

}
