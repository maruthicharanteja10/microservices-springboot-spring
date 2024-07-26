package com.restapi.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.restapi.binding.Passenger;
import com.restapi.binding.Ticket;
@Service
public class BookServiceImpl implements BookingService {
	private Map<Integer, Ticket> ticketMap = new HashMap<>();

	private int ticketNum = 1;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(530.0);
		t.setStatus("Confirmed");
		t.setTicketNum(ticketNum);
		ticketMap.put(ticketNum, t);
		ticketNum++;
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		if (ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		return null;
	}

}
