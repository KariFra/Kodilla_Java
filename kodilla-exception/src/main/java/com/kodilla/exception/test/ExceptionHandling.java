package com.kodilla.exception.test;



public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
       try{ secondChallenge.probablyIWillThrowException(3,1.5);}
       catch(Exception e) {System.out.println("There was some problem...");}

        Flight flight = null;

        FlightFindingTool flightFindingTool = new FlightFindingTool();
        try {
            flightFindingTool.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no flight for requested locations");
        }
        System.out.println("Go with a bike!");


    }
}
