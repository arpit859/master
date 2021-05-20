package com.taxi.ticket.model;

import java.util.Arrays;
import java.util.List;

public class Route {

	private String fromCity;
	private String toCity;
	private int distance;

	public Route(String fromCity, String toCity, int distance) {
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.distance = distance;
	}
	
	

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public final static List<Route> initializeRoutes() {
		return Arrays.asList(new Route("Pune", "Mumbai", 120), new Route("Pune", "Nasik", 200),
				new Route("Mumbai", "Goa", 350), new Route("Mumbai", "Nasik", 180));
	}
}
