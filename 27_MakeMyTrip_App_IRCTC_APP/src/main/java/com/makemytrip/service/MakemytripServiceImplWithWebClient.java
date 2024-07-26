package com.makemytrip.service;

import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;

import com.makemytrip.binding.Passenger;
import com.makemytrip.binding.Ticket;

@Service
public class MakemytripServiceImplWithWebClient implements MakemytripService {
	private String BOOK_TICKET_URL = "http://13.232.253.164:8080/ticket";
	private String GET_TICKET_URL = "http://13.232.253.164:8080/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {
		// get the instance of webclient (impl class)
		WebClient webClient = WebClient.create();
		// send POST request with passenger data
		// and map response to Ticket Obj
		Ticket ticket = webClient.post().uri(BOOK_TICKET_URL).bodyValue(passenger).retrieve()
				.bodyToMono(Ticket.class)
				.block();
		return ticket;
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
		// get the instance of webclient (impl class)
		WebClient webClient = WebClient.create();
		// Send get request and map response to Ticket Obj
		Ticket ticket = webClient.get().uri(GET_TICKET_URL, ticketNumber).retrieve().bodyToMono(Ticket.class).block(); // sync
																														// call
		return ticket;
	}

}
