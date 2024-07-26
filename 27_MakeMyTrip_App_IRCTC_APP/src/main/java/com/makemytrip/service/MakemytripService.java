package com.makemytrip.service;

import org.springframework.stereotype.Service;

import com.makemytrip.binding.Passenger;
import com.makemytrip.binding.Ticket;

@Service
public interface MakemytripService {
	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicketByNum(Integer ticketNumber);
}
