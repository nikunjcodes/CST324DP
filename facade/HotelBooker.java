// Code for the HotelBooker class
import java.util.*;
public class HotelBooker { 
    ArrayList<Hotel> hotels = new ArrayList<Hotel>();
    public void getHotelNamesFor(Date from, Date to) {
        for(Hotel hotel : hotels) {
            if(hotel.getCheckIn().after(from) && hotel.getCheckOut().before(to))
            System.out.println(hotel.getName());
        }
        // returns hotels available in the particular date range
    }
    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
}
