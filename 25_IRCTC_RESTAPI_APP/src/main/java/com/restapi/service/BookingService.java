package com.restapi.service;

import com.restapi.binding.Passenger;
import com.restapi.binding.Ticket;

public interface BookingService {
	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicket(Integer ticketNumber);
}
