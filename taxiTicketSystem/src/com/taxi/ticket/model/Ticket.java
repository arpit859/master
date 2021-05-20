package com.taxi.ticket.model;

public class Ticket {

	private String source;
	private String destination;
	private int distance;
	private int numberOfTravellers;
	private int ticketAmount;
	
	public Ticket() {
		
	}
	
	public Ticket(String source, String destination, int distance, int numberOfTravellers, int ticketAmount) {
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.numberOfTravellers = numberOfTravellers;
		this.ticketAmount = ticketAmount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getNumberOfTravellers() {
		return numberOfTravellers;
	}

	public void setNumberOfTravellers(int numberOfTravellers) {
		this.numberOfTravellers = numberOfTravellers;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
}
