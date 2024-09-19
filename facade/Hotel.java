import java.util.Date;
public class Hotel {
    int id;
    String name;
    String city;
    Date checkIn;
    Date checkOut;
    int price;
    public Hotel(int id, String name, String city, Date checkIn, Date checkOut, int price) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    public int getPrice() {
        return price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", price=" + price + "]";
    }
}
