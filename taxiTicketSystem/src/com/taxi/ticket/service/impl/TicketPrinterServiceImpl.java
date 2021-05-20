package com.taxi.ticket.service.impl;

import com.taxi.ticket.model.Ticket;
import com.taxi.ticket.service.TicketPrinterService;

public class TicketPrinterServiceImpl implements TicketPrinterService {


	@Override
	public void printTicket(final Ticket ticket) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Taxi Ticket");
		sb.append("\n");
		sb.append("-----------");
		sb.append("\n");
		sb.append("Source: "+ ticket.getSource());
		sb.append("\n");
		sb.append("Destination: " + ticket.getDestination());
		sb.append("\n");
		sb.append("Kms: "+ticket.getDistance());
		sb.append("\n");
		sb.append("No. of travellers = "+ticket.getNumberOfTravellers());
		sb.append("\n");
		sb.append("Total = "+ticket.getTicketAmount() +" INR");
		
		System.out.println(sb);
	}
}
