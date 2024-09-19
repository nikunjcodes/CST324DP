import java.util.Date;
public class TravelFacade {
    HotelBooker hotelBooker = new HotelBooker();
    FlightBooker flightBooker = new FlightBooker();
    Flight f1 = new Flight(1, "Indigo", "Bangalore", "Delhi", 5000 , new Date() , new Date());
    Flight f2 = new Flight(2, "Air India", "Bangalore", "Mumbai", 4000, new Date() , new Date());
    Flight f3 = new Flight(3, "SpiceJet", "Bangalore", "Chennai", 3000, new Date() , new Date());
    Hotel h1 = new Hotel(1,"Taj","Delhi", new Date(), new Date(),40000);
    Hotel h2 = new Hotel(2, "Leela", "Mumbai", new Date(), new Date() , 20000);
    Hotel h3 = new Hotel(3, "Park", "Chennai", new Date(), new Date(), 10000);
    public TravelFacade() {
        flightBooker.addFlight(f1);
        flightBooker.addFlight(f2);
        flightBooker.addFlight(f3);
        hotelBooker.addHotel(h1);
        hotelBooker.addHotel(h2);
        hotelBooker.addHotel(h3);
    }
    public void getFlightsAndHotels(Date from, Date to) {
        hotelBooker.getHotelNamesFor(from, to);
        flightBooker.getFlightsFor(from, to);
    }
    
}
