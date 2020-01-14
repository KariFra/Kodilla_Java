package excercise.two;

import java.util.ArrayList;


public class FlightTimetable {

    ArrayList<Flight> timetable = new ArrayList<>();

    public ArrayList<Flight> fillTheTimetable(){
        timetable.add(new Flight(955.20, "8.20","9.30","STUTTGART","WARSAW","",false));
        timetable.add(new Flight(1000.20, "9.20","10.30","STUTTGART","WARSAW","KRAKOW",true));
        timetable.add(new Flight(955.20, "10.20","11.30","STUTTGART","WARSAW", "",false));
        timetable.add(new Flight(500.00, "11.20","12.30","GDANSK","WARSAW","KRAKOW",true));
        timetable.add(new Flight(700.25, "12.20","13.30","GDANSK","KRAKOW","",false));
        timetable.add(new Flight(650.00, "13.20","14.30","STUTTGART","KRAKOW","",false));
        timetable.add(new Flight(955.20, "14.20","15.30","STUTTGART","KRAKOW","WARSAW",true));
    return timetable;
    }



}
