// Flight.java
import java.util.List;

public class Flight {
    private String flightNumber;
    private String destination;
    private Airplane airplane;
    private List<Passenger> passengers;

    public Flight(String flightNumber, String destination, Airplane airplane, List<Passenger> passengers) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airplane = airplane;
        this.passengers = passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Рейс " + flightNumber + " → " + destination + " | " + airplane.getModel();
    }
}
 
