public class User {
    boolean hasInternetAccess = false;
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isHasInternetAccess() {
        return hasInternetAccess;
    }
    public void setHasInternetAccess(boolean hasInternetAccess) {
        this.hasInternetAccess = hasInternetAccess;
    }
    public void payForInternet(){
        this.hasInternetAccess = true;
        System.out.println("The user has paid for the internet");
    }
    
}
