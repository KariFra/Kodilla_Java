package com.kodilla.exception.test;

public class FlightFindingTool {


    public void findFilght(Flight flight) throws RouteNotFoundException{
        if(flight != null) {
            System.out.println("The flight departs from " + flight.departureAirport + " and arrives to"+ flight.arrivalAirport);
        } else {
            throw new RouteNotFoundException("There is no flight with given departure and arrival sites");
        }

    }
}
