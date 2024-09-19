import java.util.Date;
public class Flight {
    int id;
    String name;
    String source;
    String destination;
    int price;
    Date departureDate;
    Date arrivalDate;
    public Flight(int id, String name, String source, String destination, int price , Date deprartureDate , Date arrivalDate) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.arrivalDate = arrivalDate;
        this.departureDate = deprartureDate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public int getPrice() {
        return price;
    }
    public Date getDepartureDate() {
        return departureDate;
    }
    public Date getArrivalDate() {
        return arrivalDate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Flight [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination + ", price=" + price + "]";
    }
    
}
