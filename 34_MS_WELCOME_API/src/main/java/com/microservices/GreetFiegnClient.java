package com.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MS-GREET-API")
public interface GreetFiegnClient {

	@GetMapping("/greet")
	public String invokGreetApi();

}
