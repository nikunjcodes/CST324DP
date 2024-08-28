public class Main {
    public static void main(String[] args) {
        User user = new User("Nikunj");
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com"  , user);
            // user.payForInternet();
            // internet.connectTo("abc.com" , user);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        user.payForInternet();
        try{
            internet.connectTo("google.com"  , user);
        internet.connectTo("abc.com" , user);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
