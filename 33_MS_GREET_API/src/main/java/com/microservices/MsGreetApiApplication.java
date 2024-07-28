package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsGreetApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsGreetApiApplication.class, args);
	}

}
