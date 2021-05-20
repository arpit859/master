package com.taxi.ticket.app;

import com.taxi.ticket.model.Ticket;
import com.taxi.ticket.service.TicketPrinterService;
import com.taxi.ticket.service.TicketService;
import com.taxi.ticket.service.impl.TicketPrinterServiceImpl;
import com.taxi.ticket.service.impl.TicketServiceImpl;

public class TaxiTicketSystemApp {

	public static void main(String[] args) throws Exception {
		
		TicketService ticketService = new TicketServiceImpl();
		Ticket ticket = ticketService.getTicket("Mumbai", "Pune", 1);
		TicketPrinterService printer = new TicketPrinterServiceImpl();
		printer.printTicket(ticket);
	}

}
