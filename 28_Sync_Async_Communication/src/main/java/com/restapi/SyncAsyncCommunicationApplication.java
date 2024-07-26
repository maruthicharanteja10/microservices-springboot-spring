package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SyncAsyncCommunicationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SyncAsyncCommunicationApplication.class, args);
		MakeMyTripService bean = context.getBean(MakeMyTripService.class);
		// bean.getTicketInfoSync("161");
		bean.getTicketAsync("161");
	}

}
