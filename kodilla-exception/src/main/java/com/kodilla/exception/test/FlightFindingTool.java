package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFindingTool {


    public void findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        if (flights.size() != 0) {
            if (flights.containsKey(flight.arrivalAirport) && flights.containsKey(flight.departureAirport)) {
                System.out.println("The flight departs from " + flight.departureAirport + " and arrives to" + flight.arrivalAirport);
            } else {
                throw new RouteNotFoundException("There is no flight with given departure and arrival sites");
            }

        }
    }
}
