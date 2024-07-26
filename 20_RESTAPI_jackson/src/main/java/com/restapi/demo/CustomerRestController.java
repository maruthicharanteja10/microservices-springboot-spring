package com.restapi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	@GetMapping("/")
	public Customer getCustomer() {
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");
		Customer c = new Customer();
		c.setId(1);
		c.setName("Robert");
		c.setEmail("robert@gmail.com");
		c.setPhno(76413132l);
		c.setAddr(addr);
		return c;
	}
}
