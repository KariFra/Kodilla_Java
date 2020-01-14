package excercise.two;

import java.time.LocalDateTime;

public class Flight {

    double distance;
    String startingTime;
    String landingTime;
    City cityOfDeparture;
    City cityOfArrival;
    City cityForChange;
    boolean changeDuringFlight;

    public Flight(double distance, String startingTime, String landingTime, City cityOfDeparture, City cityOfArrival, City cityForChange, boolean changeDuringFlight) {
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

    public City getCityOfDeparture() {
        return cityOfDeparture;
    }

    public City getCityOfArrival() {
        return cityOfArrival;
    }

    public City getCityForChange() {
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
        if (startingTime != null ? !startingTime.equals(flight.startingTime) : flight.startingTime != null)
            return false;
        if (landingTime != null ? !landingTime.equals(flight.landingTime) : flight.landingTime != null) return false;
        if (cityOfDeparture != flight.cityOfDeparture) return false;
        if (cityOfArrival != flight.cityOfArrival) return false;
        return cityForChange == flight.cityForChange;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(distance);
        result = (int) ( temp ^ ( temp >>> 32 ) );
        result = 31 * result + ( startingTime != null ? startingTime.hashCode() : 0 );
        result = 31 * result + ( landingTime != null ? landingTime.hashCode() : 0 );
        result = 31 * result + cityOfDeparture.hashCode();
        result = 31 * result + cityOfArrival.hashCode();
        result = 31 * result + cityForChange.hashCode();
        result = 31 * result + ( changeDuringFlight ? 1 : 0 );
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "distance=" + distance +
                ", startingTime='" + startingTime + '\'' +
                ", landingTime='" + landingTime + '\'' +
                ", cityOfDeparture=" + cityOfDeparture +
                ", cityOfArrival=" + cityOfArrival +
                ", cityForChange=" + cityForChange +
                '}';
    }
}

