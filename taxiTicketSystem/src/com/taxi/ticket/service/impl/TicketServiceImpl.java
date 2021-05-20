package com.taxi.ticket.service.impl;

import java.util.List;
import java.util.function.Predicate;

import com.taxi.ticket.model.Route;
import com.taxi.ticket.model.Ticket;
import com.taxi.ticket.service.TicketService;

public class TicketServiceImpl implements TicketService {

	private List<Route> routesList;

	public TicketServiceImpl() {
		this.routesList = Route.initializeRoutes();
	}

	@Override
	public final Ticket getTicket(final String source, final String destination, final int numberOfTravellers) throws Exception {
		if(source != null && destination != null && numberOfTravellers > 0 && !source.equalsIgnoreCase(destination)) {
		Route route = routesList.stream().filter(routePredicate(source, destination)).findFirst()
				.orElseThrow(() -> new Exception("Ticket is not available for this route.."));

		return new Ticket(source, destination, route.getDistance(), numberOfTravellers,
				calulateTicketAmount(route, numberOfTravellers));
		} else {
			throw new Exception("Please check source, destination and passenger.");
		}
	}

	private Predicate<Route> routePredicate(String source, String destination) {
		Predicate<Route> routePredicate = r -> (r.getFromCity().equalsIgnoreCase(source)
				|| r.getFromCity().equalsIgnoreCase(destination))
				&& (r.getToCity().equalsIgnoreCase(source) || r.getToCity().equalsIgnoreCase(destination));

		return routePredicate;
	}

	private int calulateTicketAmount(Route route, int numberOfTravellers) {
		int ticketValue = 0;
		if (route.getDistance() > 100) {
			ticketValue = 750 + (route.getDistance() - 100) * 5;
		} else if (route.getDistance() == 100 || route.getDistance() < 100) {
			ticketValue = 750;
		}

		return ticketValue * numberOfTravellers;
	}

}
