package com.restapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MakeMyTripService {

	@Value("${irctc.endpoint.book.ticket}")
	private String IRCTC_BOOK_TICKET_URL;

	@Value("${irctc.endpoint.get.ticket}")
	private String IRCTC_GET_TICKET_URL;

	public void getTicketInfoSync(String ticketId) {

		System.out.println("Sync - method started....");

		WebClient client = WebClient.create();

		String response = client.get().uri(IRCTC_GET_TICKET_URL, ticketId).accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToMono(String.class).block(); // wait for response

		System.out.println(response);

		System.out.println("Sync - method ended....");
	}

	public void getTicketAsync(String ticketId) {

		System.out.println("Async method execution started.....");

		WebClient client = WebClient.create();

		client.get().uri(IRCTC_GET_TICKET_URL, ticketId).accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToMono(String.class).subscribe(response -> handleResponse(response));

		System.out.println("Async method execution ended.....");
	}

	public void handleResponse(String response) {
		System.out.println(response);
	}
	//To send Request Header and Body using WebClient
//	
//	public Ticket bookTicket(Passenger passenger) {
//		// get the instance of webclient (impl class)
//		WebClient webClient = WebClient.create();
//		// send POST request with passenger data 
//		//and map response to Ticket Obj
//		Ticket ticket = webClient.post()
//		.uri(BOOK_TICKET_URL)
//		.header("Accept", "application/json")
//		.bodyValue(passenger)
//		.retrieve()
//		.bodyToMono(Ticket.class)
//		.block();
//		return ticket;
//		public static void handleResponse(String response) {
//			System.out.println(response);
//		}
}
