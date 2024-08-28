public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost , User user) throws Exception {
        System.out.println(user.getName()+ " is Connecting to " + serverHost);
    }
    
}
