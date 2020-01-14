package excercise.two;

import java.util.ArrayList;


public class FlightTimetable {

    ArrayList<Flight> timetable = new ArrayList<>();

    public ArrayList<Flight> fillTheTimetable(){
        timetable.add(new Flight(955.20, "8.20","9.30",City.STUTTGART,City.WARSAW,City.NONE,false));
        timetable.add(new Flight(1000.20, "9.20","10.30",City.STUTTGART,City.WARSAW,City.KRAKOW,true));
        timetable.add(new Flight(955.20, "10.20","11.30",City.STUTTGART,City.WARSAW, City.NONE,false));
        timetable.add(new Flight(500.00, "11.20","12.30",City.GDANSK,City.WARSAW,City.KRAKOW,true));
        timetable.add(new Flight(700.25, "12.20","13.30",City.GDANSK,City.KRAKOW,City.NONE,false));
        timetable.add(new Flight(650.00, "13.20","14.30",City.STUTTGART,City.KRAKOW,City.NONE,false));
        timetable.add(new Flight(955.20, "14.20","15.30",City.STUTTGART,City.KRAKOW,City.WARSAW,true));
    return timetable;
    }



}
