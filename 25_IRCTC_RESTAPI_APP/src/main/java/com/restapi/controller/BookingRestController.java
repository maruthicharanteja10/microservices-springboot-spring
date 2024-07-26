package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.binding.Passenger;
import com.restapi.binding.Ticket;
import com.restapi.service.BookingService;

@RestController
public class BookingRestController {
	@Autowired
	private BookingService service;

	@PostMapping(value = "/ticket", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger) {
		Ticket ticket = service.bookTicket(passenger);
		System.out.println(ticket);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{ticketnum}", produces = { "application/json" })
	public Ticket gettingTicket(@PathVariable Integer ticketnum) {
		Ticket ticket = service.getTicket(ticketnum);
		return ticket;
	}
}
