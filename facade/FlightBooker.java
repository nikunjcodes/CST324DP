import java.util.ArrayList;
import java.util.Date;
public class FlightBooker {
    ArrayList<Flight> flights = new ArrayList<Flight>();
    public FlightBooker(){

    }
    public void getFlightsFor(Date from, Date to) {
        for(Flight flight : flights) {
            // if(flight.getDepartureDate().after(from) && flight.getArrivalDate().before(to))
            System.out.println(flight.getName());
        }
    }
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    
}
