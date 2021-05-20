package com.taxi.ticket.service;

import com.taxi.ticket.model.Ticket;

public interface TicketService {


	public  Ticket getTicket(final String source, final String destination, final int numberOfTravellers) throws Exception;}
