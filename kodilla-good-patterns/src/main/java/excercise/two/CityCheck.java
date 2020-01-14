package excercise.two;


import java.util.List;
import java.util.stream.Collectors;

public class CityCheck {



    FlightTimetable flightTimetable = new FlightTimetable();

    public List<Flight> findPossibleArrivals(City customerInputArrival){
        List<Flight>  possibilitiesForArrival = flightTimetable.fillTheTimetable().stream()
                .filter(l->l.getCityOfArrival().equals(customerInputArrival))
                .collect(Collectors.toList());
        return possibilitiesForArrival;

    }
    public List<Flight> findPossibleDepartures(City customerInputDeparture){
        List<Flight> possibilitiesForDeparture = flightTimetable.fillTheTimetable().stream()
                .filter(l->l.getCityOfArrival().equals(customerInputDeparture))
                .collect(Collectors.toList());
        return possibilitiesForDeparture;

    }
    public List<Flight> checkerOfExistingChanges(City customerInputChange){
        if(!customerInputChange.equals(City.KRAKOW) ||!customerInputChange.equals(City.WARSAW)){
            System.out.println("There are no changes in this city.");
            return null;
        } else {
            List<Flight> exsistingChanges = flightTimetable.fillTheTimetable().stream()
                    .filter(f -> f.cityForChange.equals(customerInputChange))
                    .collect(Collectors.toList());
            return exsistingChanges;
        }

    }


}
