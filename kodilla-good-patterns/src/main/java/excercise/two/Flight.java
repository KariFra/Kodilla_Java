package excercise.two;

import java.time.LocalDateTime;

public class Flight {

    double distance;
    String startingTime;
    String landingTime;
    String cityOfDeparture;
    String cityOfArrival;
    String cityForChange;
    boolean changeDuringFlight;

    public Flight(double distance, String startingTime, String landingTime, String cityOfDeparture, String cityOfArrival, String cityForChange, boolean changeDuringFlight) {
        this.distance = distance;
        this.startingTime = startingTime;
        this.landingTime = landingTime;
        this.cityOfDeparture = cityOfDeparture;
        this.cityOfArrival = cityOfArrival;
        this.cityForChange = cityForChange;
        this.changeDuringFlight = changeDuringFlight;
    }

    public double getDistance() {
        return distance;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public String getLandingTime() {
        return landingTime;
    }

    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public String getCityForChange() {
        return cityForChange;
    }

    public boolean isChangeDuringFlight() {
        return changeDuringFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (Double.compare(flight.distance, distance) != 0) return false;
        if (changeDuringFlight != flight.changeDuringFlight) return false;
        if (!startingTime.equals(flight.startingTime)) return false;
        if (!landingTime.equals(flight.landingTime)) return false;
        if (!cityOfDeparture.equals(flight.cityOfDeparture)) return false;
        if (!cityOfArrival.equals(flight.cityOfArrival)) return false;
        return cityForChange.equals(flight.cityForChange);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(distance);
        result = (int) ( temp ^ ( temp >>> 32 ) );
        result = 31 * result + startingTime.hashCode();
        result = 31 * result + landingTime.hashCode();
        result = 31 * result + cityOfDeparture.hashCode();
        result = 31 * result + cityOfArrival.hashCode();
        result = 31 * result + cityForChange.hashCode();
        result = 31 * result + ( changeDuringFlight ? 1 : 0 );
        return result;
    }
}
