package excercise.two;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityCheck {



    FlightTimetable flightTimetable = new FlightTimetable();
    ArrayList<Flight> timetable = flightTimetable.timetable;

    public ArrayList<Flight> prepareSearchList(){
        timetable = flightTimetable.fillTheTimetable();
        return timetable;
    }

    public List<Flight> findPossibleArrivals(City customerInputArrival){
        List<Flight> possibleArrivals = timetable.stream()
                .filter(l->l.getCityOfArrival().equals(customerInputArrival))
                .collect(Collectors.toList());
        if (possibleArrivals.size() == 0) {
            System.out.println("There are no flights to the city you have chosen.");
            return possibleArrivals;
        } else {
            return possibleArrivals;
        }
    }

    public List<Flight> findPossibleDepartures(City customerInputDeparture){
        List<Flight> possibleDepartures = timetable.stream()
                .filter(l->l.getCityOfDeparture().equals(customerInputDeparture))
                .collect(Collectors.toList());
        if (possibleDepartures.size() == 0) {
            System.out.println("There are no flights from the city you have chosen.");
            return possibleDepartures;
        } else {
            return possibleDepartures;
        }
    }

    public void checkerOfExistingChanges(City customerInputChange){
        if(customerInputChange.equals(City.KRAKOW) || customerInputChange.equals(City.WARSAW)){
            timetable.stream()
                    .filter(f -> f.cityForChange.equals(customerInputChange))
                    .forEach(System.out::println);
        } else {
            System.out.println("There are no changes in this city."+ new ArrayList<>());


        }

    }


}
