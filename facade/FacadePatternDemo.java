import java.util.Date;
public class FacadePatternDemo {
    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();
        facade.getFlightsAndHotels(new Date(), new Date());
    }
    
}
