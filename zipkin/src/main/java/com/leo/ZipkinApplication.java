package com.leo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer	// http://localhost:9411
@SpringBootApplication
public class ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
